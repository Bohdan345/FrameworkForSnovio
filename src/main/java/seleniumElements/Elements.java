package seleniumElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static org.openqa.selenium.support.ui.ExpectedConditions.*;

public class Elements extends BaseElement {


    public WebElement waitElementVisible(By locator) {
        return getElementCondition(visibilityOfElementLocated(locator));
    }


    public WebElement waitElementPresenceLocated(By locator) {
        return getElementCondition(presenceOfElementLocated(locator));
    }


    public WebElement waitElementBeClikable(By locator) {
        return getElementCondition(elementToBeClickable(locator));
    }

    public WebElement waitElementBeClikable(WebElement element) {
        return getElementCondition(elementToBeClickable(element));
    }


    public boolean waitTextToBe(By locator, String text) {
        return getStateCondition(textToBe(locator, text));


    }


    public List<WebElement> getListsName(By locator, By items) {
        WebElement element = findElement(locator);

        List<WebElement> elements = element.findElements(items);
        return elements;
    }

    public void sel(By locator) {
        Select select = new Select(driver.findElement(By.xpath(String.valueOf(locator))));
        List<WebElement> dd = select.getOptions();

        System.out.println(dd.size());
    }


}
