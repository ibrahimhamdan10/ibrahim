package reviewClass02;

import Utlis.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class waitReviews extends CommonMethods {
    public static void main(String[] args) {
        String path= "https://the-internet.herokuapp.com/dynamic_controls";
        openBrowserAndLaunchApplication(path,"chrome");

        //        find the checkbox and click on it
        WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
        checkbox.click();

//        get the button and click on it
        WebElement removeButton = driver.findElement(By.xpath("//button[text()='Remove']"));
        removeButton.click();
    }
}
