package JavaSelenium_B19_7pm;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class iframes {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//        driver.get("https://www.letskodeit.com/practice");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,750);");


//        driver.findElement(By.id("hide-textbox")).click();
//        js.executeScript("document.getElementById('displayed-text').value = 'xyz@gmail.com';");

//
        driver.get("https://www.instagram.com/");
        Thread.sleep(800);
        driver.findElement(By.name("username")).sendKeys("abc@gmail.com");
        driver.findElement(By.name("password")).sendKeys("12345679");
        WebElement ele = driver.findElement(By.xpath("//button[@class=' _aswp _aswr _aswu _asw_ _asx2']"));
//        ele.click();
        js.executeScript("arguments[0].click();",ele);



        //        driver.findElement(By.id("displayed-text")).sendKeys("abc@gmail.com");//ElementNotInteractableException: element not interactable

//        driver.switchTo().frame("a077aa5e");
//        driver.findElement(By.xpath("//img[@src='Jmeter720.png']")).click();
//
//        driver.switchTo().defaultContent();
//        driver.findElement(By.id("philadelphia-field-email")).sendKeys("abc@gmail.com");
//
////        driver.get("https://jqueryui.com/datepicker/");
////        driver.switchTo().frame(0);
////        driver.findElement(By.id("datepicker")).sendKeys("08/15/2026");
////        //datepicker

    }
}
