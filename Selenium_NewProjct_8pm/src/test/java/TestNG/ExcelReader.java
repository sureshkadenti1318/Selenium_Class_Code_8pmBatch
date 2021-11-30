package TestNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExcelReader {

	WebDriver driver;

	@BeforeClass
	public void LanchingBrowser()

	{
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.manage().window().maximize();
	}

	@Test(invocationCount=2)
	public void GoogleTest() throws IOException, InterruptedException {

		 driver.get("http://demo.automationtesting.in/Register.html");

		FileInputStream fl = new FileInputStream("C:\\Users\\u293327\\Desktop\\8pm_Selenium_Workspace\\Selenium_NewProjct_8pm\\Resources\\TestData_1.xlsx");

	
		XSSFWorkbook wb = new XSSFWorkbook(fl);

		XSSFSheet sheet = wb.getSheet("Sheet1");

		String FirstName = sheet.getRow(4).getCell(0).getStringCellValue();

		String LatName = sheet.getRow(4).getCell(1).getStringCellValue();

		
		String email = sheet.getRow(5).getCell(0).getStringCellValue();
		
		System.out.println("----FirstName---" + FirstName);

		System.out.println("----LatName---" + LatName);
		
		System.out.println("----email---" + email);


		// sheet.getRow(3).getCell(0).getNumericCellValue();

		
		  driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys(FirstName);
		
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(LatName);
		  Thread.sleep(2000);
		  
		  driver.findElement(By.xpath("	//input[@type='email']")).sendKeys(email);
		 

		  
		  
		  
	}

	@AfterClass
	public void closingBrowser() {
		driver.close();
	}

}
