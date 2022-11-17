import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class TagNames {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.physicsandmathstutor.com/");
    List<WebElement> tags= driver.findElements(By.tagName("a"));
    for(WebElement tag:tags){
        System.out.println(tag.getText());
    }
    driver.quit();
    }
}
