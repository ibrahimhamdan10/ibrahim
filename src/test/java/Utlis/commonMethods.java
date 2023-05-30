package Utlis;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class commonMethods {
        // make every one can use this object
     public static WebDriver driver;
    public static void openBrowserAndLunchApplication(String url){
        //intilize the class
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();

    }

    public static void closeBrowser(){

        driver.quit();
    }

}
