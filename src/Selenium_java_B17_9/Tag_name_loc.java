package Selenium_java_B17_9;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Tag_name_loc {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Books", Keys.ENTER);
        List<WebElement> Books = driver.findElements(By.xpath("//h2[@class='a-size-medium a-spacing-none a-color-base a-text-normal']"));

        for(WebElement book : Books){
            System.out.println(book.getText());
        }



//        driver.get("https://www.flipkart.com/");
//
//        //links
//        List<WebElement> links = driver.findElements(By.tagName("a"));
//
//        System.out.println(links);
//        System.out.println(links.size());
//
//        for(WebElement link : links){
//            System.out.println(link.getAttribute("href"));
//        }

        //list




        //a links
        //img images
        //table
        //ul :--under
        //ol :-- order
        //li :-- list items
        //tr :-- table rows
        //td :-- col table

    }
}
