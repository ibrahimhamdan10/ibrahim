package class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class tables {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //            ******TABLE LEVEL*************
        WebElement wholeTable =driver.findElement(By.xpath("//table[@id='customers']"));
        String allText= wholeTable.getText();
        System.out.println(allText);
                   System.out.println();
        //            ******ROWS LEVEL*************
        List<WebElement> allRows =driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
        for (WebElement row:allRows){
            String rowText= row.getText();
            System.out.println(rowText);
        }
                    System.out.println();
         //     ********  print every data in the table  *********
        List<WebElement>allCellData= driver.findElements(By.xpath("//table[@id='customers']/tbody//tr//td"));
        for (WebElement cells:allCellData){
            String cellData= cells.getText();
            if(cellData.contains("Google")) {
                System.out.println(cellData);
            }
        }
    }
}
