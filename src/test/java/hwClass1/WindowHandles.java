package hwClass1;

import class04.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandles extends CommonMethods {
    public static void main(String[] args) {
        String url="http://accounts.google.com/signup";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);

//        click on the help button and privacy button
        WebElement helpBtn = driver.findElement(By.linkText("Help"));
        helpBtn.click();

        WebElement privacyBtn = driver.findElement(By.xpath("//a[text()='Privacy']"));
        privacyBtn.click();


//        get the window handle of the main page and print on console
//        also save it for later use
        String mainPageHandle = driver.getWindowHandle();
        System.out.println("main page handle is :"+mainPageHandle);


//        get all the window handles and print the titles associated with each window handle
//        on the console

//        get all handles
        Set<String> allHandles = driver.getWindowHandles();
        for (String handle:allHandles){
            driver.switchTo().window(handle);
            String title = driver.getTitle();
            if (title.equalsIgnoreCase("Google Account Help")){
                break;
            }

        } System.out.println("the current page is :"+driver.getTitle());
        driver.switchTo().window(mainPageHandle);
        System.out.println("the focus us on "+driver.getTitle());
    }
}