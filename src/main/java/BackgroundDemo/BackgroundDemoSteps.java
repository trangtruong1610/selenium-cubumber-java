package BackgroundDemo;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BackgroundDemoSteps {
    @Given("user is on loginpage")
    public void user_is_on_loginpage() {
        System.out.println("user is on loginpage");
    }

    @When("user enter username and password")
    public void user_enter_username_and_password() {
        System.out.println("user enter username and password");
    }

    @And("user clicks on login btn")
    public void user_clicks_on_login_btn() {
        System.out.println("user clicks on login btn");
    }

    @Then("user is navigated to homepage")
    public void user_is_navigated_to_homepage() {
        System.out.println("user is navigated to homepage");
    }

    @When("user clicks on welcome link")
    public void user_clicks_on_welcome_link() {
        System.out.println("user clicks on welcome link");
    }

    @Then("logout link is displayed")
    public void logout_link_is_displayed() {
        System.out.println("logout link is displayed");
    }

    @When("user clicks on dashboard link")
    public void user_clicks_on_dashboard_link() {
        System.out.println("user clicks on dashboard link");
    }

    @Then("quick launch toolbar is displayed")
    public void quick_launch_toolbar_is_displayed() {
        System.out.println("quick launch toolbar is displayed");
    }
}
