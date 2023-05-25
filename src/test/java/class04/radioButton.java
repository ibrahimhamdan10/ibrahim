package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radioButton {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.syntaxtechs.net/basic-radiobutton-demo.php");
        WebElement r1= driver.findElement(By.xpath(" //input[@value='Male' and @name='optradio']"));
        r1.click();
        boolean r1IsSelected= r1.isSelected();
        System.out.println(r1IsSelected);
        boolean r1IsDisplayed= r1.isDisplayed();
        System.out.println(r1IsDisplayed);
        boolean r1IsEnabled= r1.isEnabled();
        System.out.println(r1IsEnabled);
        WebElement r2= driver.findElement(By.xpath(" //input[@value='Female' and @name='optradio']"));
        r2.click();
        r1IsSelected=r1.isSelected();
        System.out.println(r1IsSelected);


    }
}
