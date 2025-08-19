package Selenium_classes_B18_11am;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_over {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/drag_drop.html");
        Actions actions = new Actions(driver);


        WebElement bank = driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
        WebElement drop1 = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));

        actions.dragAndDrop(bank,drop1).perform();

        WebElement amount = driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
        drop1 = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));

        actions.dragAndDrop(amount,drop1).perform();


//        driver.get("https://www.browserstack.com/guide/mouse-hover-in-selenium");
//
//        Actions actions = new Actions(driver);
//        WebElement mouse_over_ele = driver.findElement(By.id("developers-dd-toggle"));
//
//        actions.moveToElement(mouse_over_ele).perform();
//        driver.findElement(By.xpath("(//span[text()='Support'])[1]")).click();
//
//
//
    }
}
