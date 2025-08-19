package Selenium_classes_B18_11am;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class demo {
    public static void main(String[] args) throws InterruptedException {
        String exp = "Google Images";

        WebDriver driver =  new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");

        Thread.sleep(800);

        WebElement email_link = driver.findElement(By.linkText("Gmail"));
        if(email_link.isDisplayed()){
            email_link.click();
            Thread.sleep(800);
            driver.navigate().back();
            Thread.sleep(800);
          WebElement  Images_link =  driver.findElement(By.linkText("Images"));
            if(Images_link.isDisplayed()){
                Images_link.click();
                Thread.sleep(800);

                String act = driver.getTitle();

                if(act.equalsIgnoreCase(exp)){
                    System.out.println("testpass");
                }
                else{
                    System.out.println("testfail");
                    System.out.println(act);
                }
            }
            else{
                System.out.println("Image link not present");
            }

        }
        else{
            System.out.println("ele not present");
        }


    }
}



