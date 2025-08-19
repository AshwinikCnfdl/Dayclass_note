package JavaSelenium_B19_7pm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

public class Links_hadling {

    public static void main(String[] args) throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://www.amazon.in/");

        List<WebElement> links = driver.findElements(By.xpath("//a"));

        for(WebElement link : links){
           String url =  link.getAttribute("href");

           if(url == null || url.isEmpty()){
               continue;
           }
           if(url.startsWith("tel") || url.startsWith("javascript")){
               continue;
           }

            HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
            conn.connect();
             int code = conn.getResponseCode();

             if(code > 400){
                 System.out.println(url + "\t link not working");
             }
             else{
                 System.out.println(url + "\t link working");
             }
        }


    }


}
