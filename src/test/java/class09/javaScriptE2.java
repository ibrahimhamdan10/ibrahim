package class09;

import Utlis.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class javaScriptE2 extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        String url = "https://amazon.com";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);

        JavascriptExecutor js=(JavascriptExecutor) driver;
//scroll down
        js.executeScript("window.scrollBy(0, 1000)");
//        Thread.sleep for observation
        Thread.sleep(3000);
//        scroll up
        js.executeScript("window.scrollBy(0, -1000)");
        WebElement dropDown= driver.findElement(By.xpath("//i[@class='hm-icon nav-sprite']"));
        Thread.sleep(2000);
        js.executeAsyncScript("arguments[0].click();",dropDown);

    }
}
