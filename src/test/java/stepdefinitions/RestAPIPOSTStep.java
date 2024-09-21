package stepdefinitions;

import java.net.URI;
import java.net.URISyntaxException;

import org.junit.Assert;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import restAssured.testBase;

public class RestAPIPOSTStep extends testBase{

    testBase base;    
    String baseUrl;
    private Response response;
   
    @Before
    public void setup(){
        base = new testBase();
        baseUrl  = prop.getProperty("BASE_URL");
    }

    @Given("Get call to {string}")
    public void get_call_to(String url) throws URISyntaxException {
        RestAssured.baseURI = baseUrl;
        RequestSpecification  requestSpecification = RestAssured.given();
        response = requestSpecification.when().get(new URI(url));
    }

    @Then("Response is {string}")
    public void response_is(String statusCode) {
        int actualResponseCode = response.then().extract().statusCode();
        Assert.assertEquals(statusCode, String.valueOf(actualResponseCode));
    }
    
}
