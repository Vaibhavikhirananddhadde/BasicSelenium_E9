package Locators;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Xpath_Ancestor {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/search?q=mobiles&as=on&as-show=on&otracker=AS_Query_TrendingAutoSuggest_3_0_na_na_na&otracker1=AS_Query_TrendingAutoSuggest_3_0_na_na_na&as-pos=3&as-type=TRENDING&suggestionId=mobiles&requestId=d6689f41-2cd9-4ee1-a55b-aa3da48780ec&as-searchtext=phone");
        WebElement price = driver.findElement(By.xpath("//div[text()='APPLE iPhone 13 (Starlight, 128 GB)']/ancestor::div[@class='_3pLy-c row']//div[@class='_30jeq3 _1_WHN1']"));
        System.out.println(price.getText());
	}

}
