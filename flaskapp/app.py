from flask import Flask
app = Flask(__name__)

@app.route('/')
def hello_world():
    return 'Hello, World!'


@app.route('/api/author')
def author_info():
    return dict(name="Vinod Kumar", email="vinod@vinod.co", phone="9731424784")


app.run(port=1234)