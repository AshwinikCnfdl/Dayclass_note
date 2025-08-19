package JavaSelenium_B19_7pm;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.*;

public class pop_ups {

    static  WebDriver driver;
    static void set_up(){

        Map<String,Object> prefs = new HashMap<String,Object>();
        prefs.put("download.default_directory","C:/Users/hp/IdeaProjects/Java_project_/downloads");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        options.setExperimentalOption("prefs",prefs);

//        {file_location = "location"};


        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }
    static void  alert_pop_up(){

        driver.get("https://demowebshop.tricentis.com/");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        //unexpected alert open
        driver.switchTo().alert().accept();
        driver.findElement(By.id("small-searchterms")).sendKeys("Books", Keys.ENTER);

    }

    static  void authentication_pop_up(){
        set_up();
        String un = "admin";
        String pwd = "admin";
        driver.get("https://"+un+":"+pwd+"@"+"the-internet.herokuapp.com/basic_auth");
//        driver.get("https://the-internet.herokuapp.com/basic_auth");

    }

    static void Calender_pop_up(){
        set_up();
        driver.get("https://www.makemytrip.com/");
        driver.findElement(By.xpath("//span[@data-cy='closeModal']")).click();
        driver.findElement(By.xpath("//label[@for='departure']")).click();
        driver.findElement(By.xpath("(//p[text()='5'])[1]")).click();
    }
    static void file_upload_pop_up(){
        set_up();
        driver.get("https://filebin.net/");
        driver.findElement(By.id("fileField")).sendKeys("C:/Users/hp/Downloads/mock questions.pdf");
        WebElement ele = driver.findElement(By.linkText("mock questions.pdf"));
        if(ele.isDisplayed()){
            System.out.println("file uploaded");
        }
        else{
            System.out.println("file not uploaded");
        }

    }

    static void notification_pop_up(){
        set_up();
        driver.get("https://pushalert.co/demo");

    }

    static  void file_download(){
        set_up();
        driver.get("https://demo.automationtesting.in/FileDownload.html");
        driver.findElement(By.linkText("Download")).click();

    }

    static  void multiple_wind(){
        set_up();
        driver.get("https://demowebshop.tricentis.com/");
        driver.findElement(By.linkText("Facebook")).click();
        driver.findElement(By.linkText("Google+")).click();

        Set<String> winds = driver.getWindowHandles();

        List<String> winds1 = new ArrayList<>(winds);  //[p,c1c,c2]

        //facebooks
        driver.switchTo().window(winds1.get(2));
        driver.findElement(By.name("email")).sendKeys("abc@gmail.com");
        driver.findElement(By.name("pass")).sendKeys("123456789");
        driver.findElement(By.xpath("(//span[text()='Log in'])[3]")).click();

        //google+
        driver.switchTo().window(winds1.get(1));
        driver.findElement(By.name("q")).sendKeys("Books",Keys.ENTER);
    }
    public static void main(String[] args) {
        multiple_wind();
//        file_download();
//        notification_pop_up();

//        alert_pop_up();
//        authentication_pop_up();
//        Calender_pop_up();
//        file_upload_pop_up();
    }
}


//Map<String, Object> prefs = new HashMap<String, Object>(); //
//        prefs.put("download.default_directory","H:/Java_demo");
//
//ChromeOptions option = new ChromeOptions();//setting //import org.openqa.selenium.chrome.ChromeOptions;
//        option.setExperimentalOption("prefs",prefs);
//
//WebDriver driver = new ChromeDriver(option);
//        driver.manage().window().maximize();
//        Thread.sleep(1000);
//        driver.get("https://demo.automationtesting.in/FileDownload.html");
//        driver.findElement(By.linkText("Download")).click();


//ChromeOptions option = new ChromeOptions();
//        option.addArguments("--disable-notifications");
//https://pushalert.co/demo