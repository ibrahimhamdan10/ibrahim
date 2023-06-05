package class06;

import class04.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class implicitWait extends CommonMethods {

    public static void main(String[] args)  {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        WebElement createNewAccountBtn=driver.findElement(By.xpath(" //a[text()=\"Create new account\"]"));
        createNewAccountBtn.click();

        WebElement firstName = driver.findElement(By.xpath("//input[@name='firstname']"));







    }
}
