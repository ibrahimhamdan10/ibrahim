package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class commonMethod {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.syntaxtechs.net/basic-radiobutton-demo.php");
        List<WebElement> group = driver.findElements(By.xpath(" //input[@name='ageGroup']"));
        String option = "5 - 15";
        for (WebElement age : group) {
            String value = age.getAttribute("value");
            if (value.equals(option)) {
                age.click();
                age.isSelected();
                System.out.println(age.isSelected());
                break;
            }
        }
        String option2 = "0 - 5";
        for (int i = 0; i < group.size(); i++) {
            WebElement age = group.get(i);
            String value = age.getAttribute("value");
            if (value.equals(option2)) {
                age.click();
                System.out.println(age.isSelected());
                break;
            }


        }
    }
}

