package ActionsCalss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClick {

	public static void main(String[] args) throws InterruptedException {
		
     WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		Thread.sleep(1000);
		
				
		WebElement wb=driver.findElement(By.xpath("//span[contains(normalize-space(),'right click me')]"));
		
		Actions act= new Actions(driver);
		
		
		
		act.contextClick().build().perform();
		act.contextClick(wb).build().perform();
		
		Thread.sleep(3000);
		driver.close();
	}

}



