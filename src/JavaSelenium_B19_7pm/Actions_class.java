package JavaSelenium_B19_7pm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Actions_class {

   static void mouse_over(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://www.browserstack.com/");

        Actions actions = new Actions(driver);
        WebElement ele = driver.findElement(By.id("products-dd-toggle"));
        actions.moveToElement(ele).perform();
        driver.findElement(By.xpath("(//span[text()='Live'])[1]")).click();
        driver.close();

    }

    static void right_click() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://demo.guru99.com/test/simple_context_menu.html");

        Actions actions = new Actions(driver);
        WebElement ele = driver.findElement(By.xpath("//span[text()='right click me']"));
        actions.contextClick(ele).perform();

        driver.findElement(By.xpath("//span[text()='Copy']")).click();
        driver.close();

    }

    static void double_click(){
       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
       driver.get("https://demo.guru99.com/test/simple_context_menu.html");

       Actions action = new Actions(driver);
        WebElement ele = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));

        action.doubleClick(ele).perform();
    }

      static void drag_and_drop(){
          WebDriver driver = new ChromeDriver();
          driver.manage().window().maximize();
          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
          driver.get("https://demo.guru99.com/test/drag_drop.html");

          Actions action = new Actions(driver);
          WebElement Bank = driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
          WebElement ph = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]")); //StaleElementReferenceException:

          action.dragAndDrop(Bank,ph).perform();

          WebElement amount = driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
//          ph = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
          action.dragAndDrop(amount,ph).perform();

//POM
      }
    public static void main(String[] args) {

//        mouse_over();
//        right_click();
//            double_click();
        drag_and_drop();

    }

}
