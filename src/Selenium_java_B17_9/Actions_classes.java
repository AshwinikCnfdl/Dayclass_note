package Selenium_java_B17_9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.time.Duration;
public class Actions_classes {

    static  Actions actions;
   static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {

        driver = new ChromeDriver();
        actions = new Actions(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://demo.guru99.com/test/drag_drop.html");

        WebElement drag_ele = driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
        WebElement drop_ele = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));

        actions.dragAndDrop(drag_ele,drop_ele).perform();

//        driver.get("https://demo.guru99.com/test/simple_context_menu.html");
//        WebElement ele = driver.findElement(By.xpath("//span[text()='right click me']"));
//
//        actions.contextClick(ele).perform();
//        driver.findElement(By.xpath("//span[text()='Edit']")).click();
//        //UnhandledAlertException:
//        driver.switchTo().alert().accept();
//        //double click
//
//
//        WebElement ele1 = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
//        actions.doubleClick(ele1).perform();
//        driver.switchTo().alert().accept();
//




//
//        //right click
//        Actions actions = new Actions(driver);
//        WebElement ele = driver.findElement(By.xpath("//span[text()='right click me']"));
//
////        actions.contextClick(ele).perform();
////        driver.findElement(By.xpath("//span[text()='Edit']")).click();



//        Actions actions = new Actions(driver);//create a abject for actions class then pass driver instance as a argrument
//        WebElement ele = driver.findElement(By.id("developers-dd-toggle"));
//        //methods
//        Thread.sleep(600);
//        actions.moveToElement(ele).perform();
//        //movetoele then we need pass web ele as a arg
//        driver.findElement(By.xpath("(//span[text()='Support'])[1]")).click();



    }
}
