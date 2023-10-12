package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Links {

	public static void main(String[] args) throws Throwable {

		//driver related statements
				WebDriverManager.chromedriver().setup();
				//launching browser
				WebDriver driver=new ChromeDriver();
				//maximize  the browser
				driver.manage().window().maximize();
				//opens the browser
				driver.get("https://www.facebook.com/");
				//fetching all links
				List<WebElement>allLinks=driver.findElements(By.tagName("a"));
				for(WebElement b:allLinks)
				{
					System.out.println(b.getText());
				}
				Thread.sleep(3000);
				driver.quit();
		

	}

}
