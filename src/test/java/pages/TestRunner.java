package pages;

import org.junit.After;
import org.junit.Before;
import utilities.WebDriverHelper;

public class TestRunner {

    @Before

    public void startTest (){

        WebDriverHelper.selectdriver("Chrome");

        WebDriverHelper.setUrl("http://www.matrixtelematics.com/contact/");

    }

    @After

    public void nuke (){

       // WebDriverHelper.closeTest();
    }
}
