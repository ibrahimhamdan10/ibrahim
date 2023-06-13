package class09;

import Utlis.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class e2 extends CommonMethods {
    public static void main(String[] args) {

            String url = "http://demo.guru99.com/test/simple_context_menu.html";
            String browser = "chrome";
            openBrowserAndLaunchApplication(url, browser);


//        find the element to be right click
            WebElement rightClickBtn = driver.findElement(By.xpath("//span[text()='right click me']"));

//        Action class
            Actions action=new Actions(driver);
//        perform the right click
//        right click is also called context click
            action.contextClick(rightClickBtn).perform();


        }
    }

