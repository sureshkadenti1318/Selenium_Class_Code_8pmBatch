package Selenium_NewProjct_8pm.Selenium_NewProjct_8pm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameHandlng_Example {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		
		//driver.switchTo().frame(0); //lll not prefr
		//driver.switchTo().frame("login_page");
		
	  WebElement wb=driver.findElement(By.xpath("//frame[@name='login_page']"));
		
		driver.switchTo().frame(wb); //use this way
		
		driver.findElement(By.xpath("//input[@name='fldLoginUserId']")).sendKeys("test");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[normalize-space()='Credit Card only? Login here']")).click();
		Thread.sleep(3000);
		
		driver.quit();
		
		

	}

}
