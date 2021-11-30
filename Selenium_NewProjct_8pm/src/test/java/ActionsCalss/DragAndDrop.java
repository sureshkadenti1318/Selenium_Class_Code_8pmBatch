package ActionsCalss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		
     WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/#Photo%20Manager");
		
		WebElement frameElement =driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(frameElement);
	
	WebElement	source=	driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));
	WebElement	dst=driver.findElement(By.xpath("//div[@id='trash']"));
		
		Actions act= new Actions(driver);

		act.dragAndDrop(source, dst).build().perform();
		Thread.sleep(2000);
		
		System.out.println("----drag and dop is done ");
		
		driver.close();
	}

}



