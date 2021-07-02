package seleniumElements;

import org.openqa.selenium.By;

public class Fields extends BaseElement {

/// Описать  свойства для полей ввода


    public void typeField(By locator, String text) {
        waitUtilVisible(locator).sendKeys(text);
    }

}

