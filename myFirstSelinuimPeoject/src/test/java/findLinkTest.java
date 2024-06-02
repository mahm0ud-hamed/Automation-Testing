import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class findLinkTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.edgedriver().setup();
        WebDriver Edriver = new EdgeDriver();
        Edriver.manage().window().maximize();
        Edriver.get("https://the-internet.herokuapp.com");
        Edriver.findElement(By.linkText("Form Authentication")).click();
        Edriver.findElement(By.id("username")).sendKeys("tomsmith");
        Thread.sleep(200);
        Edriver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        Thread.sleep(200);
        Edriver.findElement(new By.ByClassName("radius")).click();
        Thread.sleep(1000);
        Edriver.close();


    }
}
