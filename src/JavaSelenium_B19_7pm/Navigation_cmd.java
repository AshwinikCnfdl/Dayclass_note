package JavaSelenium_B19_7pm;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation_cmd {
    public static void main(String[] args) {
        String excepted_url = "https://www.flipkart.com/";

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get(excepted_url);
        String acu_utl = driver.getCurrentUrl();

        if(acu_utl.equalsIgnoreCase(excepted_url)){
            System.out.println("test pass");
        }
        else{
            System.out.println("testFail");
            System.out.println(acu_utl);
        }
        //navigation cmd
        driver.navigate().to("https://www.flipkart.com/mobile-phones-store?fm=neo%2Fmerchandising&iid=M_567ab715-8bab-4f6f-9a0f-5b9712f85edf_1_372UD5BXDFYS_MC.ZRQ4DKH28K8J&otracker=hp_rich_navigation_2_1.navigationCard.RICH_NAVIGATION_Mobiles_ZRQ4DKH28K8J&otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_2_L0_view-all&cid=ZRQ4DKH28K8J");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        driver.manage().window().minimize();


        driver.close();
//
//        driver.navigate().to("https://www.flipkart.com/"); go to url
//        driver.navigate().back(); // back word
//        driver.navigate().forward(); //forward
//        driver.navigate().refresh(); //refresh



    }
}
