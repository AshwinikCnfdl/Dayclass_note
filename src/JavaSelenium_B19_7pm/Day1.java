package JavaSelenium_B19_7pm;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class Day1 {

    public static void main(String[] args) {

//        1.open the ChromeBrowser
        WebDriver driver = new ChromeDriver();
        //        2.max
        driver.manage().window().maximize(); // method chaining
//        3.url
        driver.get("https://www.instagram.com/"); // navigate to url it takes arg url in the form of String
        // except page_name = "login"
        String except = "instagram";

//        actual :-- validate
        String actu_title = driver.getTitle(); // it returns the Title of the webpage

        if(actu_title.equalsIgnoreCase(except)){
            System.out.println(actu_title);
            System.out.println("Test  Passs");
        }
        else{
            System.out.println("Test Fail");
        }
        driver.close();
//        browser close


    }
}
