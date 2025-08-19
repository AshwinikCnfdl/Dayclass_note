package Selenium_classes_B18_11am;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

public class Links_handling {
    public static void main(String[] args) throws IOException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://www.amazon.in/");
        driver.navigate().refresh();
        List<WebElement> links = driver.findElements(By.xpath("//a"));
        for(WebElement link : links){
           String url =  link.getAttribute("href");

           if(url == null || url.isEmpty()){
               System.out.println("url is null");
               continue;
           }
           if(url.startsWith("javascript") || url.startsWith("mailto")){
               System.out.println("url coming from js");
               continue;
           }

            HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
            conn.setRequestMethod("HEAD");
            conn.connect();
           int status_code =  conn.getResponseCode();
           if(status_code >= 400){
               System.out.println(url + "not working");
           }
           else{
               System.out.println(url+ "\t"+"working");
           }

        }

    }
}
