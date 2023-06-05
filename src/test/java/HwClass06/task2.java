package HwClass06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class task2 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.syntaxtechs.net/dynamic-data-loading-demo.php");
        WebElement button= driver.findElement(By.cssSelector("button[id= 'save']"));
        button.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        WebElement firstName= driver.findElement(By.xpath("//*[@id='First-Name']/p"));
        firstName.getText();
        System.out.println(firstName.getText());


    }
}
