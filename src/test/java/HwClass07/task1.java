package HwClass07;

import Utlis.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class task1 extends CommonMethods {
    public static void main(String[] args) {
        openBrowserAndLaunchApplication("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login","chrome");
        WebElement userName = driver.findElement(By.xpath("//input[@id='txtUsername']"));
        userName.sendKeys("Admin");
        WebElement passWord = driver.findElement(By.xpath("//input[@id='txtPassword']"));
        passWord.sendKeys("Hum@nhrm123");
        WebElement lgnBtn= driver.findElement(By.xpath("//input[@id='btnLogin']"));
        lgnBtn.click();
        WebElement pim=driver.findElement(By.xpath(" //b[text()='PIM']"));
        pim.click();

        List<WebElement> allData =driver.findElements(By.xpath("//table//tbody//tr//td[2]"));
        for (int i = 0; i <allData.size() ; i++) {
            String id =allData.get(i).getText();
            if(id.equals("56363A")){
                System.out.println("row number of 56363A is "+(i+1));
                break;
            }
        }
        driver.quit();
    }
}
