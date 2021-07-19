package APITests.stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import org.testng.Assert;

import static io.restassured.RestAssured.given;


public class APITests  {

    private String path;
    private Integer statusCode;
  //  Response response;

    @Given("I set API endpoint")
    public void i_set_api_endpoint() {
        RestAssured.baseURI = "https://supervillain.herokuapp.com/api-docs/";
        path = "/user";
    }

    @When("I send GET HTTP request")
    public void i_send_get_http_request() {

        statusCode = given()
                .header("Accept", ContentType.JSON.getAcceptHeader())
                .contentType(ContentType.JSON)
                .get(path).getStatusCode();

        System.out.println("The status code is in the response "+ statusCode);
    }

    @Then("I receive valida HTTP response code {int}")
    public void i_receive_valida_http_response_code(Integer int1) {
        Assert.assertEquals(statusCode, int1);


    }



}
