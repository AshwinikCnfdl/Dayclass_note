package Selenium_java_B17_9;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Demo_class {
    public static void main(String[] args) {
        String  m = "March 2026";
        int date = 15;
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://jqueryui.com/datepicker/");
        driver.switchTo().frame(0);

        driver.findElement(By.id("datepicker")).click();
        WebElement ele = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']"));

       while(true) {
        if(ele.getText().equalsIgnoreCase(m)){
            List<WebElement> dates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//a"));//[1,2,3,4,5...]
            dates.get(date-1).click();
                break;
        }
        else{
            driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
            ele = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']"));

        }
    }}
}
