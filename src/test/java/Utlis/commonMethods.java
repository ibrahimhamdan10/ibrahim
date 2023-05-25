package Utlis;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class commonMethods {

    public static WebDriver driver;
    public static void openBrowserAndLunchApplication(String url){
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();

    }

    public static void closeBrowser(){
        driver.quit();
    }

}
