package JavaSelenium_B19_7pm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locotors {

    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']")).click();



        //        driver.findElement(By.id("u_0_0_4r")).click();
//        driver.findElement(By.name("email")).sendKeys("abc@gmail.com");
//        driver.findElement(By.name("pass")).sendKeys("123456789");
//        driver.findElement(By.name("login")).click();
//        driver.findElement(By.linkText("Forgotten password?")).click();

    }
}
