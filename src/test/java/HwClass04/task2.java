package HwClass04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class task2 {
    public static void main(String[] args) throws InterruptedException {
     WebDriver driver = new ChromeDriver();
     driver.get("https://www.facebook.com/login/");
     driver.manage().window().maximize();
     WebElement create=driver.findElement(By.xpath("//a[text()=\"Create new account\"]"));
     create.click();
     WebElement month=driver.findElement(By.cssSelector(" select[id= 'month']"));
     month.click();
     Thread.sleep(1000);
        Select obj = new Select(month);
        obj.selectByVisibleText("Feb");
        WebElement day =driver.findElement(By.cssSelector(" select[id= 'day']"));
        day.click();
        Thread.sleep(1000);
        Select obj2 = new Select(day);
        obj2.selectByVisibleText("7");
        WebElement year =driver.findElement(By.cssSelector("  select[id= 'year']"));
        year.click();
        Thread.sleep(1000);
        Select obj3 = new Select(year);
        obj3.selectByValue("2003");
        WebElement close =driver.findElement(By.cssSelector("  select[id= 'year']"));
        year.click();
        Thread.sleep(3000);
        driver.quit();


    }
}
