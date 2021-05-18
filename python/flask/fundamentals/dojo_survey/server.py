from flask import Flask, render_template, request, redirect
app = Flask(__name__)

@app.route('/')
def survey():
    return render_template("form.html")


@app.route('/result', methods=['POST'])
def submit():
    print(request.form)
    name_from_form = request.form['name']
    dojo_from_form = request.form['dojo']
    lang_from_form = request.form['language']
    com_from_form = request.form['comment']

    return (render_template("result.html", name_=name_from_form, dojo_=dojo_from_form, lang_=lang_from_form, com_=com_from_form))

if __name__=="__main__":
    app.run(debug=True)

