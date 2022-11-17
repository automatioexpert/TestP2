import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Test5 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://rollbar.com/pricing/");
        driver.findElement(By.cssSelector("a[href*='login']")).click();
        System.out.println(driver.findElement(By.cssSelector("h2.form-header")).getText());
        driver.findElement(By.cssSelector("[name='username_or_email']")).sendKeys("user348349348@gmail.com");
        driver.findElement(By.cssSelector("[name='password']")).sendKeys("user348349348@gmail.com");
        driver.findElement(By.xpath("//button[contains(text(),'Log In')]")).click();
        System.out.println(driver.findElement(By.cssSelector("div[role='alert']")).getText());
        driver.quit();

    }
}
