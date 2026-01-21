package Selenium_Package;

import java.util.List;                           
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_Partiallink {

    public static void main(String[] args) throws InterruptedException {
    	WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo");
		
		
		WebElement myaccount=	driver.findElement(By.partialLinkText("Account"));
		if(myaccount.isDisplayed())
		{
			System.out.println("My account is displayed");
			myaccount.click();
		}
		else
		{
			System.out.println("My account is not displayed");
		}
		
		
		driver.findElement(By.partialLinkText("Account")).click();
		driver.findElement(By.partialLinkText("Regist")).click();
		
		driver.findElement(By.cssSelector("input#input-firstname")).sendKeys("Ravindra" + Keys.SPACE+ "Kumar");
		driver.findElement(By.cssSelector("input#input-lastname")).sendKeys("Manjhu" + Keys.CONTROL,"a" + Keys.BACK_SPACE);
		
		
		//driver.quit();
    }
}