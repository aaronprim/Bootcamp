from flask import Flask, render_template, request, redirect, session
import random
app = Flask(__name__)
app.secret_key = "numgame"

@app.route("/")
def number_game():
    number_guess = random.randrange(0,101)
    if "guess" not in session:
        session["guess"]= number_guess
    return render_template("index.html")

@app.route("/check", methods=['POST'])
def check_guess():
    user_guess = int(request.form["input_guess"])
    random= session['guess']
    text= ""
    

    if user_guess == random:
        text= "Great Guess!"
        session.clear()
        return render_template(index.html, text=text)

    if user_guess >= random:
        text= "Sorry, too high!"
        session.clear()
        return render_template(index.html, text=text)

    if user_guess <= random:
        text = "Sorry, too low!"
        session.clear()
        return render_template("index.html", text= text)

if __name__=="__main__":
    app.run(debug=True) 