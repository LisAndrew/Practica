package pointweb.pom;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    public WebDriver driver;
    public Actions actions;
    protected static final Logger Logger = LogManager.getLogger(BasePage.class);

    public BasePage(WebDriver driver) {
        this.driver = driver;
        actions = new Actions(driver);
        PageFactory.initElements(driver, this);
    }

    public void switchToDefault() {
        driver.switchTo().defaultContent();
    }

    public void switchToFrame(WebElement frame) {
        switchToDefault();
        driver.switchTo().frame(frame);
    }

    public void Click(WebElement webElement) {
        actions.click(webElement).perform();
    }

    public void navigateTo(String url) {
        Logger.info("Navigate to Point");
        driver.get(url);
    }
}