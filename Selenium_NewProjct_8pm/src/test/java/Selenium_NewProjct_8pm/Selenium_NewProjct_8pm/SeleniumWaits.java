package Selenium_NewProjct_8pm.Selenium_NewProjct_8pm;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumWaits {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		Thread.sleep(10); 
		
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
	
	WebElement element =driver.findElement(By.xpath("x"));
	
	WebDriverWait wait= new WebDriverWait(driver, 10);
	wait.until(ExpectedConditions.elementToBeClickable(element));
	
	
		
		driver.findElement(By.xpath("//input[@name='x']")).click();
		
		driver.findElement(By.xpath("//input[@name='y']")).click();
		
	}

}
