package Selenium_java_B17_9;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class hiden_ele {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//        driver.get("https://www.letskodeit.com/practice");
//
////        child_class downcasting_obj = (child_class) upcasted_var;
        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,500);");
//
//        driver.findElement(By.id("hide-textbox")).click();
////        driver.findElement(By.id("displayed-text")).sendKeys("Rani"); //ElementNotInteractableException:
//        js.executeScript("document.getElementById('displayed-text').value = 'Rani';");
        driver.get("https://www.instagram.com/");
        Thread.sleep(800);
        driver.findElement(By.name("username")).sendKeys("abc@gmail.com");
        driver.findElement(By.name("password")).sendKeys("12345679");
        WebElement ele = driver.findElement(By.xpath("//button[@class=' _aswp _aswr _aswu _asw_ _asx2']"));

        js.executeScript("arguments[0].click();",ele);


    }
}
