FROM mcr.microsoft.com/java/jdk:12u2-zulu-debian9 as builder 
COPY . .
CMD [ "./gradlew build" ]

FROM mcr.microsoft.com/java/jdk:12u2-zulu-debian9

COPY --from=builder ./build/libs/ledger-0.0.1-SNAPSHOT.jar app.jar
ENV JAVA_OPTS=""
EXPOSE 8080
ENTRYPOINT exec java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar
