package ActionsCalss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		
     WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[contains(text(),'✕')]")).click();
		Thread.sleep(1000);
		
		
		WebElement wb=driver.findElement(By.xpath("//div[contains(text(),'Electronics')]"));
		
		Actions act= new Actions(driver);

		act.moveToElement(wb).build().perform();
		Thread.sleep(3000);
		
		WebElement wb1=driver.findElement(By.xpath("//a[normalize-space()='Audio']"));
		
		Actions act1= new Actions(driver);

		act1.moveToElement(wb1).build().perform();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[normalize-space()='Home Theatres']")).click();
		Thread.sleep(3000);
		driver.close();
	}

}



