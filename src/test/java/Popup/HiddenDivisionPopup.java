package Popup;

import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivisionPopup {

	public static void main(String[] args) {
		//WebDriverManager.edge.EdgeDriver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vaibhavi\\eclipse-workspace\\Basic_Selenium_E9\\src\\main\\resources\\chromedriver.exe");
		//WebDriverManager.edgedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.redbus.in/");
		driver.findElement(By.xpath("//span[text()='Date']")).click();
		driver.findElement(By.xpath("//div[text()='Sept']/../../../..//span[@class='DayTiles__CalendarDaysSpan-sc-1xum02u-1 bwoYtA']")).click();

	}

}
