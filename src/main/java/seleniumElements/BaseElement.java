package seleniumElements;

import initialDriver.WebDriverSingleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;
import static utils.DataFromProperty.TIME_OUT;

abstract class BaseElement extends WebDriverSingleton {

    protected WebDriver driver = WebDriverSingleton.getWebDriverInstance();

    //Получаем объект Wait и прячем   реализацию в этом методе
    protected WebDriverWait waitElement() {
        WebDriverWait wait = new WebDriverWait(driver, TIME_OUT);
        return wait;
    }

    //  Прячем  логику ожиданий  по кондишенам  в этом методе
    protected WebElement getElementCondition(ExpectedCondition<WebElement> elementExpectedCondition) {
        return waitElement().until(elementExpectedCondition);
    }


    protected boolean getStateCondition(ExpectedCondition<Boolean> stateExpectedCondition) {
        return waitElement().until(stateExpectedCondition);
    }


    public WebElement waitUtilClickable(By locator) {
        return waitElement().until(elementToBeClickable(locator));
    }

    public WebElement waitUtilVisible(By locator) {
        return waitElement().until(visibilityOfElementLocated(locator));
    }
}
