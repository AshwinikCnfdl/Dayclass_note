package JavaSelenium_B19_7pm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_id_ {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");

        // type mail/ph
//        driver.findElement() :arguments locators
        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("abc@gamil.com");

        driver.findElement(By.name("pass")).sendKeys("abc@123");
        driver.findElement(By.name("login")).click();

    }
}
