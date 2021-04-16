from flask import Flask, render_template, request, redirect
from mysqlconnection import connectToMySQL
app = Flask(__name__)

@app.route("/show/<int:user_id>")
def showsql(user_id):
    query = "SELECT * FROM users WHERE id = %(id)s;"
    data = {
        'id' : user_id
    }
    users = connectToMySQL("users_schema").query_db(query,data)
    print(users)
    return render_template( "Read(ONE).html", users = users) 
    
@app.route('/users')
def index():
    mysql = connectToMySQL("users_schema")
    users = mysql.query_db("SELECT * FROM users;")
    print(users)
    return render_template("Read (ALL).html", all_users = users)


@app.route("/users/new/")
def add():
    return render_template("Create.html")
    print(request.form)

@app.route("/users/new/", methods=["POST"])
def add_user_to_db():
    query = "INSERT INTO users (first_name, last_name, email, created_at, updated_at) VALUES (%(fn)s, %(ln)s, %(em)s, NOW(), NOW() )"
    data = { 
        'fn': request.form['fname'],
        'ln': request.form['lname'],
        'em': request.form['email'],
        }
    db = connectToMySQL('users_schema')
    db.query_db(query,data)
    dbusers = connectToMySQL('users_schema')
    users = dbusers.query_db("SELECT * FROM users;")
    print(request.form)
    return render_template("Read (ALL).html", all_users = users)

@app.route("/delete/<int:user_id>")
def delete(user_id):
    query = "DELETE FROM users WHERE id =%(id)s;"
    data = {
        'id': user_id
    }
    delete = connectToMySQL('users_schema').query_db(query,data)
    return redirect('/users')

@app.route('/edit/<int:user_id>')
def edit(user_id):
    query = "SELECT * FROM users WHERE id = %(id)s;"
    data = {
        'id' : user_id
    }
    user = connectToMySQL('users_schema').query_db(query,data)
    return render_template("edit.html", user=user[0])

@app.route('/editor/<int:user_id>')
def editor(user_id):
    query = "UPDATE users SET (first_name = %(fn)s, last_name = %(ln)s, email = %(em)s, updated_at = NOW () HERE id = %(id)s;"
    data = {
        'fn': request.form["fname"],
        'ln': request.form["lname"],
        'em': request.form["email"],
        'id': user_id
    }
    user = connectToMySQL('users_schema').query_db(query,data)

    return render_template("edit.html",user=user)




if __name__ == "__main__":
    app.run(debug=True)