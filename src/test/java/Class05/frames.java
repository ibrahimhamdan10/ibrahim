package Class05;

import class04.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class frames extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://chercher.tech/practice/frames");
        driver.switchTo().frame(1);
        WebElement animal=driver.findElement(By.xpath("//b[text()='Animals :']"));
        System.out.println(animal.getText());
        WebElement dropDown= driver.findElement(By.cssSelector("select[id= 'animals']"));
        dropDown.click();
        Thread.sleep(1000);
        Select obj = new Select(dropDown);
        obj.selectByVisibleText("Baby Cat");

        driver.switchTo().defaultContent();

        driver.switchTo().frame("iamframe");
        WebElement textBox=driver.findElement(By.xpath("//input"));
        textBox.sendKeys("abracadabra");
        Thread.sleep(1000);

        WebElement frame3= driver.findElement(By.cssSelector("iframe[id= 'frame3']"));
        driver.switchTo().frame(frame3);
        driver.findElement(By.id("a")).click();

    }
}
