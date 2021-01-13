#! /bin/sh
# set -m

# run in background
/startup.sh &

# deliberate delay if needed.
# sleep 10s

# run in background
java -jar /vinod/files/app.jar
