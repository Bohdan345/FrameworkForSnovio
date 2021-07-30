package initialDriver;
import org.openqa.selenium.WebDriver;
import static utils.DataFromProperty.BROWSER;

public class InitDriver {

    private static WebDriver driver = null;
    private static InitDriver initDriverInstance = null;

    protected InitDriver() {

    }

    public WebDriver getDriver() {
        if (driver == null) {
            driver = Browsers.getBrowser(BROWSER);
        }
        return driver;
    }

    public static InitDriver getInstance() {
        if (initDriverInstance == null)
            initDriverInstance = new InitDriver();

        return initDriverInstance;
    }

    public void destroy() {

        if (driver != null)
            driver.close();
        driver.quit();
        driver = null;


    }
}






