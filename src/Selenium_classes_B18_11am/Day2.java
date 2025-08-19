package Selenium_classes_B18_11am;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2 {
    public static void main(String[] args) {


        //open the browser
        WebDriver driver = new ChromeDriver(); // upcasting
        //max
        driver.manage().window().maximize(); //method chaining
        //url
        driver.get("https://www.facebook.com/");
//       Facebook – log in or sign up :collecting the title
        String  exp_title = driver.getTitle();

        if(exp_title.contains("log in")){
            System.out.println("test pass");
        }
        else{
            System.out.println("test fail");
        }















//        1. Browser Commands:
//get(String url): Navigates to the specified URL in the browser.
//getCurrentUrl(): Returns the URL of the current page.
//getTitle(): Returns the title of the current page.
//getPageSource(): Returns the HTML source code of the current page.
//close(): Closes the current browser window.
//quit(): Closes all browser windows and ends the WebDriver session.
//getWindowHandle(): Retrieves the handle (unique identifier) of the current window.
//getWindowHandles(): Retrieves handles for all open browser windows.
//2. Navigation Commands:
//to(String url): Equivalent to get(), navigating to a URL.
//back(): Navigates to the previous page in the browser history.
//forward(): Navigates to the next page in the browser history.
//refresh(): Refreshes the current page.
//3. WebElement Commands:
//findElement(By by): Finds the first element that matches the given locator.
//findElements(By by): Finds all elements that match the given locator.
//click(): Clicks on the element.
//sendKeys(CharSequence... keysToSend): Sends keystrokes to the element.
//clear(): Clears the content of an input element.
//getText(): Retrieves the text content of an element.
//getAttribute(String name): Retrieves the value of the specified attribute of the element.
//isDisplayed(): Checks if the element is visible on the page.
//isEnabled(): Checks if the element is enabled.
//isSelected(): Checks if the element is selected (e.g., a checkbox).
//submit(): Submits a form.
//4. Wait Commands:
//implicitlyWait(long time, TimeUnit unit): Sets a global implicit wait for elements.
//WebDriverWait with ExpectedConditions: Allows for explicit waits with specific conditions.
//5. Switch Commands:
//switchTo().frame(String nameOrId): Switches to a specific frame.
//switchTo().window(String windowHandle): Switches to a specific window.
//switchTo().alert(): Switches to an alert.
    }
}
