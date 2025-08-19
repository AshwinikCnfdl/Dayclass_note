package Selenium_java_B17_9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class Waits_Classes {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver  = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://www.amazon.in/");
        WebElement birthday_day = driver.findElement(By.id("searchDropdownBox"));

        Select select = new Select(birthday_day);
        select.selectByVisibleText("Amazon Fashion");

        WebElement selected_op = select.getFirstSelectedOption();
        System.out.println(selected_op.getText());

        //collect the all options
        List<WebElement> options = select.getOptions();
        for(WebElement option : options){
            System.out.println(option.getText());
        }

        //deselect
//        select.deselectByVisibleText("Amazon Fashion"); //UnsupportedOperationException: You may only deselect options of a multi-select
        System.out.println(select.isMultiple());




    }
}
