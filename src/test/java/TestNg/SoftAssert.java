package TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SoftAssert {
	 
	@Test
	public void fb()
	{
		WebDriverManager.edgedriver().setup();
		//launching browser
		WebDriver driver=new EdgeDriver();
		//maximize  the browser
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		String title = driver.getTitle();
		
		//soft Assert
	//	SoftAssert s=new SoftAssert();
//		s.asserEquals(title,"asfhhgfd");
	   System.out.println(driver.getCurrentUrl());
	}
	
		
	

}
