package Selenium_NewProjct_8pm.Selenium_NewProjct_8pm;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandles_Example {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		driver.manage().window().maximize();
		
		
		WebElement frameElement=driver.findElement(By.xpath("//frame[@name='login_page']"));
		driver.switchTo().frame(frameElement);
	driver.findElement(By.xpath("//a[normalize-space()='Register Now']")).click();
	Thread.sleep(3000);
	
String parntid=	driver.getWindowHandle();
System.out.println("---parntid--"+parntid);

Set<String >allwind_ids=driver.getWindowHandles();// 2 ids


			
Iterator<String> it=allwind_ids.iterator();

String parentwindow_id=it.next();
String childwindow_id=it.next();

System.out.println("---parentwindow_id--" +parentwindow_id);

System.out.println("---childwindow_id--" +childwindow_id);

driver.switchTo().window(childwindow_id);
Thread.sleep(3000);
driver.findElement(By.xpath("//input[@name='fldLoginUserId']")).sendKeys("1234567");
Thread.sleep(3000);

driver.switchTo().window(parentwindow_id);

System.out.println(driver.getCurrentUrl());


Thread.sleep(3000);
WebElement frameElement1=driver.findElement(By.xpath("//frame[@name='login_page']"));
driver.switchTo().frame(frameElement1);

Thread.sleep(3000);
String prntwindow_text=driver.findElement(By.xpath("//div[normalize-space()='Log in to NetBanking']")).getText();

System.out.println("---prntwindow_text--" +prntwindow_text);

driver.quit();
	

	}

}
