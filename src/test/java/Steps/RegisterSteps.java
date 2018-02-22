package Steps;

import PageObject.LoginPage;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Wsciekly Paczek on 2018-02-20.
 */
public class RegisterSteps extends AbstractSteps {
    LoginPage loginPage = new LoginPage(driver);
    @Given("^Jestem na stronie Logowanie$")
    public void jestem_na_stronie_Logowanie() {
        loginPage.imOnLoginPage();
    }
    @Given("Wpisuje login \"([^\"]*)\" i haslo \"([^\"]*)\"$")
    public void wpisuje_login_I_Haslo(String username, String password) {
        loginPage.insertLogin(username);
        loginPage.insertPassword(password);
    }
    @Given("^Klikniecie na przycisk Zaloguj sie$")
    public void klikniecie_na_zaloguj_sie() {
        loginPage.submit();
    }
    @Then("^Jestem zalogowany$")
    public void jestem_zalogowany() {
        loginPage.logged();
    }
    @Then("^Nie jestem zalogowany$")
    public void nie_jestem_zalogowany() {
        loginPage.noLogged();
    }


}

//
//    @Before
//    public void testSetup() {
//        AbstractSteps.driver.manage().deleteAllCookies();
//        AbstractSteps.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//    }
//    /** Zamykanie przegladarki po kazdym scenariuszu */
//    @After
//    public void testClose(Scenario scenario) {
//        if(AbstractSteps.driver instanceof WebDriver) {
//
//            AbstractSteps.driver.close();
//        }
//        AbstractSteps.driver = null;
//    }
