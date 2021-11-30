package Selenium_NewProjct_8pm.Selenium_NewProjct_8pm;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakingScreenShot {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		
	TakesScreenshot st=(TakesScreenshot)(driver);
	File src=st.getScreenshotAs(OutputType.FILE);
	
	File dst=new File("C:\\Users\\u293327\\Documents\\Testing Tools_Training_Batchs\\TestingTools_Training_Manual_Automation\\8PM_Batch\\naukri.jpeg");
	
FileUtils.copyFile(src, dst);
System.out.println("---screenshot done");

driver.close();
	}

}
