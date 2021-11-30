package Selenium_NewProjct_8pm.Selenium_NewProjct_8pm;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropDown_Example {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
	
WebElement coundry_dropdown=driver.findElement(By.xpath("//select[@id='country']"));

Select slt= new Select(coundry_dropdown);
//slt.selectByIndex(4);

//slt.selectByValue("13");

slt.selectByVisibleText("British Indian Ocean Territory");
Thread.sleep(3000);

List<WebElement> alloptions=slt.getOptions();

int totaloptn=alloptions.size();

System.out.println("---totaloptn----" +totaloptn);
for(int i=0;i<alloptions.size();i++)
{
	String dropdopwn_optn=alloptions.get(i).getText();
	System.out.println("----dropdopwn_optn--"+ dropdopwn_optn);
	
}



		
	}

}
