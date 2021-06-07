from flask import Flask, render_template, request, redirect, session, flash
from mysqlconnection import connectToMySQL
app = Flask(__name__)

@app.route('/email')
def add_email():
    return render_template('index.html')
    print(request.form)

@app.route('/email', methods=['POST'])
def add_email_to_db():
        is_valid = True 
        if len(request.form['email']) < 3:
            is_valid = False
            flash("Invalid Email!")

        if not is_valid:
            return redirect("/email")
        
        else:
            query = "INSERT INTO emails (email, created_at, updated_at) VALUES (%(em)s, NOW(), NOW())"

            data = {
                'em' : request.form['email']
            }
            db = connectToMySQL('emails')
            db.query_db(query,data)
            dbemails = connectToMySQL('emails')
            emails = dbemails.query_db('SELECT * FROM emails')



        print(request.form)
        return render_template("success.html", all_emails = emails)

if __name__=="__main__":
    app.run(debug=True)