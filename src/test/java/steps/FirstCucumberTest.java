package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FirstCucumberTest {
    @Given("valid username {string}")
    public void valid_username(String string) {
    }
    @Given("valid password {string}")
    public void valid_password(String string) {
    }
    @When("user clicks login button")
    public void user_clicks_login_button() {
    }
    @Then("user logs in")
    public void user_logs_in() {
    }
    @Given("invalid username {string}")
    public void invalid_username(String string) {

    }
    @Given("invalid password {string}")
    public void invalid_password(String string) {
    }
    @Then("user does not logs in")
    public void user_does_not_logs_in() {
    }

}
