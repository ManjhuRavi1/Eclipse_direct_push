package Selenium_Package;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
 
import java.util.List;
 
public class TC_Alert {
 
    public static void main(String[] args) throws InterruptedException {
 
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://letcode.in/alert");
        
        driver.findElement(By.id("accept")).click();
        
        Alert simplealert = driver.switchTo().alert();
        System.out.println("simple alert text : " + simplealert.getText());
        simplealert.accept();
        
        Thread.sleep(5000);
        
        driver.findElement(By.id("confirm")).click();
        Alert confirmalert = driver.switchTo().alert();
        System.out.println("confirm alert text : " + confirmalert.getText());
        confirmalert.accept();
    }
}