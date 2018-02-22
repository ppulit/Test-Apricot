package Steps;

        import cucumber.api.Scenario;
        import cucumber.api.java.After;
        import cucumber.api.java.Before;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.chrome.ChromeDriver;

        import java.util.concurrent.TimeUnit;

public abstract class AbstractSteps {
    protected static WebDriver driver;

    public AbstractSteps() {
        /** Sciezka do ChromeDrivera w systemie, nalezy podac swoja! */
        System.setProperty("webdriver.chrome.driver", "C://Biblioteki Selenium/chrome/chromedriver.exe");

        if(AbstractSteps.driver == null) {
            /** Tu tworzy sie obiekt ChromeDrivera! Magia przegladarka! */
            AbstractSteps.driver = new ChromeDriver();
            //System.out.println("nowa instancja");
        } else {
            //System.out.println("stara instancja");
        }
    }



}
