package initialDriver;


import org.openqa.selenium.WebDriver;

import static utils.DataFromProperty.BROWSER;


public class WebDriverSingleton {

    private static WebDriver driver;

    protected WebDriverSingleton() {
    }

    public static WebDriver getWebDriverInstance() {
        if (null == driver) {
            driver = Browsers.getBrowser(BROWSER);
        }
        return driver;
    }


    public void closeWebBrowser() {
        if (null != driver) {
            driver.quit();
            driver.close();
        }
        driver = null;
    }
}

