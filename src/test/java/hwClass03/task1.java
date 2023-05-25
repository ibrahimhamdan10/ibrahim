package hwClass03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.syntaxtechs.net/input-form-demo.php");
        driver.manage().window().maximize();
        WebElement firstName= driver.findElement(By.cssSelector(" input[name= 'first_name']"));
        firstName.sendKeys("ibrahim");
        WebElement lastName= driver.findElement(By.cssSelector(" input[name= 'last_name']"));
        lastName.sendKeys("hamdan");
        WebElement email=driver.findElement(By.xpath("//input[contains(@placeholder, 'E-Mail Address')]"));
        email.sendKeys("ibrahimhamdan9080@hotmail.com");
        WebElement phone= driver.findElement(By.xpath("//input[contains(@name, 'phone')]"));
        phone.sendKeys("5556664512");
        WebElement address= driver.findElement(By.cssSelector(" input[name= 'address']"));
        address.sendKeys("2345 road");
        WebElement city =driver.findElement(By.cssSelector(" input[name= 'city']"));
        city.sendKeys("springfield");
        WebElement button= driver.findElement(By.cssSelector(" select[name= 'state']"));
        button.click();
        Thread.sleep(1000);
        WebElement state= driver.findElement(By.xpath("//option[text()=\"Virginia\"]"));
        state.click();
        WebElement zip=  driver.findElement(By.xpath(" //input[@name='zip']"));
        zip.sendKeys("22345");
        WebElement website= driver.findElement(By.xpath(" //input[@name='website']"));
        website.sendKeys("syntax.com");
        WebElement hosting= driver.findElement(By.xpath(" //input[@value='yes']"));
        hosting.click();
        WebElement description= driver.findElement(By.cssSelector("textarea[class= 'form-control']"));
        description.sendKeys("selenium is great");
        driver.quit();
    }
}
