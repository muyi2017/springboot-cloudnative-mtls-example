FROM azul/zulu-openjdk-alpine:11-jre
ARG JAR_FILE_NAME
WORKDIR /opt/app
COPY ./target/$JAR_FILE_NAME ./app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]