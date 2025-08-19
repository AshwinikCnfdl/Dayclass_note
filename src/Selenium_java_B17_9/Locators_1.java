package Selenium_java_B17_9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_1 {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.facebook.com/");
        WebElement email_tb = driver.findElement(By.id("email"));
        //typing :--sendKeys
        email_tb.sendKeys("abc@gmail.com");

        WebElement pwd_tb = driver.findElement(By.name("pass"));
        pwd_tb.sendKeys("abc@123");

       //click() :-- click on the ele
        driver.findElement(By.name("login")).click();


    }
}
