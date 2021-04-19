from flask import Flask, render_template, request, redirect, session
import random 
import datetime
app = Flask(__name__)
app.secret_key = "ninjagold"

@app.route("/") # starts game
def gamestart():

    if "gold" not in session:
        session["gold"] = 0

    if "activity_log" not in session:
        session["activity_log"] = []

    gold_found = session["gold"]

    log_of_gold= session["activity_log"]

    return render_template("index.html", activity_log = log_of_gold, gold = gold_found)


@app.route("/process_money", methods=["POST"]) 
def gold_rush():
    
    if request.form["button"] == "farm":
        print('hello')
        amt_gold = random.randrange(10,21)
        now = datetime.datetime.now()
        log = "<p class=text_log> Congrats you've earned %s gold %s </p>" %(str(amt_gold),now) 
        session["activity_log"].append(log)
        session.modified = True
        session["gold"] += amt_gold

    elif request.form["button"] == "cave":
        amt_gold = random.randrange(5,11)
        now = datetime.datetime.now()
        log = "<p class=text_log> Congrats you've earned %s gold %s </p>" %(str(amt_gold),now) 
        session["activity_log"].append(log)
        session["gold"] += amt_gold

    elif request.form["button"] == "house":
        amt_gold = random.randrange(2,6)
        now = datetime.datetime.now()
        log = "<p class=text_log> Congrats you've earned %s gold %s </p>" %(str(amt_gold),now) 
        session["activity_log"].append(log)
        session["gold"] += amt_gold

    elif request.form["button"] == "casino":
        gamble = random.randrange(1,3)
        if gamble == 1:
            amt_gold = random.randrange(0,101)
            now = datetime.datetime.now()
            log = "<p class=text_log> Congrats you've earned %s gold %s </p>" %(str(amt_gold),now) 
            session["activity_log"].append(log)
            session["gold"] += amt_gold

        if gamble == 2:
            amt_gold = random.randrange(10,21)
            now = datetime.datetime.now()
            log = "<p class=text_log> Oh no! You've lost %s gold %s </p>" %(str(amt_gold),now) 
            session["activity_log"].append(log)
            session["gold"] -= amt_gold

    return redirect("/")

@app.route("/restart")
def restart_hunt():
    session.clear()
    return redirect('/')
    


if __name__=="__main__":
    app.run(debug=True) 
