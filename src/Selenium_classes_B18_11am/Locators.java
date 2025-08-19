package Selenium_classes_B18_11am;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        WebElement email_tb = driver.findElement(By.id("email"));
        //typing sendKeys
        email_tb.sendKeys("abc@gmail.com");

        driver.findElement(By.name("pass")).sendKeys("abc@123");
        driver.findElement(By.name("login")).click();

    }
}
