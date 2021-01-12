FROM nginx:alpine

COPY ./index.html /usr/share/nginx/html

EXPOSE 80

ENTRYPOINT ["nginx", "-g", "daemon off;"]

# docker build -t learnwithvinod/html-website:latest .
# docker run -dp 8080:80 --name html-website --rm learnwithvinod/html-website:latest

