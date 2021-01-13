from flask import Flask
import redis
import time

app = Flask(__name__)
cache = redis.Redis(host='redis-server', port=6379)

def get_count():
    attempts = 5
    while True:
        try:
            return cache.incr('g')
        except redis.exceptions.ConnectionError as ex:
            print('Connection refused....trying again...remaining attempts %d' % attempts)
            if attempts==0:
                raise ex
            attempts -= 1
            time.sleep(1)

@app.route('/hello')
def hello():
    return "<h1>Hello 😎</h1>"

@app.route('/count')
def visits():
    return dict(count=cache.get('visit_count'))

@app.route('/')
def index():
    count = get_count()
    return '<h3>Hello friend!! This page is visited {} times</h3>'.format(count)