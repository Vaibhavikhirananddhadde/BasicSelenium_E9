package Locators;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class id_name_linkText_partialLinkText {

	public static void main(String[] args) throws Throwable {
		//driver related statement
		WebDriverManager.chromedriver().setup();
		//opening browser
		WebDriver driver=new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//enter the url
		driver.get("https://www.facebook.com/");
		//address of email textfield
		driver.findElement(By.id("email")).sendKeys("vaibhavi");
		//address of Forgotten password link
		driver.findElement(By.partialLinkText("Forgotten")).click();
		driver.navigate().back();
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Create")).click();
		
		

	}

}
