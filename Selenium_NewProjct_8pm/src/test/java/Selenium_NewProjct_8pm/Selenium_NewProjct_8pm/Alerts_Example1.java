package mavenproject.mavenproject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts_Example1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://the-internet.herokuapp.com/javascript_alerts");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
		Thread.sleep(2000);
	Alert alt=	driver.switchTo().alert();
   String text=	alt.getText();// text alrt popup	
	System.out.println("---text--" +text);
	
	alt.accept(); //ok
	
	//Cancel
	driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
	Thread.sleep(2000);
	Alert alt1=	driver.switchTo().alert();
	alt1.dismiss();
	
	//Sendkeys
	driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
	Thread.sleep(2000);
	Alert alt2=	driver.switchTo().alert();
	alt2.sendKeys("check info");
	
	Thread.sleep(2000);
	alt2.dismiss();
	
//	alt.dismiss();//cancel
	
//	alt.sendKeys("abc");
	
//	
	}

}
