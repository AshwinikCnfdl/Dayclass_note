package Selenium_classes_B18_11am;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Demo_class {
    public static void main(String[] args) {

        String m = "September 2025";
        int d = 15;
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/datepicker/");
        driver.switchTo().frame(0);
        driver.findElement(By.id("datepicker")).click();
        WebElement ele = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']"));

        while (true){
        if(ele.getText().equalsIgnoreCase(m)){
            List<WebElement> dates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//a"));
            dates.get(d-1).click();
            break;
        }
        else {
            driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
            ele = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']"));
        }}


    }
}
