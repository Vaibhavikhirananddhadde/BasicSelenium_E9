package Dropdowns;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiSelectdropdown {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demoapp.skillrary.com/");
		WebElement dD = driver.findElement(By.xpath("//select[@id='cars']"));
		Select s=new Select(dD);
		System.out.println(s.isMultiple());
		s.selectByIndex(0);
		s.selectByIndex(1);
		Thread.sleep(3000);
		s.selectByValue("199");
		Thread.sleep(3000);
		s.selectByVisibleText("INR 200 - INR 299 ( 3 )");
		Thread.sleep(3000);
		s.deselectByIndex(1);
		Thread.sleep(3000);
		s.deselectByValue("199");
		Thread.sleep(3000);
		s.deselectByVisibleText("INR 200 - INR 299 ( 3 )");
		List<WebElement> all = s.getAllSelectedOptions();
		for(WebElement b:all)
		{
			System.out.println(b.getText());
		}

	}

}
