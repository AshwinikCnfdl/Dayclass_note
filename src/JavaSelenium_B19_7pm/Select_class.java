package JavaSelenium_B19_7pm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.List;
public class Select_class {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");
        driver.navigate().refresh();

        WebElement searchDropdownBox = driver.findElement(By.id("searchDropdownBox"));
        Select select = new Select(searchDropdownBox);

        //3methods :--based on position(select the 10 ele)
        select.selectByIndex(10);

        //select the ele based on product name
        select.selectByVisibleText("Books");

        //select the ele based on value attribute
        select.selectByValue("search-alias=shoes");

        //collection all options
        List<WebElement> options = select.getOptions();
        for(WebElement i : options){
            System.out.println(i.getText());
        }

        String select_option = select.getFirstSelectedOption().getText();

        if(select_option.equalsIgnoreCase("Shoes & Handbags")){
            System.out.println("test pass");
        }
        else{
            System.out.println("test fail");
        }
        if(select.isMultiple()) {
            select.deselectByValue("search-alias=shoes");//UnsupportedOperationException
        }
//        //You may only deselect options of a multi-select

        driver.get("https://www.letskodeit.com/practice");
        WebElement ele = driver.findElement(By.id("multiple-select-example"));
        select = new Select(ele);
        select.selectByVisibleText("Apple");
        select.selectByVisibleText("Orange");
        select.selectByVisibleText("Peach");
        select.deselectByVisibleText("Apple");

    }
}
