package Dropdowns;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SingleDd {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		//address of dropdown
		WebElement dD = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		Select s=new Select(dD);
		Thread.sleep(3000);
		s.selectByIndex(5);
		Thread.sleep(3000);
		s.selectByValue("search-alias=baby");
		Thread.sleep(3000);
		s.selectByVisibleText("Books");
		System.out.println(s.isMultiple());
		List<WebElement> all = s.getOptions();
		for(WebElement b:all)
		{
			System.out.println(b.getText());
		}
		System.out.println(all.size());
		

	}

}
