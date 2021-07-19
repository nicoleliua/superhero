package WebTests.stepdefs;

import WebTests.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.io.IOException;

import static WebTests.TheGame.*;

public class WebTests extends Base {

    char returnFlag = 'X';
    public WebDriver driver;

    @Given("I have launched this web application")
    public void i_have_launched_this_web_application() throws IOException, InterruptedException {
        driver= Base.getDriver();
    }

    @When("I create a {string}")
    public void i_create_a(String string) {
        createNewUser(driver, string);
    }

    @Then("I can start the journey with {string}")
    public void i_can_start_the_journey_with(String string) {
        returnFlag = verifyUserCreated(driver, string);
        Assert.assertEquals(returnFlag,'Y');
    }

    @Given("I start my journey with the {string}")
    public void i_start_my_journey_with_the(String string) {

        startJourney(driver,string);
    }

    @When("I select the challenge {string}")
    public void i_select_the_challenge(String string) {
        selectChallenge(driver, string);
    }

    @Then("I can start the game")
    public void i_can_start_the_game() {
        startGame(driver);
    }

    @When("I select the correct answer before timer expires")
    public void i_select_the_correct_answer_before_timer_expires() {
        selectCorrectAns(driver);
    }

    @Then("I get my points")
    public void i_get_my_points() {

    }

    @Then("I can check my final score with the {string}")
    public void i_can_check_my_final_score_with_the(String string) {

        returnFlag = checkScore(driver, string);
        Assert.assertEquals(returnFlag,'Y');
    }
}
