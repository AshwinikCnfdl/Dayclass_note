package B25_;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Links_ {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demowebshop.tricentis.com/");
        driver.findElement(By.partialLinkText("Books")).click();
        List<WebElement> add_to_cart = driver.findElements(By.cssSelector("input[value='Add to cart']"));

        for(WebElement i : add_to_cart){
            i.click();
            Thread.sleep(500);

        }




//        driver.get("https://www.flipkart.com/");
////        driver.findElement(By.linkText("Forgotten password?")).click();
//        List<WebElement> links = driver.findElements(By.tagName("img"));
//        System.out.println(links.size());
//
//        for(WebElement link : links){
////            System.out.print(link.getText());
//            System.out.println(link.getAttribute("src"));
//        }

    }
}
