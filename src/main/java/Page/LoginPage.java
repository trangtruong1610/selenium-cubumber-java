package Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;
    @FindBy(
            id = "username"
    )
    @CacheLookup
    WebElement username_input;
    @FindBy(
            id = "password"
    )
    @CacheLookup
    WebElement password_input;
    @FindBy(
            xpath = "//*[@type='submit']"
    )
    @CacheLookup
    WebElement submitBtn;
    @FindBy(
            xpath = "//*[text()='Welcome to the Secure Area. When you are done click logout below.']"
    )
    @CacheLookup
    WebElement result;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void openURL() {
        this.driver.get("https://the-internet.herokuapp.com/login");
    }

    public void inputUserName(String username) {
        this.username_input.sendKeys(username);
    }

    public void inputPassword(String password) {
        this.password_input.sendKeys(password);
    }

    public void clickSubmit() {
        this.submitBtn.click();
    }

    public void checkLoginSuccessful() {
        boolean check = this.result.isDisplayed();
        assert check;
    }
}
