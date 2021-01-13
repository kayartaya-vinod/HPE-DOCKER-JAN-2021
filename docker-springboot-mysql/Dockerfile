FROM openjdk:alpine

RUN apk add --update mysql mysql-client && rm -f /var/cache/apk/*

COPY ./startup.sh /startup.sh
COPY ./my.cnf /etc/mysql/my.cnf
RUN chmod 700 /startup.sh

WORKDIR /vinod/files
COPY target/docker-springboot-mysql-0.0.1-SNAPSHOT.jar ./app.jar

COPY ./wrapper.sh ./
RUN chmod 700 /vinod/files/wrapper.sh

CMD ["/vinod/files/wrapper.sh"]


# mvn clean package 
# docker build -t learnwithvinod/dsm:latest . 
# docker run -p 8080:8080 --rm --name dsm  learnwithvinod/dsm 