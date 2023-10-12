package ActionsClass;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DoubleClick {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demoapp.skillrary.com/product.php?product=java");
		//address of plus icon
		WebElement plus = driver.findElement(By.xpath("//i[@class='fa fa-plus']"));
		Actions a=new Actions(driver);
		a.doubleClick(plus).perform();
		Thread.sleep(3000);
		//address of addto cart
		driver.findElement(By.xpath("//button[@ondblclick='addtocart()']")).click();

	}

}
