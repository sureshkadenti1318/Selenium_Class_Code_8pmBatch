package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Authentication_Popup_Example {

	WebDriver driver;
	
	@BeforeClass
	public void browserLanch()
	{
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void authentication_test() throws InterruptedException
	{
		//driver.get("http://the-internet.herokuapp.com/basic_auth");
		

		
//	syntax: 	http://username:password@url 
		
	
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		Thread.sleep(3000);
	}
	
	
	
	
	
	@AfterClass
	public void closingbrowser()
	{
		driver.close();
	}
	
}
