package JavaSelenium_B19_7pm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Date_handling {
    public static void main(String[] args) {
        String m = "November 2026";
        String d = "25";
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://jqueryui.com/datepicker/");
        driver.switchTo().frame(0);

        driver.findElement(By.id("datepicker")).click();
        String my = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();

        while (true) {
            if (my.equalsIgnoreCase(m)) {
                List<WebElement> dates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//a"));
                for (WebElement date : dates) {
                    if (date.getText().equalsIgnoreCase(d)) {
                        date.click();
                    }
                }
                break;
            }
            else {
                driver.findElement(By.xpath("//span[text()='Next']")).click();
                my = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
            }


        }
    }
}



