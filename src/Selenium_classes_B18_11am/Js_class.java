package Selenium_classes_B18_11am;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Js_class {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
//        driver.get("https://www.letskodeit.com/practice");
//
        JavascriptExecutor js = (JavascriptExecutor)driver;
//        js.executeScript("window.scrollBy(0,500);");
//
//        driver.findElement(By.id("hide-textbox")).click();
//       // driver.findElement(By.id("displayed-text")).sendKeys("abc");  ElementNotInteractableException:
//        js.executeScript("document.getElementById('displayed-text').value = 'abc';");

        driver.get("https://www.instagram.com/");
        Thread.sleep(800);
        driver.findElement(By.name("username")).sendKeys("abc@Gmail.com");
        driver.findElement(By.name("password")).sendKeys("12345679");
        WebElement ele = driver.findElement(By.xpath("//button[@class=' _aswp _aswr _aswu _asw_ _asx2']"));
        ele.click();
//        js.executeScript("arguments[0].click();",ele);

    }

}
