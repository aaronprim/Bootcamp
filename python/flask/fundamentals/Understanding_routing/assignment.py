from flask import Flask
app = Flask(__name__)

@app.route('/')
def Hello_World():
    return 'Hello World!'

@app.route('/dojo')
def dojo():
    return "Dojo"

@app.route('/hi/<user>')
def hi(user):
    print(user)
    return "Hi " + user + "!"

@app.route('/repeat/<num>/hello')
def repeat(num):
    print(num)
    return "hello" * int(num)

if __name__=="__main__":
    app.run(debug=True)
