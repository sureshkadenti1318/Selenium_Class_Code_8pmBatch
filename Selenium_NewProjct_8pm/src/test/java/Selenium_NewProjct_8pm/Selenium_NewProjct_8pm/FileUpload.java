package Selenium_NewProjct_8pm.Selenium_NewProjct_8pm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUpload {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
		driver.get("https://www.monsterindia.com/seeker/registration");
		
		
		driver.findElement(By.xpath("//input[@id='file-upload']")).sendKeys("C:\\Users\\u293327\\Documents\\Testing Tools_Training_Batchs\\TestingTools_Training_Manual_Automation\\8PM_Batch\\ZoomLink.txt");
Thread.sleep(3000);
		
		driver.close();		
		

	}

}
