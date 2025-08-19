package JavaSelenium_B19_7pm;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Id_name {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        //email textbox
        WebElement email = driver.findElement(By.id("email")); //NoSuchElementException: no such element:
        email.sendKeys("abc@gmail.com");
        //pwd textbox
        driver.findElement(By.name("pass")).sendKeys("abc@123");
        //login button
        driver.findElement(By.name("login")).click();
    }

}
