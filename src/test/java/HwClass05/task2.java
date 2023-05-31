package HwClass05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class task2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://chercher.tech/practice/frames");
        //by id
        driver.switchTo().frame("frame1");
        //locators
        WebElement frame3= driver.findElement(By.xpath("//iframe[@id='frame3']"));
        driver.switchTo().frame(frame3);
        driver.findElement(By.xpath("//input[@type='checkbox']")).click();
        Thread.sleep(2000);
        driver.switchTo().defaultContent();
        driver.switchTo().frame(1);
        WebElement dropDown=driver.findElement(By.cssSelector("select[id= 'animals']"));
        dropDown.click();
        Select obj = new Select(dropDown);
        Thread.sleep(1000);
        obj.selectByVisibleText("Baby Cat");
        Thread.sleep(2000);
        driver.switchTo().defaultContent();
        driver.switchTo().frame("iamframe");
        WebElement input= driver.findElement(By.tagName("input"));
        input.sendKeys("ibrahim ghada");
        Thread.sleep(2000);
        driver.quit();

    }
}
