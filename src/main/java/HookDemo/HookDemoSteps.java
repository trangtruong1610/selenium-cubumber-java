package HookDemo;

import Page.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import utils.SeleniumWebDriver;

public class HookDemoSteps {
    WebDriver driver = SeleniumWebDriver.chromeDriver();
    LoginPage loginPage = new LoginPage(driver);

    @Given("user is on page login")
    public void user_is_on_page_login() {
        loginPage.openURL();
        System.out.println("Run From Hook Demo Steps");
    }

    @When("input {string} and {string}")
    public void input_username_and_password(String username, String password) {
        loginPage.inputUserName(username);
        loginPage.inputPassword(password);
    }

    @And("click on submit btn")
    public void click_on_submit_btn() {
        loginPage.clickSubmit();
    }

    @Then("user is on home page")
    public void user_is_on_home_page() {
        loginPage.checkLoginSuccessful();
        driver.quit();
    }
}
