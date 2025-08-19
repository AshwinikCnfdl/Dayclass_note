package Selenium_classes_B18_11am;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Pclass {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demowebshop.tricentis.com/");
        driver.findElement(By.xpath("//a[@class='ico-register']")).click();
        driver.findElement(By.id("FirstName")).sendKeys("abc");
        driver.findElement(By.name("LastName")).sendKeys("a");
        driver.findElement(By.name("Email")).sendKeys("abc@m");
        driver.findElement(By.name("Password")).sendKeys("abc@123");
        driver.findElement(By.name("ConfirmPassword")).sendKeys("abc@123");
        driver.findElement(By.name("register-button")).click();
        List<WebElement> error = driver.findElements(By.xpath("//span[@class='field-validation-error']"));
        for(WebElement i : error){
            System.out.println(i.getText());
        }
    }
}
