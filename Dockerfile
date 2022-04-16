#To play with ENTRYPOINT & CMD

FROM alpine

ENTRYPOINT ["uname","-nr"]
