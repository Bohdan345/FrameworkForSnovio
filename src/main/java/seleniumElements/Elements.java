package seleniumElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.openqa.selenium.support.ui.ExpectedConditions.*;

public class Elements extends BaseElement {





// ожидаем появления елемента в Dom  и видимости его на странице
    public WebElement waitElementVisible(By locator) {
        return getElementCondition(visibilityOfElementLocated(locator));
    }


    public WebElement waitElementPresence(By locator) {
        return getElementCondition(presenceOfElementLocated(locator));
    }

    public WebElement waitElementClikable(By locator) {
        return getElementCondition(elementToBeClickable(locator));
    }

    public WebElement waitElementClikable(WebElement element) {
        return getElementCondition(elementToBeClickable(element));
    }


    public boolean waitTextToBe(By locator, String text) {
        return getStateCondition(textToBe(locator, text));

    }

}
