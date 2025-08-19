package Selenium_java_B17_9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Demo_sen {


   static void Test_1(String fn,String ln,String email,String pwd){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demowebshop.tricentis.com/register");
        driver.findElement(By.id("FirstName")).sendKeys(fn);
        driver.findElement(By.id("LastName")).sendKeys(ln);
        driver.findElement(By.id("Email")).sendKeys(email);
        driver.findElement(By.id("Password")).sendKeys(pwd);
        driver.findElement(By.id("ConfirmPassword")).sendKeys(pwd);
        driver.findElement(By.id("register-button")).click();
        try{
        List<WebElement> error = driver.findElements(By.xpath("//span[@class='field-validation-error']"));
        for(WebElement i : error){
            System.out.println(i.getText());
        }
            System.out.println(driver.findElement(By.xpath("//div[@class='validation-summary-errors']")).getText());
        }
        catch (Exception e){
                System.out.println("user created");
        }
    }

    public static void main(String[] args) {
        Test_1("abc","x","abc@gmail.com","123456789");
        Test_1("","","","");
        Test_1("abc","x","abc","123456789");
        //"abc","x","abc@gmail.com","123456789" error testpass
    }



}
