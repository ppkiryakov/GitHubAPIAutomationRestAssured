# GitHubAPIAutomationRestAssured

# Tech Stack

Java 17

Maven

RestAssured

TestNG


You need to have the following installed on your PC to be able to run the tests:

Install JDK 17 

Install Maven


After you download the API Automation project you need to put your personal token value from GitHub from your account in prod.properties file for "accessToken" key.


To run the tests you can Run from the IDE or run with Maven command

**mvn clean test -Denv=prod -Dtest=CreateRepositoryTests**

To run Debug with Maven 

**mvnDebug clean test -Denv=prod -Dtest=CreateRepositoryTests**






