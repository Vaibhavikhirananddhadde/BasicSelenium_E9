package ActionsClass;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.support.ui.WebDriverWait;
public class MouseOvering {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.snapdeal.com/");
	    //WebDriverWait wait = new WebDriverWait(driver,20);
		//address of signin
		WebElement signin = driver.findElement(By.xpath("//span[text()='Sign In']"));
		Actions a=new Actions(driver);
		a.moveToElement(signin).perform();
		Thread.sleep(3000);
		//address of register button
		driver.findElement(By.xpath("(//span[text()='Register'])[1]")).click();
	}

}
