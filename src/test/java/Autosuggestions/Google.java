package Autosuggestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Google {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//textarea[@title='Search']")).sendKeys("phone");
		Thread.sleep(3000);
		List<WebElement> allvalue = driver.findElements(By.xpath("//li[@data-view-type='1']"));
		Thread.sleep(3000);
		System.out.println(allvalue.size());
		for(WebElement b:allvalue)
		{
			System.out.println(b.getText());
		}
		driver.close();

	}

}
