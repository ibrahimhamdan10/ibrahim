package hwClass1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class task1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.manage().window().maximize();
        driver.findElement(By.id("customer.firstName")).sendKeys("ibrahim");
        driver.findElement(By.name("customer.lastName")).sendKeys("Hamdan");
        driver.findElement(By.id("customer.address.street")).sendKeys("1234");
        driver.findElement(By.id("customer.address.city")).sendKeys("springfield");
        driver.findElement(By.name("customer.address.state")).sendKeys("virginia");
        driver.findElement(By.name("customer.address.zipCode")).sendKeys("22145");
        driver.findElement(By.name("customer.phoneNumber")).sendKeys("123456789");
        driver.findElement(By.id("customer.ssn")).sendKeys("223_121_3451");
        driver.findElement(By.name("customer.username")).sendKeys("ibrahim hamdan");
        driver.findElement(By.id("customer.password")).sendKeys("ibrahim1987");
        driver.findElement(By.name("repeatedPassword")).sendKeys("ibrahim1987");
        Thread.sleep(5000);
        driver.quit();
    }
}
