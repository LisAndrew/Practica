package pointweb.pom.pointnews;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pointweb.Utils.Wait;
import pointweb.pom.BasePage;

public class LoginPage extends BasePage {

    @FindBy(xpath = "//a[contains(.,'Register now')]")
    private WebElement registerNow;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnRegisterSingUp() {
        Wait.until(() -> registerNow.isDisplayed(), 1, 1);
        Logger.info("Click on register");
        registerNow.click();
    }
}