package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pages.StudyMateLoginPage;
import utilities.Config;
import utilities.Driver;

public class StudyMateLoginSteps {
    WebDriver driver = Driver.getDriver();
    StudyMateLoginPage loginPage = new StudyMateLoginPage();

    @Given("user navigates to login page")
    public void user_navigates_to_login_page() {
        driver.get(Config.getProperty("studyMateUrl"));
        Assert.assertEquals("StudyMate", driver.getTitle());
        System.out.println("User navigated to StudyMate login page");
    }
    @When("user enters email {string} to the email field")
    public void user_enters_email_to_the_email_field(String email) {
        loginPage.emailInput.sendKeys(email);
             }
    @When("user enters password {string} to the password field")
    public void user_enters_password_to_the_password_field(String password) {
        loginPage.passwordInput.sendKeys(password);
    }
    @Then("user performs click action on the log in button")
    public void user_performs_click_action_on_the_log_in_button() throws InterruptedException {
        loginPage.loginButton.click();
        System.out.println("user clicked log in button");
        Thread.sleep(3000);

        }
    @Then("user should be logged in to the application")
    public void user_should_be_logged_in_to_the_application() throws InterruptedException {
       String expectedUrl = "https://codewiser.studymate.us/admin/analytics";
       String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        Assert.assertEquals(expectedUrl, currentUrl);
        System.out.println("user successfully logged in");
           }

}
