package Frames;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Snapdeal {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.snapdeal.com/");
	    //address of signin
		WebElement signin = driver.findElement(By.xpath("//span[text()='Sign In']"));
		Actions a=new Actions(driver);
		a.moveToElement(signin).perform();
		Thread.sleep(3000);
		//address of register button
		driver.findElement(By.xpath("(//span[text()='Register'])[1]")).click();
		//handling frame
		driver.switchTo().frame("iframeLogin");
		Thread.sleep(3000);
		//address of email or phone number
		driver.findElement(By.xpath("//input[@placeholder='Mobile Number/ Email']")).sendKeys("addgtei");
		Thread.sleep(3000);
		//address of cancel
		driver.findElement(By.xpath("//i[@class='sd-icon sd-icon-delete-sign fnt-22']")).click();
		//switch back to normal web page
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		//address of search field
		driver.findElement(By.xpath("(//input[@name='keyword'])[1]")).sendKeys("sgjdt");

	}

}
