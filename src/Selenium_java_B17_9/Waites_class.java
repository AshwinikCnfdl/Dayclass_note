package Selenium_java_B17_9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Waites_class {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));

        driver.get("https://www.letskodeit.com/practice");

        driver.findElement(By.id("displayed-text")).sendKeys("abc@123");
        driver.findElement(By.id("hide-textbox")).click();
        WebElement ele = driver.findElement(By.id("displayed-text"));//.sendKeys("xyz@123");//ElementNotInteractableException: element not interactable

        wait.until(d -> ele.isDisplayed());
        ele.clear();
        ele.sendKeys("xyz@123");


//        if(ele.isDisplayed()){
//            ele.sendKeys("xyz@23");
//        }
//        else{
//            System.out.println("ele not dis");
//        }

//        driver.get("https://www.makemytrip.com/");
//        driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number']")).sendKeys("09964321884");
//        Thread.sleep(500);
//        driver.findElement(By.xpath("//span[text()='Continue']")).click();
//
//        WebElement otp = driver.findElement(By.linkText("Resend OTP"));//NoSuchElementException

//        if(otp.isEnabled()){
//            otp.click();
//        }
//        else{
//            System.out.println("otp not enable");
//        }

//        driver.get("https://www.letskodeit.com/practice");

//        driver.findElement(By.id("displayed-text")).sendKeys("abc@123");
//        driver.findElement(By.id("hide-textbox")).click();
//        WebElement ele = driver.findElement(By.id("displayed-text"));//.sendKeys("xyz@123");//ElementNotInteractableException: element not interactable
//
//        if(ele.isDisplayed()){
//            ele.sendKeys("xyz@23");
//        }
//        else{
//            System.out.println("ele not dis");
//        }
// explicit wait:--condition based on time
    }

}
