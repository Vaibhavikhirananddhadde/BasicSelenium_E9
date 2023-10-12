package Popup;

import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Child_Popup {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.skillrary.com/");
		String parent = driver.getWindowHandle();
		//address of gears
		driver.findElement(By.xpath("//a[text()=' GEARS ']")).click();
		//address of skillrary essay
		driver.findElement(By.xpath("(//a[text()=' SkillRary Essay'])[2]")).click();
		Set<String> child = driver.getWindowHandles();
		for(String b:child)
		{
			driver.switchTo().window(b);
		}
		
		//address of textfield
		driver.findElement(By.id("mytext")).sendKeys("vaibhavi");
		Thread.sleep(3000);
		//control back to parent
		driver.switchTo().window(parent);
		//address of categories
		driver.findElement(By.xpath("//a[text()='CATEGORIES']")).click();

	}

}
