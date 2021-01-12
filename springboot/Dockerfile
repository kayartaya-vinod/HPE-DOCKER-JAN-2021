FROM openjdk:slim-buster

WORKDIR /vinod/files

COPY ./target/docker-demo-0.0.1-SNAPSHOT.jar ./app.jar

EXPOSE 8080

ENTRYPOINT java -jar app.jar
# ENTRYPOINT [ "java -jar app.jar" ]
# ENTRYPOINT [ "java", "-jar", "app.jar" ]

# docker build -t learnwithvinod/springboot:latest .
# docker run -p 8080:8080 --rm --name springboot learnwithvinod/springboot
# browser--> localhost:8080/api/author