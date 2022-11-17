package main.Nov17;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import java.time.Duration;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.physicsandmathstutor.com/");
        driver.findElement(By.xpath("//span[contains(text(),'Past Papers')]")).click();
       List<WebElement> items= driver.findElements(By.cssSelector("h4 a"));
       for(WebElement it:items){
           System.out.println(it.getText());
       }


    }
}
