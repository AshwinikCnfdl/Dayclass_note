package Selenium_classes_B18_11am;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Iframs {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/guru99home/");
        Thread.sleep(1000);
        driver.switchTo().frame("a077aa5e");
        driver.findElement(By.xpath("//img[@src=\"Jmeter720.png\"]")).click();

        driver.switchTo().defaultContent();

        Set<String> winds = driver.getWindowHandles();
        List<String> win = new ArrayList<>(winds);
        Thread.sleep(800);

        driver.findElement(By.id("philadelphia-field-email")).sendKeys("abc@gmail.com");
        driver.findElement(By.id("philadelphia-field-submit")).click();
        Thread.sleep(800);
        driver.switchTo().alert().accept();

        driver.switchTo().window( win.get(1));
//awf_field-93653884
        driver.findElement(By.name("email")).sendKeys("abc@gmail.com");
        driver.findElement(By.id("af-submit-image-482158182")).click();



    }
}
