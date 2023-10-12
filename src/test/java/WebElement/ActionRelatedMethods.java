package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionRelatedMethods {

	public static void main(String[] args) throws Throwable {
		
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
			WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
            email.sendKeys("vaibhavi");
            Thread.sleep(3000);
            email.clear();
            Thread.sleep(3000);
            driver.findElement(By.xpath("//button[@name='login']")).submit();
	}

}
