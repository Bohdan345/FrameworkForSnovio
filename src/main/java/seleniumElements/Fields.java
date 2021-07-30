package seleniumElements;

import org.openqa.selenium.By;

public class Fields extends BaseElement {

/// Описать  свойства для полей ввода


    public void typeField(By locator, String text) {
        waitElementVisibility(locator).sendKeys(text);
    }

    public void cleanTypeField(By locator, String text) {

        waitElementVisibility(locator).clear();
        waitElementVisibility(locator).sendKeys(text);

    }

}

