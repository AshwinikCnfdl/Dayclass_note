package Selenium_classes_B18_11am;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Linktext_p {
    public static void main(String[] args) throws InterruptedException {
      WebDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://demowebshop.tricentis.com/");
      Thread.sleep(1000);
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println(links); //[ele1,ele2,ele3.....]
        System.out.println(links.size());

        for(WebElement link : links){
            System.out.println(link.getAttribute("href"));
        }
//      driver.findElement(By.partialLinkText("Computers")).click();
        //30hr


    }
}
