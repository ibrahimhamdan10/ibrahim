package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class checkBoxes {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.syntaxtechs.net/basic-checkbox-demo.php");
        driver.manage().window().maximize();
        WebElement c1= driver.findElement(By.xpath("//input[@id='isAgeSelected']"));

        if (!c1.isSelected()){
            c1.click();
        }

        List<WebElement>options =driver.findElements(By.xpath("//input[@class='cb1-element']"));
        for(WebElement option:options){
            String value= option.getAttribute("value");
            if(value.equals("Option-1")){
                option.click();
                break;
            }
        }

    }
}
