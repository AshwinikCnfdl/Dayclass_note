package Selenium_classes_B18_11am;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;


public class First_script {

    public static void main(String[] args) {
        String url = "https://www.facebook.com/";
        //open browser
        WebDriver driver = new ChromeDriver();
        //max
        driver.manage().window().maximize();
        //get :methods
        driver.get(url);

       String actual_url =  driver.getCurrentUrl();
       if(url.equalsIgnoreCase(actual_url)){
           System.out.println("test pass");
       }
       else{
           System.out.println("test fail");
           System.out.println(actual_url);
       }

    }
}
