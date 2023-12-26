From openjdk:17
EXPOSE 8080
ADD target/github-cicd-action.jar github-cicd-action.jar
ENTRYPOINT [ "java", "-jar", "github-cicd-action.jar" ]
