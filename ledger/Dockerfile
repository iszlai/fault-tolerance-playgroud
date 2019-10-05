FROM mcr.microsoft.com/java/jdk:12u2-zulu-debian9
COPY . .
CMD [ "./gradlew build" ]
RUN java -jar ./build/libs/ledger-0.0.1-SNAPSHOT.jar