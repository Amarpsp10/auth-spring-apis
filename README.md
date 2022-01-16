### JWT Autentication with Spring Boot
  
  Rest APIS for Json Web Token Authentication built with Spring Boot & MYSQL, implemented for different role based users.
 
## Run with Docker  <img width="30px" height="30px" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/docker/docker-original.svg" alt="docker"/>

1. Run maven install task via IDE or run command in root `mvnw install`, and you will get executable `auth-spring-apis.jar` file inside `./target` directory.
2. Run App with MySQL Database, using docker compose

        docker-compose -f "docker-compose.yml" up
        
        
3.  Run App with External MySQL Database, add the database configuration in `./src/main/resources/application.properties` file. run the command in root dir to build image

        docker build . -t auth-spring-api-image-name
    create container and run 
        
        docker run -p 8080:8080 auth-spring-api-image-name

4.  Done, check your `localhost` at Port `8080`.
<hr/>
