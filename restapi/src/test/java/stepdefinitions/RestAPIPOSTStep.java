package stepdefinitions;

import java.net.URI;
import java.net.URISyntaxException;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestAPIPOSTStep {

    private final String BASE_URL = "https://reqres.in/";
    private Response response;
   
    
    @Given("Get call to {string}")
    public void get_call_to(String url) throws URISyntaxException {
        RestAssured.baseURI = BASE_URL;
        RequestSpecification  requestSpecification = RestAssured.given();
        response = requestSpecification.when().get(new URI(url));
    }

    @Then("Response is {string}")
    public void response_is(String statusCode) {
        int actualResponseCode = response.then().extract().statusCode();
        Assert.assertEquals(statusCode, String.valueOf(actualResponseCode));
    }
    
}
