package mavenproject.mavenproject;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserCommands {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://google.com/");
		
	String title=driver.getTitle();
	System.out.println("---title of the page :" +title);
	
	String url=driver.getCurrentUrl();
	System.out.println("--url--" +url);
	
	String pagesurc=driver.getPageSource();
	
	System.out.println("---pagesurc--" +pagesurc);
		
		//driver.close();
		
		driver.quit();
		
	}

}
