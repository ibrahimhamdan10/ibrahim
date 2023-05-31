package HwClass05;

import class04.CommonMethods;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task1 extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.syntaxtechs.net/javascript-alert-box-demo.php");
        WebElement alert3Btn = driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
        alert3Btn.click();
        Alert confirmationAlert3 = driver.switchTo().alert();
        Thread.sleep(2000);
        confirmationAlert3.sendKeys("ibrahim");
        Thread.sleep(2000);
        confirmationAlert3.accept();

    }

}
