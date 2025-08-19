package B25_;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ID_name {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");

        driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
                //locators :->
        driver.findElement(By.name("pass")).sendKeys("123456789");
        driver.findElement(By.name("login")).click();
    }
}
