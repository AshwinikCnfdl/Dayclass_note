package Selenium_java_B17_9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class exp_wait_exg {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        WebDriverWait wait = new
                WebDriverWait(driver,Duration.ofSeconds(20));


        driver.get("http://uitestingplayground.com/ajax");
        driver.findElement(By.id("ajaxButton")).click();
        WebElement ele = driver.findElement(By.xpath("//p[text()='Data loaded with AJAX get request.']"));

        wait.until(d-> ele.isDisplayed());
        System.out.println(ele.getText());
    }
}
