package KeyBoardOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyboardOperations {

	public static void main(String[] args) throws InterruptedException {
		
     WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
		driver.get("https://www.google.com/advanced_search");
		
		driver.findElement(By.name("as_q")).sendKeys("abcd");
		
		driver.findElement(By.name("as_q")).sendKeys(Keys.CONTROL+"a");
		
		driver.findElement(By.name("as_q")).sendKeys(Keys.CONTROL+"c");
		driver.findElement(By.name("as_q")).sendKeys(Keys.TAB);
		
		driver.findElement(By.name("as_epq")).sendKeys(Keys.CONTROL+"v");
		
		driver.findElement(By.name("as_epq")).sendKeys(Keys.CONTROL+"v");
		driver.findElement(By.name("as_epq")).sendKeys(Keys.CONTROL+"v");
		driver.findElement(By.name("as_epq")).sendKeys(Keys.CONTROL+"v");
	Thread.sleep(3000);
	driver.findElement(By.name("as_epq")).clear();
	Thread.sleep(3000);
		driver.close();
	}

}



