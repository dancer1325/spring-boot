# Goal
* Getting Started of "actuator/tracing"

## How to run locally?
* `mvn spring-boot:run`
  * Problems:
    * Problem1: "Exception in thread "main" java.lang.IllegalArgumentException: LoggerFactory is not a Logback LoggerContext but Logback is on the classpath. Either remove Logback or the competing implementation (class org.slf4j.helpers.NOPLoggerFactory loaded from file:/Users/ADP0253/.m2/repository/org/slf4j/slf4j-api/1.7.36/slf4j-api-1.7.36.jar). If you are using WebLogic you will need to add 'org.slf4j' to prefer-application-packages in WEB-INF/weblogic.xml: org.slf4j.helpers.NOPLoggerFactory
        * Attempt1: Add "logback" dependencies
        * Attempt2: Switch starters to 3.2.3
        * Attempt3: Add io.micrometer:micrometer-bom
        * Notes: "spring-boot-starter-web:3.3.2" seems to have a conflict with slf4j. TODO: Check http://www.slf4j.org/codes.html#StaticLoggerBinder
        * Solution: TODO: 