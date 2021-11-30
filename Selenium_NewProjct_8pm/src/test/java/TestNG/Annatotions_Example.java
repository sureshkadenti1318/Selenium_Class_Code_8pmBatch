package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Annatotions_Example {
	WebDriver driver;

	@BeforeClass
	public void LanchingBrowser()

	{
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.manage().window().maximize();
	}

	@Test(priority = 2)
	public void AmazonTest() {

		driver.get("https://www.amazon.in/");

		System.out.println("---amazon---");

	}

	@Test(priority = 1)
	public void GoogleTest() {

		driver.get("http://google.com/");

		System.out.println("---google--");

	}

	@AfterClass
	public void closingBrowser() {
		driver.close();
	}

}
