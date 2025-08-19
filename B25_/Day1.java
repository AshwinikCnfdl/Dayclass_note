package B25_;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Day1 {
    public static void main(String[] args) {
        String url = "https://www.facebook.com/";
        //open browser
        WebDriver driver = new ChromeDriver();
//      WebDriver  driver = new FirefoxDriver();

        driver.manage().window().maximize();
        driver.get(url);//get method navigate to url / url in he String

        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());

        if(url.equalsIgnoreCase(driver.getCurrentUrl())){
            System.out.println("test pass");
        }
        else{
            System.out.println("test fail");
        }
        driver.close();
    }


}
