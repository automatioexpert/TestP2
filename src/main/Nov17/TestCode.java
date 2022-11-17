import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCode {
//code changes in the TestCode
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rollbar.com/login/");
        System.out.println(driver.findElement(By.cssSelector(".logo-link")).isDisplayed());
        System.out.println(driver.findElement(By.cssSelector("button[type='submit']")).getText());
        System.out.println(driver.findElement(By.cssSelector("div.login-options")).getText());
        driver.quit();

    }
}
