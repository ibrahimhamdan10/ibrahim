package class09;

import Utlis.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class keyDemo extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
      String path="http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";
      openBrowserAndLaunchApplication(path,"chrome");

        WebElement userName = driver.findElement(By.id("ctl00_MainContent_username"));
        userName.sendKeys("Tester", Keys.TAB);
        Thread.sleep(2000);
        WebElement password= driver.findElement(By.id("ctl00_MainContent_password"));
        password.sendKeys("test",Keys.ENTER);


    }
}
