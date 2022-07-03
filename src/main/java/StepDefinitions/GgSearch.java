package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.SeleniumUtils;
import utils.SeleniumWebDriver;

public class GgSearch {
    SeleniumUtils utils = new SeleniumUtils();
    WebDriver driver = SeleniumWebDriver.chromeDriver();

    public GgSearch() {
    }

    @Given("user is on gg_home page")
    public void user_is_on_gg_home_page() {
        this.driver.get("https://www.google.com/");
    }

    @When("user input search_key")
    public void user_input_search_key() {
        this.utils.waitName(this.driver, "q").sendKeys("gigacover");
    }

    @And("user click on login btn")
    public void user_click_on_login_btn() {
        this.utils.waitName(this.driver, "btnK").click();
    }

    @Then("user see result")
    public void user_see_result() {
        WebElement resullt = this.utils.waitXpath(this.driver, "//*[text()='Gigacover Home - Gigacover']");
        System.out.println(resullt);
        this.driver.quit();
    }
}
