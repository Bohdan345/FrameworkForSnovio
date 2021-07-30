package seleniumElements;

import initialDriver.InitDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static org.openqa.selenium.support.ui.ExpectedConditions.*;
import static utils.DataFromProperty.TIME_OUT;

abstract class BaseElement extends InitDriver {

    protected WebDriver driver = InitDriver.getInstance().getDriver();


    protected WebDriverWait waitElement() {
        WebDriverWait wait = new WebDriverWait(driver, TIME_OUT);
        return wait;
    }


    protected WebElement getElementCondition(ExpectedCondition<WebElement> elementExpectedCondition) {
        return waitElement().until(elementExpectedCondition);
    }

    protected boolean getStateCondition(ExpectedCondition<Boolean> stateExpectedCondition) {
        return waitElement().until(stateExpectedCondition);
    }


    public WebElement waitUtilElementBeClickable(By locator) {
        return getElementCondition(elementToBeClickable(locator));
    }

    // ожидание видимости елемента
    public WebElement waitElementVisibility(WebElement element) {
        return getElementCondition(elementToBeClickable(element));
    }

    public WebElement waitElementVisibility(By locator) {
        return getElementCondition(elementToBeClickable(locator));
    }

    // ожидание исчезновения  елемента
    public boolean waitElementInvisibility(WebElement locator) {
        return getStateCondition(invisibilityOf(locator));
    }

    // ожидание появления елемента на странице
    public WebElement waitUtilElementPresence(By locator) {
        return getElementCondition(presenceOfElementLocated(locator));
    }


    public WebElement findElement(By locator) {
        return driver.findElement(By.xpath(String.valueOf(locator)));
    }

    public List<WebElement> findElements(By locator ) {
        List<WebElement> elements = driver.findElements(By.xpath(String.valueOf(locator)));
        return elements;
    }
}
