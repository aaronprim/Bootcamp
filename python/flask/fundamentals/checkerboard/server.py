from flask import Flask, render_template
app = Flask(__name__)

# @app.route('/')
# def board():
#     cols=8
#     rows=8
#     return render_template("index.html", cols=cols, rows=rows) 

@app.route('/<x>/<y>/')
def board2(x,y):
    cols=int(x)
    rows=int(y)
    return render_template("index.html", cols=cols, rows=rows) 


if __name__=="__main__":
    app.run(debug=True)