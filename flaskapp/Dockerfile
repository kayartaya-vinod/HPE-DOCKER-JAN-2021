FROM python:rc-alpine

RUN pip install flask

WORKDIR /vinod/files

COPY ./app.py .

ENV FLASK_APP=app.py FLASK_RUN_HOST=0.0.0.0 FLASK_RUN_PORT=1234

EXPOSE 1234

CMD [ "flask", "run" ]
