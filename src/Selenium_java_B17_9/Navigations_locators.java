package Selenium_java_B17_9;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigations_locators {
    public static void main(String[] args) {
        String url = "https://mail.google.com/mail/u/0/";
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get(url);

    //collecting the actual url
        String act_url = driver.getCurrentUrl();

        if(url.equalsIgnoreCase(act_url)){
            System.out.println("testpass");
        }
        else{
            System.out.println("testfail");
            System.out.println(act_url);
        }

    driver.navigate().to("https://www.facebook.com/");
    driver.navigate().back();
    driver.navigate().refresh();

    driver.close();

//        driver.navigate().refresh();
//        driver.navigate().forward();
//        driver.navigate().back();
//        driver.navigate().to(url);


    }
}