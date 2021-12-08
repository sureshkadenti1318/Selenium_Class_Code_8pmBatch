package mavenproject.mavenproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
	driver.findElement(By.className("newTerm"));
		
	driver.findElement(By.id("country"));
	
	driver.findElement(By.name("country1ef59285"));
		
	driver.findElement(By.linkText("terms and conditions"));
	driver.findElement(By.partialLinkText("terms"));
		
	driver.findElement(By.tagName("input"));
	
	driver.findElement(By.xpath("xpathExpression"));
	driver.findElement(By.cssSelector(""));
	
	}

}
