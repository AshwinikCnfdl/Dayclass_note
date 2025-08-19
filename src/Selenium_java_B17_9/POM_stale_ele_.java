package Selenium_java_B17_9;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class POM_stale_ele_ {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        try {
            WebElement ele = driver.findElement(By.name("q"));
            driver.navigate().refresh();
            ele.sendKeys("Books");//old
        }
        catch (StaleElementReferenceException e){
            WebElement ele = driver.findElement(By.name("q"));
            ele.sendKeys("Books");
        }
    }
//pom

}
