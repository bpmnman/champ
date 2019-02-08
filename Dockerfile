FROM java:8
ADD target/champ-0.0.1-SNAPSHOT.jar //
ENTRYPOINT ["java", "-jar", "/champ-0.0.1-SNAPSHOT.jar"]
