from flask import Flask, render_template
app = Flask(__name__)

# @app.route('/play')
# def boxes():
#     return render_template("index.html") 
    
# @app.route('/play/<num>')
# def boxes(num):
#     return render_template("index.html", times = int(num))

@app.route('/play/<num>/<color>')
def boxes(num,color):
    colorChange = color
    return render_template("index.html", times = int(num), colorChange=colorChange) 



if __name__=="__main__":
    app.run(debug=True)