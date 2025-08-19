package Selenium_classes_B18_11am;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.*;

public class pop_ups {

    static  void alert_pop_up(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demowebshop.tricentis.com/");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();
        driver.findElement(By.id("small-searchterms")).sendKeys("Books");
    }

    static void Cal_pop_up() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.makemytrip.com/");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();
        //selenium.ElementClickInterceptedException:
        driver.findElement(By.cssSelector("label[for='departure']")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("(//p[text()='22'])[1]")).click();
    }


    static void file_upload_pop_up() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/upload/");
        Thread.sleep(1000);
        driver.findElement(By.id("uploadfile_0")).sendKeys("C:/Users/hp/Downloads/JavaNotes.pdf");
        driver.findElement(By.id("terms")).click();
        driver.findElement(By.id("submitbutton")).click();

    }

    static void file_download() throws InterruptedException {
        Map<String, Object> prefs = new HashMap<String, Object>(); //
        prefs.put("download.default_directory","H:/Java_demo");

        ChromeOptions option = new ChromeOptions();//setting //import org.openqa.selenium.chrome.ChromeOptions;
        option.setExperimentalOption("prefs",prefs);

        WebDriver driver = new ChromeDriver(option);
        driver.manage().window().maximize();
        Thread.sleep(1000);
        driver.get("https://demo.automationtesting.in/FileDownload.html");
        driver.findElement(By.linkText("Download")).click();

    }

   static void authentication(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
        //https://un:pwd@url

    }
    static void notification(){
        ChromeOptions option = new ChromeOptions();
        option.addArguments("--disable-notifications");

        WebDriver driver = new ChromeDriver(option);
        driver.manage().window().maximize();
        driver.get("https://pushalert.co/demo");
    }

    static void multiple_wind(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demowebshop.tricentis.com/");
        driver.findElement(By.linkText("Facebook")).click();
        driver.findElement(By.linkText("Google+")).click();

        Set<String> winds = driver.getWindowHandles();//{p,c1,c2,c3}
        List<String> winds1 = new ArrayList<>(winds);//[p,c1,c2]
                                                     //0 , 1 , 2
        driver.switchTo().window(winds1.get(2));


        driver.findElement(By.name("email")).sendKeys("abc@gmail.com");
        driver.findElement(By.name("pass")).sendKeys("123456789");
        driver.findElement(By.xpath("(//span[text()='Log in'])[3]")).click();

        driver.switchTo().window(winds1.get(1));
        driver.findElement(By.partialLinkText("Products")).click();
    }

    public static void main(String[] args) throws InterruptedException {

        multiple_wind();
//        notification();
//        authentication();
//        file_download();
//        file_upload_pop_up();


    }



}
