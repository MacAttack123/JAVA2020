package elements;

import org.openqa.selenium.By;
import utilities.WebDriverHelper;

public class Element {

    By by;

    public Element(By by) {
        this.by = by;
    }

    public void clickIt(){


        WebDriverHelper.driver.findElement(by).click();
    }

    public void textInput(String value){


        WebDriverHelper.driver.findElement(by).sendKeys(value);
    }


}
