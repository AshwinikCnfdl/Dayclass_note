package Selenium_java_B17_9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Select_Classes {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");

        driver.navigate().refresh();
        try{
            driver.findElement(By.id("")).click();
        }
        catch (Exception e){

        }
        //handling the dropdown Select class
//        1. select object
//        Select select = new Select(dropdown);//
        //import org.openqa.selenium.support.ui.Select;
        //pass web ele as arguments

        WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));
        Select select = new Select(dropdown);

        //all options
        List<WebElement> options = select.getOptions();

        for(WebElement option : options){
            System.out.println(option.getText());
        }

        //books
//        3methods

        select.selectByVisibleText("Books"); // option select
        select.selectByValue("search-alias=mobile-apps"); // values attribute
        select.selectByIndex(4); // select 5th option

        WebElement select_option = select.getFirstSelectedOption();
        if("Books".equalsIgnoreCase(select_option.getText())){
            System.out.println("testpass");
        }
        else{
            System.out.println("testFail");
            System.out.println(select_option.getText());
        }

       if( select.isMultiple()) {
            select.deselectByIndex(4);//UnsupportedOperationException
        }
        //You may only deselect options of a multi-select


    }
}
