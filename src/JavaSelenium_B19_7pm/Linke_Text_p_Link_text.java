package JavaSelenium_B19_7pm;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class Linke_Text_p_Link_text {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/");

        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println(links);//[ele1,ele2]
        System.out.println(links.size());

        for(WebElement i : links){
            System.out.println(i.getText());
        }

















//        WebDriver driver = new FirefoxDriver();
//        driver.manage().window().maximize();
//        driver.get("https://www.google.com/");
//        //collecting the web ele
//        WebElement gmail = driver.findElement(By.linkText("Gmail"));
//        if(gmail.isDisplayed()){
//            gmail.click();
//        }
//        else{
//            System.out.println("gmail ele not present");
//        }
//        driver.navigate().back();
//      WebElement  images =  driver.findElement(By.linkText("Images"));
//
//      if(images.isDisplayed()){
//          images.click();
//      }
//      else{
//          System.out.println("image ele not present");
//      }
//
//    String page_title = driver.getTitle();
//
//      if(page_title.equalsIgnoreCase("Google Images")){
//          System.out.println("test pass");
//      }
//      else{
//          System.out.println("test Fail");
//      }

    }


}


