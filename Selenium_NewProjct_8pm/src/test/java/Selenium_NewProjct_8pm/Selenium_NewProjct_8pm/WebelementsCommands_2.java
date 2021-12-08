package mavenproject.mavenproject;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebelementsCommands_2 {

	public static void main(String[] args) throws InterruptedException {
		
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://classic.freecrm.com/register/");
	driver.manage().window().maximize();
	
	boolean feturTab=driver.findElement(By.xpath("//a[normalize-space()='Features']")).isDisplayed();
	
	System.out.println("feturTab--" +feturTab);//true
	
	boolean checkbox=driver.findElement(By.xpath("//input[@name='agreeTerms']")).isSelected();
	
	System.out.println("--checkbox---" +checkbox);//flase
	
	
boolean btn=driver.findElement(By.xpath("//button[@id='submitButton']")).isEnabled();
	
	System.out.println("--btn---" +btn);//false
	
	//clicking on checkbox 
	
	driver.findElement(By.xpath("//input[@name='agreeTerms']")).click();
	
	
	boolean checkbox_aftrselected=driver.findElement(By.xpath("//input[@name='agreeTerms']")).isSelected();
	
	System.out.println("--checkbox_aftrselected---" +checkbox_aftrselected);//true

boolean btn_aftrcheckbxslct=driver.findElement(By.xpath("//button[@id='submitButton']")).isEnabled();
	
	System.out.println("--btn_aftrcheckbxslct---" +btn_aftrcheckbxslct);//true
	
	
	
	driver.close();
		
	}

}
