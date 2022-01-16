FROM openjdk:8

ADD target/auth-spring-apis.jar auth-spring-apis.jar 

EXPOSE 8080

ENTRYPOINT [ "java", "-jar", "auth-spring-apis.jarm"]