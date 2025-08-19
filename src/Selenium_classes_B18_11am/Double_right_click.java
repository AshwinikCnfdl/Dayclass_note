package Selenium_classes_B18_11am;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Double_right_click {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/simple_context_menu.html");

        Actions action = new Actions(driver);

        WebElement double_click = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
        action.doubleClick(double_click).perform();
//        WebElement right_click = driver.findElement(By.xpath("//span[text()='right click me']"));
//
//        action.contextClick(right_click).perform();
//
//        driver.findElement(By.xpath("//span[text()='Edit']")).click();

    }

}

