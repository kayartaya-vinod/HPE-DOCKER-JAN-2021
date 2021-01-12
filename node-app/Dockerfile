FROM node:alpine3.12

WORKDIR /vinod/files

COPY ./package.json ./

RUN npm install

COPY ./ ./

# ENV APP_PORT=7788

ENTRYPOINT [ "node", "server.js" ]

# docker build -t learnwithvinod/node-app:latest .
# docker run -p 7788:7788 --name node-app --rm learnwithvinod/node-app:latest
# docker run -p 7070:7070 --name node-app --rm learnwithvinod/node-app
# docker run -e APP_PORT=6543 -p 7070:6543 --name node-app --rm learnwithvinod/node-app