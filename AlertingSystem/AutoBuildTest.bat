call mvn test
call mvn clean compile assembly:single
call cd target
call java -jar AlertingSystem-1.0-jar-with-dependencies.jar
PAUSE