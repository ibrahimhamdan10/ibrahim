package HwClass06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class task1 {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.syntaxtechs.net/dynamic-elements-loading.php");
        driver.manage().window().maximize();

        WebElement button= driver.findElement(By.xpath("//button[@id='startButton']"));
        button.click();

        WebElement text= driver.findElement(By.xpath(" //h4[text()=\"Welcome Syntax Technologies\"]"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.textToBePresentInElement(text,"Welcome Syntax Technologies"));
        System.out.println("The text after clicking start button is: "+text.getText());
        driver.close();


    }
}
