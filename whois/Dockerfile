FROM busybox:latest

WORKDIR /vinod/files

COPY ./info.txt .
COPY ./Dockerfile .

# CMD lets users override the command while running the container
# ENTRYPOINT does not all the same.
# CMD [ "cat", "./info.txt" ]

# ENTRYPOINT [ "cat" ]
# CMD [ "./info.txt" ]

# When you run this container, the startup command is going to be:
# cat ./info.txt

# However, we can supply a different file
# docker run --rm learnwithvinod/info /vinod/files/Dockerfile