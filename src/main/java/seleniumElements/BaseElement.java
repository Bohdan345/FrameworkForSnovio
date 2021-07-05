package seleniumElements;

import initialDriver.InitDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

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
        return waitElement().until(elementToBeClickable(locator));
    }

    public WebElement waitUtilElementVisible(By locator) {
        return waitElement().until(visibilityOfElementLocated(locator));
    }


    public WebElement waitUtilElementPresence(By locator) {
        return waitElement().until(presenceOfElementLocated(locator));
    }
}
