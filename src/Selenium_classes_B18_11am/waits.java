package Selenium_classes_B18_11am;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class waits {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(70));

        driver.get("https://codepen.io/Diwakar-Blogging/pen/bGZeJLg");
        driver.switchTo().frame("CodePen");
        WebElement ele = driver.findElement(By.id("resendBtn"));
        ele.click();
        System.out.println(ele.isEnabled()); //f

        wait.until(d -> ele.isEnabled());
            ele.click();
        System.out.println(ele.isEnabled());


//10days
//15days




//        driver.get("http://uitestingplayground.com/ajax");
//        driver.findElement(By.id("ajaxButton")).click();
//        WebElement ele = driver.findElement(By.xpath("//p[@class='bg-success']"));
//        System.out.println(ele.getText());
//


//        driver.get("https://www.instagram.com/");
//        //NoSuchElementException:
////        Thread.sleep(1000);
//        driver.findElement(By.name("username")).sendKeys("abc@gmail.com");
//        driver.findElement(By.name("password")).sendKeys("12345679");
//        WebElement ele = driver.findElement(By.xpath("//button[@class=' _aswp _aswr _aswu _asw_ _asx2']"));
//        ele.click();
    }
}
