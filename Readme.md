## Rest Assured

RestAssured is quite popular api framework that allows user to automate the api's.

## Writing Tests

1. Create feature files in the `src/test/resources/features` directory using Gherkin syntax.
2. Implement step definitions in the `src/test/java/stepdefinitions` directory.
3. Add any necessary support code in the `src/main/java/com/api` directory.

## Configuration

Modify the `config.properties` file in the `src/main/resources` directory to set up environment-specific configurations.

## Reporting

After running the tests, you can find the Cucumber HTML report in the `target/cucumber-reports` directory.


## Acknowledgments

- RestAssured library: https://rest-assured.io/
- Cucumber for Java: https://cucumber.io/docs/installation/java/