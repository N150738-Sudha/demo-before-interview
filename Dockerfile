FROM java:8

ADD target/spring-boot-revature-mvc-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT [ "java" , "-jar" , "app.jar" ]

EXPOSE 8080