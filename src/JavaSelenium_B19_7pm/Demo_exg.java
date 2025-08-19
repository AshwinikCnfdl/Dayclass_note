package JavaSelenium_B19_7pm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_exg {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        WebElement ele = driver.findElement(By.name("q"));

        if(ele.isDisplayed()){
            ele.sendKeys("Books");
        }
        else{
            System.out.println("ele not present");
        }
        Thread.sleep(1000);
        WebElement serach_ele = driver.findElement(By.name("btnK"));
        if(serach_ele.isEnabled()){
            serach_ele.click();
        }
        else{
            System.out.println("ele not enable");
        }
        String title = driver.getTitle();
        if(title.contains("Books")){
            System.out.println("test pass");
        }
        else{
            System.out.println("test Fail");
        }
    }
}
