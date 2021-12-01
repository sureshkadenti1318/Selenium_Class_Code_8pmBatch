package KeyBoardOperations;

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
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderTest {

	WebDriver driver;

 @BeforeClass
	public void LanchingBrowser()

	{
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.manage().window().maximize();
	}

	@Test(dataProvider = "testdata")
	public void Userdata(String Us, String Pwd) throws IOException, InterruptedException {

		
		  driver.get("https://www.google.com/advanced_search");
		  driver.manage().window().maximize();
		 

		System.out.println("---Us---" + Us);
		System.out.println("---pwd---" + Pwd);

		driver.findElement(By.xpath("//input[@name='as_q']")).sendKeys(Us);
		 driver.findElement(By.xpath("//input[@name='as_epq']")).sendKeys(Pwd);

	}

	@DataProvider
	public Object[][] testdata() {

		Object[][] data = new Object[2][2];

		data[0][0] = "firstname";

		data[0][1] = "1234";

		data[1][0] = "firstname_2";

		data[1][1] = "4567";

		return data;

	}

	@AfterClass
	public void closingBrowser() {
		driver.close();
	}

}
