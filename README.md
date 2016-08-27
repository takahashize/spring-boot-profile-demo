Spring Boot Profile switching Demo
==================================

http://docs.spring.io/spring-boot/docs/current/reference/html/boot-features-profiles.html
http://docs.spring.io/spring-boot/docs/current/reference/html/boot-features-external-config.html#boot-features-external-config-profile-specific-properties
http://stackoverflow.com/questions/32078015/spring-boot-enable-disable-embedded-tomcat-with-profile

## Requirement

* Java 8

## Usage

```
git clone https://github.com/takahashize/spring-boot-profile-demo
./gradlew build

// run web application
java -jar -Dspring.profiles.active=web build/libs/profile_demo-0.0.1-SNAPSHOT.jar

// show rest response
curl http://localhost:8080/

// run batch application
java -jar -Dspring.profiles.active=batch build/libs/profile_demo-0.0.1-SNAPSHOT.jar
```