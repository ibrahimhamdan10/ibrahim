package HwClass02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class task1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text()='Create new account']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("ibrahim");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("hamdan");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("5710982345");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("khaledibrahim");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//img[@class='_8idr img']")).click();
        Thread.sleep(2000);
        driver.quit();
    }
}
