package class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class windowHandles2 {
        public static void main(String[] args) throws InterruptedException {
        WebDriver driver =new ChromeDriver();
        driver.get("http://accounts.google.com/signup");
        String parent =driver.getWindowHandle();
        System.out.println(parent);
        driver.findElement(By.xpath("//a[text()='Help']")).click();
        System.out.println(driver.getTitle());
        Set<String>allHandles= driver.getWindowHandles();
        System.out.println(allHandles);
        System.out.println(driver.getTitle());

        for (String i : allHandles){
            if(!i.equalsIgnoreCase(parent)){
                driver.switchTo().window(i);
                System.out.println(driver.getTitle());
                Thread.sleep(2000);
                driver.close();
                driver.switchTo().window(parent);
                driver.findElement(By.xpath("//a[text()='Help']")).click();
              }
          }
      }
}
