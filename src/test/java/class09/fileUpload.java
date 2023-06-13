package class09;

import Utlis.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class fileUpload extends CommonMethods {
    public static void main(String[] args) {
        String url = "https://the-internet.herokuapp.com/upload";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);

        //find the element which u can click to upload the file
        WebElement fileUploadBtn = driver.findElement(By.xpath("//input[@id='file-upload']"));
        fileUploadBtn.sendKeys("C:\\Users\\ibrah\\IdeaProjects\\SDETjavaBatch16");

    }
}
