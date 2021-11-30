package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Validate_PageTitle {

@Test
public void validate_Title()
{
	
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.naukri.com/");
		
		
	String actualTitle=	driver.getTitle();
	
	System.out.println("----actualTitle---" +actualTitle);
	
	Assert.assertEquals(actualTitle," Recruitment - Job Search - Employment -Job Vacancies - Naukri.com");
	
	System.out.println("HardAssert---");
			driver.quit();
		
		

	}
@Test
public void validate_URL()
{
	
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://google.com/");
		
		
	String Url=	driver.getCurrentUrl();
	
	SoftAssert soft =new  SoftAssert();
	
	soft.assertEquals(Url, "https://www.google.com/?gws_rd=ssl2335");
	System.out.println("--Soft Assert---");
	
	driver.close();
	soft.assertAll();
	
}

}
