package JavaSelenium_B19_7pm;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Xpath_by_text {
    public static void main(String[] args) {

        WebDriver driver  = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.amazon.in/");
        driver.navigate().refresh();
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Books", Keys.ENTER);
        List<WebElement> Books = driver.findElements(By.xpath("//h2[@class='a-size-medium a-spacing-none a-color-base a-text-normal']"));

                for(WebElement link : Books){
            System.out.println(link.getText());

        }
        //        driver.get("https://demowebshop.tricentis.com/");
//
//        List<WebElement> links = driver.findElements(By.tagName("a"));
//        System.out.println(links.size());
//
//        for(WebElement link : links){
//            System.out.println(link.getText());
//
//        }
////links
//
//        for(WebElement link : links){
//            System.out.println(link.getAttribute("href"));
//
//        }



//        driver.findElement(By.xpath("//label[text()='Excellent']")).click();
//        driver.findElement(By.xpath("//label[text()='Good']")).click();
//        driver.findElement(By.xpath("//input[@value='Vote']")).click();


    }
}
