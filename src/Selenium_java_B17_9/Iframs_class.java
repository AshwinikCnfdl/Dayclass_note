package Selenium_java_B17_9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Iframs_class {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://demo.guru99.com/test/guru99home/");
        driver.switchTo().frame("a077aa5e");
        driver.findElement(By.xpath("//img[@src=\"Jmeter720.png\"]")).click();//NoSuchElementException: no such element: Unable to locate element:

        driver.switchTo().defaultContent();

        Set<String> winds = driver.getWindowHandles();
        List<String> wind1 = new ArrayList<>(winds);
        driver.switchTo().window(wind1.get(1));
        driver.findElement(By.name("email")).sendKeys("abc@gmail.com");
        driver.findElement(By.name("submit")).click();

        driver.switchTo().window(wind1.getFirst());
        driver.findElement(By.id("philadelphia-field-email")).sendKeys("abc@gmail.com");
        driver.findElement(By.id("philadelphia-field-submit")).click();

    }

}
