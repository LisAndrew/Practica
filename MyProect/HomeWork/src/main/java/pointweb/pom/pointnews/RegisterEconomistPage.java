package pointweb.pom.pointnews;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pointweb.Utils.Wait;
import pointweb.pom.BasePage;

public class RegisterEconomistPage extends BasePage {
    @FindBy(xpath = "//input[@name='firstname']")
    private WebElement firstName;

    @FindBy(xpath = "//input[@name='lastname']")
    private WebElement lastName;

    @FindBy(xpath = "//input[@name='emailAddress']")
    private WebElement email;

    @FindBy(xpath = "//input[@name='password']")
    private WebElement password;

    @FindBy(xpath = "//button[contains(.,'Register now')]")
    private WebElement registerNow;

    public RegisterEconomistPage(WebDriver driver) {
        super(driver);
    }

    public void setLastName(String text) {
        Wait.until(() -> lastName.isDisplayed(), 1, 1);
        Logger.info("Filling lastName field with {}", text);
        lastName.clear();
        lastName.sendKeys(text);
    }

    public void setFirstName(String text) {
        Wait.until(() -> firstName.isDisplayed(), 1, 1);
        Logger.info("Filling firstName field with {}", text);
        firstName.clear();
        firstName.sendKeys(text);
    }

    public void setEmail(String text) {
        Wait.until(() -> email.isDisplayed(), 1, 1);
        Logger.info("Filling email field with {}", text);
        email.clear();
        email.sendKeys(text);
    }

    public void setPassword(String text) {
        Wait.until(() -> password.isDisplayed(), 1, 1);
        Logger.info("Filling password field with {}", text);
        password.clear();
        password.sendKeys(text);
    }

    public void clickOnRegisterNow() {
        Logger.info("Click on RegisterNow");
        Wait.until(() -> registerNow.isDisplayed(), 1, 1);
        registerNow.click();
    }
}
