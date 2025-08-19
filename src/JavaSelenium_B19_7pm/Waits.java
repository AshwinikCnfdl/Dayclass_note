package JavaSelenium_B19_7pm;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class Waits {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("http://uitestingplayground.com/ajax");
        driver.findElement(By.id("ajaxButton")).click();

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//p[text()='Data loaded with AJAX get request.']")));

        WebElement text = driver.findElement(By.xpath("//p[text()='Data loaded with AJAX get request.']"));
        if(text.isDisplayed()){
            System.out.println(text.getText());
        }
        else{
            System.out.println("ele not displayed");
        }

    }
}
