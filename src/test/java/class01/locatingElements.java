package class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatingElements {
    public static void main(String[] args) throws InterruptedException {
        //        instance
        WebDriver driver=new ChromeDriver();
//        facebook.com
        driver.get("https://www.facebook.com/");
//        maximize the windows
        driver.manage().window().maximize();

//        send some text in the email
//        find the element                .  send some text
        WebElement email= driver.findElement(By.id("email"));
        email.sendKeys("moazam@gmail.com");
        Thread.sleep(1000);


//          send some text to the password field
        WebElement pass =driver.findElement(By.name("pass"));
        pass.sendKeys("abracadbara");
        Thread.sleep(1000);


//         print the url on console
        String url = driver.getCurrentUrl();
        System.out.println(url);

//        print the title on the console
        String title = driver.getTitle();
        System.out.println(title);
//        confirm that the title is "Facebook – log in or sign up"
        if(title.equals("Facebook – log in or sign up")){
            System.out.println("the title is correct");
        }
        else{
            System.out.println("the title is incorrect");
        }
//        close
        driver.quit();
    }
}
