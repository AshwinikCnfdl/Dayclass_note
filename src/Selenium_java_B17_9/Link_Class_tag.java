package Selenium_java_B17_9;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link_Class_tag {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");

        WebElement email_link = driver.findElement(By.linkText("Gmail"));
        Thread.sleep(1000);
        if(email_link.isDisplayed()){
            email_link.click();
            Thread.sleep(1000);
            driver.navigate().back();
            Thread.sleep(1000);

            WebElement images_link = driver.findElement(By.linkText("Images"));
            if(images_link.isDisplayed()){
                images_link.click();
                Thread.sleep(1000);
                String exp = "Google Images";
                String act = driver.getTitle();

                if(exp.equalsIgnoreCase(act)){
                    System.out.println("test pass");
                }
                else{
                    System.out.println("testFail");
                    System.out.println(act);
                }
            }

        }
        else{
            System.out.println("Gmail not present");
        }

//  driver.close();
    }
}
