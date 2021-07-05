package seleniumElements;

import org.openqa.selenium.By;

public class Button extends BaseElement {


    public void click(By locator) {
        waitUtilElementBeClickable(locator).click();

    }


}
