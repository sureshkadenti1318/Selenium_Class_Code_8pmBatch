package mavenproject.mavenproject;




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationCommands {

	public static void main(String[] args) throws InterruptedException {
		
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	
	driver.navigate().to("https://amazon.in/");
	
	driver.navigate().back(); //google
	Thread.sleep(3000);
	driver.navigate().forward();// amazon
	
	driver.navigate().refresh();
	
	driver.close();
		
	}

}
