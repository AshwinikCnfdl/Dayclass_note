package JavaSelenium_B19_7pm;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Xpath_locators {
    public static void main(String[] args){


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.amazon.in/");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Books", Keys.ENTER);
        List<WebElement> books = driver.findElements(By.cssSelector("h2[class='a-size-medium a-spacing-none a-color-base a-text-normal']"));

        for(WebElement book : books){
            System.out.println(book.getText());
//            book.click();
        }
    }}
//input[value='Add to cart']