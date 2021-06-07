from flask import Flask, render_template, request, redirect
from mysqlconnection import connectToMySQL
app = Flask(__name__)

@app.route('/dojos') # show dojos on main page and add new dojo 
def dojos():
    db= connectToMySQL("dojos_and_ninjas_schema")
    dojos = db.query_db("SELECT * FROM dojos")
    return render_template("dojos.html", dojos = dojos)

    print("hello")


@app.route('/dojos') # add dojo
def add_dojo():
    query = "INSERT INTO dojos (name, created_at,updated_at) VALUES (%(name)s, NOW(), NOW() )"
    data = {
        'name': request.form['dojoname']
    }
    db= connectToMySQL("dojos_and_ninjas_schema")
    db.query_db(query,data)
    dbdojos = connectToMySQL("dojos_and_ninjas_schema")
    dojos = dbdojos.query_db("SELECT * FROM dojos")
    print(request.form)
    return render_template("dojos.html", dojos = dojos)


@app.route('/ninjas', methods=["POST"]) # add ninja
def add_ninja():
    query = "INSERT INTO users (first_name, last_name, age, created_at, updated_at) VALUES (%(fn)s, %(ln)s, %(age)s, NOW(), NOW() )"

    data = { 
        'fn': request.form['first_name'],
        'ln': request.form['last_name'],
        'age': request.form['age'],
    }

    db = connectToMySQL('dojos_and_ninjas_schema')
    db.query_db(query,data)
    dbninjas = connectToMySQL('dojos_and_ninjas_schema')
    ninjas = dbninjas.query_db("SELECT * FFROM ninjas")

    return redirect('/dojo')

@app.route("/dojos/<int:dojo_id>")
def show_dojo(dojo_id):
    query = "SELECT * FROM ninjas JOIN ninjas on dojos.id = ninjas.dojo_id WHERE dojos.id = %(id)s;"
    data = {
        'id': request.form['dojo_id']
    }

    dojos = connectToMySQL("dojos_and_ninjas_schema".query_db)
    print(dojos)
    return render_template('one_dojo.html', dojos=dojos)

if __name__ == "__main__":
    app.run(debug=True)


