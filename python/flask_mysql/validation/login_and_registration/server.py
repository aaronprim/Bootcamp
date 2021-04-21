import re

from flask import Flask, flash, redirect, render_template, request, session
from flask_bcrypt import Bcrypt

from mysqlconnection import connectToMySQL

app = Flask(__name__)
app.secret_key = "landr"
bcrypt = Bcrypt(app)
EMAIL_REGEX = re.compile(r'^[a-zA-Z0-9.+_-]+@[a-zA-Z0-9._-]+\.[a-zA-Z]+$')
NAME_REGEX = re.compile(r'^[a-zA-Z]+$')

@app.route('/') # loads home page
def homepage():
    if 'id' not in session: 
        session['id'] = False
    if 'first_name' not in session:
        session['first_name'] = None

    return render_template('login_register.html')

@app.route('/validate_registration', methods= ['POST'])
def validation():
    error = False
    mysql= connectToMySQL('login_and_registration')
    query = "SELECT * FROM users WHERE email = %(email)s"
    data = {
        "email" : request.form['email']
    }
    validate = mysql.query_db(query,data)

    if len(request.form['first_name']) == 0 or len(request.form['last_name']) == 0 or len(request.form['password']) == 0 or len(request.form['confirm_password'])==0:
        flash("All fields are required to continue!", 'top') #validates there are entries #
        error = True

    else:
        if not NAME_REGEX.match(request.form['first_name']):
            flash('Please use only alphabetical characters in the listed name','first_name')
            error = True # validates only letters #
        
        if len(request.form['first_name']) < 1:
            flash("Please check input in: First Name", 'first_name') #checks length#
        
        if not NAME_REGEX.match(request.form['last_name']):
            flash('Please use only alphabetical characters in the listed name','last_name')
            error = True #validates only letters#
        
        if len(request.form['last_name']) < 1:
            flash("Please check input in: Last Name", 'last_name') #checks length#
            
        if len(request.form['password']) < 8: 
            flash('Password must be at least 8 characters', 'password') #checks length#

        if validate:
            if validate[0]['email'] == request.form['email']:
                flash('Email already in use','email')
                error=True #checks if email in registration form is already in use#

        if not EMAIL_REGEX.match(request.form['email']):
            flash('Invalid email, please double check', 'email')
            error = True # checks if email is in valid format#
        
            flash('Passwords do not match!','password') #checks passwords entered match#
        if request.form['password'] != request.form['confirm_password']:
            error = True 

    if error == True:
        return redirect('/')

    elif error == False:
        hash_password = bcrypt.generate_password_hash(request.form['password'])
        mysql = connectToMySQL('login_and_registration')
        query = 'INSERT INTO users (first_name, last_name, email, password, created_at, updated_at) VALUES (%(fn)s, %(ln)s, %(em)s, %(pass)s, NOW(), NOW() );'

        data= {
            "fn": request.form['first_name'],
            "ln": request.form['last_name'],
            "em": request.form["email"],
            "pass": hash_password
        }
        mysql.query_db(query, data)
        flash('Registration complete! Thank you for registering, please log in', 'success')
        return redirect('/')

@app.route('/validate_login', methods= ["POST"])
def val_log():
    mysql= connectToMySQL('login_and_registration')
    query = "SELECT * FROM users WHERE email = %(email)s"
    data = {
        'email': request.form['email']
    }
    validate = mysql.query_db(query, data)

    if validate:

        if validate[0]['email'] == request.form['email']:
            if bcrypt.check_password_hash(validate[0]['password'], request.form['password']):
                session['id'] = True
                session['first_name'] = validate[0]['first_name']
                return redirect('/homepage')
            else: 
                flash ('Incorrect Username/Password. Please try again', 'login_top')
                return redirect('/')

    else:
        flash('Incorrect Username/Password. Please try again', 'login_top')
        return redirect('/')

@app.route('/homepage')
def index():
    if session['id'] == True :
        return render_template('home.html')
    else: 
        return redirect('/')

@app.route('/logout')
def logout():

    session.clear()
    return redirect('/')

if __name__=="__main__":
    app.run(debug=True) 
