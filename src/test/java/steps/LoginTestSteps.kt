package steps

import io.cucumber.java.en.Given
import io.cucumber.java.en.Then
import io.cucumber.java.en.When

class LoginTestSteps {
    @Given("the user is on the login page")
    fun the_user_is_on_the_login_page() {
    }

    @When("the user enters correct {string} username")
    fun the_user_enters_correct_username(username: String) {
        println("this is username $username")
    }

    @When("correct {string} password")
    fun correct_password(password: String) {
        println("this is password $password")
    }

    @When("the user clicks the login button")
    fun the_user_clicks_the_login_button() {
    }

    @Then("verify the user logs in successfully")
    fun verify_the_user_logs_in_successfully() {
    }


    @Then("user should not be logged in to the application")
    fun userShouldNotBeLoggedInToTheApplication() {
    }
}