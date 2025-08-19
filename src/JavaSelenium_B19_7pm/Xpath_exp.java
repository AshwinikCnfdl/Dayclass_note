package JavaSelenium_B19_7pm;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Xpath_exp {

    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://www.amazon.in/");
        driver.navigate().refresh();

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Books", Keys.ENTER);
        driver.findElements(By.tagName("a"));
        List<WebElement> img = driver.findElements(By.xpath("//a"));
        System.out.println(img.size());

        for(WebElement i : img){
            System.out.println(i.getAttribute("href"));
        }


    }
}
