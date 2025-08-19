package B25_;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ID_name_link {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demowebshop.tricentis.com/register");
        driver.findElement(By.name("FirstName")).sendKeys("abc");
        driver.findElement(By.id("LastName")).sendKeys("a");
        driver.findElement(By.name("Email")).sendKeys("Abc@gmail.com");
        driver.findElement(By.name("Password")).sendKeys("abc@123");
        driver.findElement(By.name("ConfirmPassword")).sendKeys("abc@123");
        driver.findElement(By.name("register-button")).click();





//        driver.get("https://www.instagram.com/");
//        driver.findElement(By.name("username")).sendKeys("abc@gmail.com");
//        driver.findElement(By.name("password")).sendKeys("123456789");
//        driver.findElement(By.cssSelector("button[class=' _aswp _aswr _aswu _asw_ _asx2']")).click();

//        driver.get("https://www.amazon.in/");
//        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("books");
//        driver.findElement(By.id("nav-search-submit-button")).click();

    }



}
