package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProvider_Example {

	WebDriver driver;
	
	@BeforeClass
	public void browserLanch()
	{
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
	}
	
	@Test(dataProvider="testdata",invocationCount=5)
	public void logintest(String FullName, String email)
	{
		
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
		driver.findElement(By.xpath("(//input[contains(@name,'name')])[1]")).sendKeys(FullName);
		
		driver.findElement(By.xpath("//input[contains(@name,'login')]")).sendKeys(email);
		

		
	}
	
	@DataProvider
	
	public Object[][] testdata()
	{
		
		Object[][] data = new Object[2][2];

		data[0][0] = "Ajith";

		data[0][1] = "Ajith@gmail.com";

		data[1][0] = "Bindhu";

		data[1][1] = "Bindhu@gmail.com";
		
		return data;
	}
	
	
	
	
	
	
	@AfterClass
	public void closingbrowser()
	{
		driver.close();
	}
	
}
