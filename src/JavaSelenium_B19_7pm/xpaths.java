package JavaSelenium_B19_7pm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpaths {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.cssSelector("a[class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]")).click();
        driver.findElement(By.name("firstname")).sendKeys("abc");
        driver.findElement(By.name("lastname")).sendKeys("x");
        driver.findElement(By.xpath("(//label[@class='_58mt'])[1]")).click();
        driver.findElement(By.xpath("(//input[@type=\"text\"])[5]")).sendKeys("1234567891");
        driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("123456789");
        driver.findElement(By.name("websubmit")).click();
        //xapth
    }
}
