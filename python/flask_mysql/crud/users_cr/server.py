from flask import Flask, render_template, request
from mysqlconnection import connectToMySQL
app = Flask(__name__)

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


if __name__ == "__main__":
    app.run(debug=True)