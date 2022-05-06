package pointweb.Test;


import org.openqa.selenium.WebDriver;
import pointweb.Utils.Browser;
import pointweb.actionsweb.PointActions;

public class Main {

    public static void main(String[] args) {


        WebDriver driver = Browser.setUp();

        PointActions pointActions = new PointActions(driver);
        pointActions.navigateTo("https://www.economist.com/");
        pointActions.clickOnRegisterSignUp();

    }
}