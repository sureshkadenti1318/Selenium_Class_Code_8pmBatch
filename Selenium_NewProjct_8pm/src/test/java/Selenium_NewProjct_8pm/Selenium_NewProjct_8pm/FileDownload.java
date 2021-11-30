package Selenium_NewProjct_8pm.Selenium_NewProjct_8pm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileDownload {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
		driver.get("http://the-internet.herokuapp.com/download");
		
		
		driver.findElement(By.xpath("//a[normalize-space()='Accessories.pdf']")).click();
		
		
		Thread.sleep(3000);
		
		driver.close();		
		

	}

}
