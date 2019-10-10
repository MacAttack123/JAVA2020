package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class WebDriverHelper {

    public static final String CHROME_DRIVER = System.getProperty("user.dir") + "/drivers/chromedriver";

    public static WebDriver driver;

    public static void selectdriver(String driverchoice) {
        if (driverchoice.equalsIgnoreCase("Chrome")) { // this
            System.setProperty("webdriver.chrome.driver", CHROME_DRIVER); // finding wedriver as per the above path
            driver = new ChromeDriver();

        } else if (driverchoice.equalsIgnoreCase("Firefox")) { // or this
            driver = new FirefoxDriver();

        } else { // else this

            System.out.println("Numpty");
        }

        driver.manage().window().maximize();

    }

        public static void setUrl (String url){

        driver.get(url);

        }
        public static void closeTest(){

        driver.close();
        driver.quit();


    }
    }


