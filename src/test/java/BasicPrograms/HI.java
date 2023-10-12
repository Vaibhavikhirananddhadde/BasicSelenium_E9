package BasicPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HI {

	public static void main(String[] args) {
		//driver related statement
				WebDriverManager.chromedriver().setup();
				//opening browser
				WebDriver driver=new ChromeDriver();
				//maximize the browser
				driver.manage().window().maximize();
				//enter the url
				driver.get("https://www.facebook.com/");
				

	}

}
