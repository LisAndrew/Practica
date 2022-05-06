package pointweb.pom.pointnews;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pointweb.Utils.Wait;
import pointweb.pom.BasePage;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//span[contains(.,'Log in')]")
    private WebElement logIn;


    public void clickOnLogIn() {
        Logger.info("Click on LogIn");
        logIn.click();
    }
}
