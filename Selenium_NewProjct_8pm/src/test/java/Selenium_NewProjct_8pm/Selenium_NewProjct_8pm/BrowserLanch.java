package mavenproject.mavenproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLanch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		/*
		 * WebDriverManager.firefoxdriver().setup();
		 * 
		 * WebDriver driver1=new FirefoxDriver();
		 */
		
		
		
	}

}
