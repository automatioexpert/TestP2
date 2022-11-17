import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Test3 {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://rollbar.com/blog/java-could-not-find-or-load-main-class/");
        driver.findElement(By.cssSelector("img[alt='Rollbar']")).getText();
        driver.findElement(By.cssSelector("a[href*='pricing']")).click();
        System.out.println(driver.findElement(By.cssSelector("div h1")).getText());
        driver.quit();

    }
}
