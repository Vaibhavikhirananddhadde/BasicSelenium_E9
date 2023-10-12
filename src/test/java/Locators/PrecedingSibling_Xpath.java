package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrecedingSibling_Xpath {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//a[@href='/gp/new-releases/?ref_=nav_cs_newreleases']/preceding-sibling::a[@href='/gp/bestsellers/?ref_=nav_cs_bestsellers']")).click();

	}

}
