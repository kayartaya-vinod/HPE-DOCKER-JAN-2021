FROM python:rc-alpine

# install flask (run this command on the container, not on local)
RUN pip install flask

WORKDIR /vinod/files

COPY ./app.py .

EXPOSE 1234

CMD [ "python", "app.py"]
