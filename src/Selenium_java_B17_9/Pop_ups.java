package Selenium_java_B17_9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.*;

public class Pop_ups {
    static WebDriver driver;
    static void alert_pop_up(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://demowebshop.tricentis.com/");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        //UnhandledAlertException: unexpected alert open: {Alert text : Please enter some search keyword}
        String alert_msg = driver.switchTo().alert().getText();
        System.out.println(alert_msg);
        driver.switchTo().alert().accept();
        driver.findElement(By.id("small-searchterms")).sendKeys("Books");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        //note if there is no alert
       // driver.switchTo().alert().accept(); //NoAlertPresentException: no such alert

    }

    static void hiden_div_pop_up(){
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
            driver.get("https://www.makemytrip.com/");
            driver.findElement(By.xpath("//span[@data-cy=\"closeModal\"]")).click();
            driver.findElement(By.xpath("//label[@for=\"departure\"]")).click();
            driver.findElement(By.xpath("(//p[text()='25'])[1]")).click();
    }

    static  void file_upload_pop_up(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://demo.guru99.com/test/upload/");
//        driver.findElement(By.name("uploadfile_0")).sendKeys("C:/Users/hp/Downloads/samplefile.pdf");
        driver.findElement(By.id("terms")).click();
        driver.findElement(By.id("submitbutton")).click();
//        List<WebElement> textPart1 = driver.findElements(By.xpath("//center"));
//
//        for(WebElement i : textPart1){
//            System.out.println(i.getText());
//        }
        WebElement successMsg = driver.findElement(By.xpath("//h3[@id='res']"));
        String text = successMsg.getAttribute("innerText").trim();
        System.out.println("Success message: " + text);

    }

    static void file_download() throws InterruptedException {
        ChromeOptions options = new ChromeOptions();//chrome settings
        Map<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("download.default_directory", "H:/Java_demo");
        options.setExperimentalOption("prefs", prefs);

        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://demo.automationtesting.in/FileDownload.html");
        driver.findElement(By.linkText("Download")).click();
    }
    //https://username:password@URL

    static void authentication(){
        WebDriver  driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        String un = "admin";
        String pwd = "admin";
        driver.get("https://"+un+":"+pwd+"@the-internet.herokuapp.com/basic_auth");
    }
    static void notification_pop_up(){
        ChromeOptions option = new ChromeOptions();
        option.addArguments("--disable-notifications");

        WebDriver driver = new ChromeDriver(option);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://pushalert.co/demo");

    }
    static void multiple_win(){
      WebDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://demowebshop.tricentis.com/");
      driver.findElement(By.linkText("Facebook")).click();
      driver.findElement(By.linkText("Google+")).click();

      //collecting the multiple wind
        Set<String> winds = driver.getWindowHandles();//all window address [p1,c1,c2]

        List<String> winds1 = new ArrayList<>(winds);

        driver.switchTo().window(winds1.get(2));

        driver.findElement(By.name("email")).sendKeys("abc@gmail.com");
      driver.findElement(By.name("pass")).sendKeys("abc@123");
      driver.findElement(By.xpath("(//span[text()='Log in'])[3]")).click();

      driver.switchTo().window(winds1.get(1));
      driver.findElement(By.partialLinkText("Products")).click();
    }
    public static void main(String[] args) throws InterruptedException {


        multiple_win();
//        notification_pop_up();
//        authentication();
//        file_download();
//        file_upload_pop_up();
//        file_upload_pop_up();
//        System.out.println("20"+20+30);//
//        System.out.println('a'+20);
//        System.out.println(20+30+"20");
//        //

    }
}
