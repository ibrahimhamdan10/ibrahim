package Class05;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alerts {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.syntaxtechs.net/javascript-alert-box-demo.php");
        WebElement alert1Btn= driver.findElement(By.xpath(" //button[@onclick='myAlertFunction()']"));
        alert1Btn.click();

        Alert confirm=driver.switchTo().alert();
        Thread.sleep(1000);
        confirm.accept();

        WebElement alert2Btn=driver.findElement(By.xpath(" //button[@onclick='myConfirmFunction()']"));
        alert2Btn.click();
        Thread.sleep(1000);
        Alert confirmAlert2=driver.switchTo().alert();
        confirmAlert2.dismiss();

        WebElement alert3Btn = driver.findElement(By.xpath(" //button[@onclick='myPromptFunction()']"));
        alert3Btn.click();
        Thread.sleep(1000);
        Alert confirm3Alert=driver.switchTo().alert();
        Thread.sleep(2000);
        alert3Btn.sendKeys("ibrahim ghada");
        confirm3Alert.accept();
        Thread.sleep(1000);



    }
}
