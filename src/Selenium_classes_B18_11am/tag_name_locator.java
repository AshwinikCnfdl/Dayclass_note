package Selenium_classes_B18_11am;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class tag_name_locator {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.flipkart.com/");

        List<WebElement> links = driver.findElements(By.tagName("img")); // img [ele1,ele2...]
        System.out.println(links);
        System.out.println(links.size());

        for(WebElement link : links){
            System.out.println(link.getAttribute("src")); //src
        }
    }
}
//img
//ol :-- order
//ul :-- unorder
//li :-- list items
//table :-- table
//tr :-- table row
//td :-- table col
//select :-- dropdowns
//option :-- dropdowns options
//iframe :--









