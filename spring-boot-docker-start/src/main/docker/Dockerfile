FROM java:8
EXPOSE 8080
ADD spring-boot-docker-start.jar app.jar
RUN sh -c 'touch /app.jar'
ENTRYPOINT ["java","-jar","/app.jar"]