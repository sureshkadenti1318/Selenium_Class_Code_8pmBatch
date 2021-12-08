package mavenproject.mavenproject;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebelementsCommands {

	public static void main(String[] args) throws InterruptedException {
		
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://classic.freecrm.com/register/");
	driver.manage().window().maximize();

	driver.findElement(By.name("first_name")).sendKeys("TestFirstName");
	
	driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("TestLastName");
	
	driver.findElement(By.name("first_name")).clear();
	
	String classvlv=driver.findElement(By.name("first_name")).getAttribute("class");
	System.out.println("---classvlv-" +classvlv);
	

	String txt=driver.findElement(By.xpath("//a[normalize-space()='Pricing']")).getText();
	
	System.out.println("---txt-" +txt);
	
	String cssalue=driver.findElement(By.xpath("//a[normalize-space()='Pricing']")).getCssValue("color");
	
	System.out.println("---cssalue-" +cssalue);
	
	
	
	
	driver.close();
		
	}

}
