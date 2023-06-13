package class09;

import Utlis.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class jsExecuterClickOperation extends CommonMethods {
    public static void main(String[] args) {
        String path="http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";
        openBrowserAndLaunchApplication(path,"chrome");
        WebElement loginBtn = driver.findElement(By.xpath("//input[@id='btnLogin']"));
        JavascriptExecutor js =(JavascriptExecutor) driver;
        js.executeAsyncScript("arguments[0].click();",loginBtn);
    }
}
