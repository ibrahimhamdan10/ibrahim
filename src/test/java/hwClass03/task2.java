package hwClass03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login%E2%80%9D");
        driver.manage().window().maximize();
        WebElement userName= driver.findElement(By.cssSelector(" input[name = 'txtUsername']"));
        userName.sendKeys("Admin");
        WebElement loginBtn= driver.findElement(By.cssSelector(" input[id= 'btnLogin']"));
        loginBtn.click();
        Thread.sleep(1000);
        var error= driver.findElement(By.xpath("//span[contains(text(), 'Password cannot be empty')]"));
        Thread.sleep(1000);
        if(error.getText().equals("Password cannot be empty")){

            System.out.println("massage is displayed");
        }else
            System.out.println("error");
    }
}
