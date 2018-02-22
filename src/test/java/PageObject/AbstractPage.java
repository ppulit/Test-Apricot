package PageObject;

import org.openqa.selenium.WebDriver;

/**
 * Created by Wsciekly Paczek on 2018-02-20.
 */
public abstract class AbstractPage {

    protected WebDriver driver;
    public AbstractPage(WebDriver driver) {
        this.driver = driver;
    }

    String srodowisko = "https://stag-rwd.morele.net/";
    //String srodowisko = "https://dev-rwd7.morele.net";

}
