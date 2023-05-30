package HwClass04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class task1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.syntaxtechs.net/basic-select-dropdown-demo.php");
        driver.manage().window().maximize();
        WebElement list = driver.findElement(By.cssSelector("select[id='select-demo']"));
        list.click();
        Select obj = new Select(list);
        Thread.sleep(1000);
        obj.selectByValue("Tuesday");
        Thread.sleep(1000);
        obj.selectByIndex(5);
        Thread.sleep(1000);
        obj.selectByVisibleText("Friday");
        Thread.sleep(3000);
        driver.quit();


    }
}
