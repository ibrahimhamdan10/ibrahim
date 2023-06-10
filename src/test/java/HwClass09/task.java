package HwClass09;

import Utlis.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class task extends CommonMethods {
    public static void main(String[] args) {
        String url="http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";
        openBrowserAndLaunchApplication(url,"chrome");
        WebElement userName= driver.findElement(By.cssSelector("input[id= 'txtUsername']"));
        userName.sendKeys("Admin");
        WebElement password= driver.findElement(By.cssSelector("input[id= 'txtPassword']"));
        password.sendKeys("Hum@nhrm123");
        WebElement lgnBtn= driver.findElement(By.cssSelector("input[id= 'btnLogin']"));
        lgnBtn.click();

        WebElement Recruitment = driver.findElement(By.xpath(" //b[text()='Recruitment']"));
        Recruitment.click();

        WebElement celender = driver.findElement(By.xpath("//img[@class='ui-datepicker-trigger']"));
        celender.click();

        WebElement yearDropDown = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
        yearDropDown.click();
        Select options = new Select(yearDropDown);
        options.selectByVisibleText("2003");

        WebElement monthDropDown = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
        monthDropDown.click();
        Select options2 = new Select(monthDropDown);
        options2.selectByVisibleText("Feb");

            List<WebElement>allDays= driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
            for (WebElement store :allDays) {
                String days = store.getText();
                if (days.equals("7")) {
                    store.click();
                    break;
                }
            }
        }
     }


