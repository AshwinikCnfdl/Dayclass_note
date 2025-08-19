package JavaSelenium_B19_7pm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
//        driver.get("https://www.facebook.com/");
//        driver.findElement(By.linkText("Forgotten password?")).click();//u_0_6_Ir
//        driver.findElement(By.id("identify_email")).sendKeys("abc@gmail.com");
//        driver.findElement(By.name("did_submit")).click();

            driver.get("https://www.facebook.com/");
            driver.findElement(By.cssSelector("a[class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
            driver.findElement(By.name("firstname")).sendKeys("abc");
            driver.findElement(By.name("lastname")).sendKeys("y");
            driver.findElement(By.cssSelector("input[value='1']")).click();
            driver.findElement(By.name("reg_email__")).sendKeys("1234567891");
            driver.findElement(By.id("password_step_input")).sendKeys("abc@123");
            driver.findElement(By.name("websubmit")).click();

    }
}
