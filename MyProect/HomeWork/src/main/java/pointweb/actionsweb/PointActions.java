package pointweb.actionsweb;

import org.openqa.selenium.WebDriver;
import pointweb.pom.pointnews.HomePage;
import pointweb.pom.pointnews.LoginPage;
import pointweb.pom.pointnews.*;

public class PointActions {
    private HomePage homePage;
    private LoginPage logInPage;
    private RegisterEconomistPage registerEconomistPage;


    public PointActions(WebDriver driver){

        homePage = new HomePage(driver);
        logInPage = new LoginPage(driver);
        registerEconomistPage = new RegisterEconomistPage(driver);
    }

    public void navigateTo(String url) {
       homePage.navigateTo(url);
       homePage.clickOnLogIn();

    }

    public void clickOnRegisterSignUp() {
        logInPage.clickOnRegisterSingUp();
    }

    public void fillFieldsRegistration(Registration registration) {
        registerEconomistPage.setFirstName(registration.firstName);
        registerEconomistPage.setLastName(registration.lastName);
        registerEconomistPage.setEmail(registration.email);
        registerEconomistPage.setPassword(registration.password);
        registerEconomistPage.clickOnRegisterNow();
    }
}


