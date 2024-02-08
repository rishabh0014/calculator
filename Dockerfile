#FROM openjdk:11
#COPY ./target/calculator-1.0-SNAPSHOT-jar-with-dependencies.jar ./
#WORKDIR ./
#CMD ["java", "-jar", "calculator-1.0-SNAPSHOT-jar-with-dependencies.jar"]
## testing
FROM openjdk:11
WORKDIR /app
COPY target/calculator.jar /app/calculator.jar
CMD ["java", "-cp", "calculator.jar", "org.example.Calculator"]
