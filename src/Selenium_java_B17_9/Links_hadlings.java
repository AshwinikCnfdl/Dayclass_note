package Selenium_java_B17_9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.MalformedURLException;
import java.time.Duration;
import java.util.List;
import java.net.HttpURLConnection;
import java.net.URL;
public class Links_hadlings {

    public static void main(String[] args) throws IOException, InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://www.amazon.in/");
        driver.navigate().refresh();
        Thread.sleep(1000);
        List<WebElement> links = driver.findElements(By.xpath("//a"));
        for(WebElement link : links){
          String url = link.getAttribute("href");

          if(url == null || url.isEmpty()){
              System.out.println("url is null");
              continue;
          }
          if(url.startsWith("javascript")){
              System.out.println("url is coming from js");
              continue;
          }

            HttpURLConnection  conn = (HttpURLConnection)   (new URL(url).openConnection());

          conn.setRequestMethod("HEAD");
          conn.connect();
            int s_code = conn.getResponseCode();
            if(s_code >= 400){
                System.out.println(url + "link not working fine" + s_code);
            }
            else{
                System.out.println(url + "link working fine" + s_code);
            }



        }

    }
}
