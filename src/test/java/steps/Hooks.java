package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import utilities.Driver;

public class Hooks {
    WebDriver driver = Driver.getDriver();

    @Before
    public void beforeScenario () {
        System.out.println("my before method");
    }

    @After
    public void afterScenario () {
        driver.quit();
        System.out.println("my after method");

    }

}
