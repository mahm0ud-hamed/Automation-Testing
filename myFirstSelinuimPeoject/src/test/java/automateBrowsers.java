import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class automateBrowsers {
    public static void main(String[] args)throws InterruptedException {
        WebDriverManager.edgedriver().setup();
        WebDriver Edrive = new EdgeDriver();
        Edrive.manage().window().maximize();
    // Edrive.get("https://the-internet.herokuapp.com/login");
    // Edrive.findElement(By.id("username")).sendKeys("tomsmith");
    // Thread.sleep(500);
    // Edrive.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
    // Thread.sleep(500);
    // Edrive.findElement(By.className("radius")).click();
    // Thread.sleep(1000);رررررر
    // Edrive.close();
        Edrive.get("https://the-internet.herokuapp.com/login");
        Edrive.findElement(By.name("username")).sendKeys("tomsmith");
        Thread.sleep(500);
        Edrive.findElement(By.name("password")).sendKeys("SuperSecretPassword!");
        Thread.sleep(500);
        Edrive.findElement(By.className("radius")).click();
        Thread.sleep(1000);
        Edrive.close();
    }

}
