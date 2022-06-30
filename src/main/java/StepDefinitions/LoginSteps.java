package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
    @Given("user is on login page")
    public void user_is_on_login_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("user is on login page");
    }
    @When("user input <username> and <password>")
    public void user_input_username_and_password() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("user input <username> and <password>");
    }
    @And("click on login btn")
    public void click_on_login_btn() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("click on login btn");
    }
    @Then("user is navigated to home page")
    public void user_is_navigated_to_home_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("user is navigated to home page");
    }
}
