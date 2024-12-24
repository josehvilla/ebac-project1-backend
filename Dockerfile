FROM openjdk:11.0.15-jdk

COPY "./target/Proyecto1Ebac-1.0-SNAPSHOT.jar" "Proyecto1Ebac-1.0-SNAPSHOT.jar"

EXPOSE 80

ENTRYPOINT ["java", "-jar", "Proyecto1Ebac-1.0-SNAPSHOT.jar"]