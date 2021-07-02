
package initialDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browsers {

    private static WebDriver driver;


    public static WebDriver getBrowser(String browser) {

        switch (browser) {

            case "CHROME":
                System.setProperty("webdriver.chrome.driver", "C:\\TestFrameWork_Snovio_Preprod\\chromedriver.exe");
                driver = new ChromeDriver();
                break;
            case "FIREFOX":
                System.setProperty("path for geckodiver", "C:\\TestFrameWork_Snovio_Preprod\\gecko driver.exe");
                driver = new FirefoxDriver();
            default:
                try {
                    throw new Exception("No such browser");
                } catch (Exception e) {
                    e.printStackTrace();
                }

        }
        return driver;
    }

}

