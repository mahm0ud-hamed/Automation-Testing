import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class myFirstClass {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver Driver = new ChromeDriver();
        Driver.manage().window().maximize();
        Driver.get("https://www.google.com");
        System.out.println("thr window handle " + Driver.getWindowHandle());
        System.out.println("google title was " + Driver.getTitle());
        Driver.navigate().to("https://www.udemy.com");
        if("Online Courses - Learn Anything, On Your Schedule | Udemy".equals(Driver.getTitle())){
            System.out.println("udemy title was " + Driver.getTitle());
            System.out.println("Title was correct ");
        }

        Driver.navigate().back();
        System.out.println("the current url is "+ Driver.getCurrentUrl());
        Thread.sleep(3000);
        Driver.close();
    }
}
