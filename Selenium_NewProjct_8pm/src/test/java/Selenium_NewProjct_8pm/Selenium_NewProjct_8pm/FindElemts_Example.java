package Selenium_NewProjct_8pm.Selenium_NewProjct_8pm;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElemts_Example {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
	List<WebElement> alllinks=	driver.findElements(By.tagName("a"));
		
int total_Links=	alllinks.size();
System.out.println("-----total_Links--" +total_Links);

for (int i=0;i<total_Links;i++)
{
	String linkname=alllinks.get(i).getText();
	
	System.out.println("---linkname--" +linkname);
}

		
	}

}
