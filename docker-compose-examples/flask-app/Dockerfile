FROM python:alpine

RUN apk add gcc musl-dev linux-headers

ENV FLASK_APP=app.py FLASK_RUN_HOST=0.0.0.0

WORKDIR /usr/vinod/app

COPY ./requirements.txt ./
RUN pip install -r ./requirements.txt

COPY ./app.py ./
CMD [ "flask", "run" ]