package GenericLibraries;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtilities {
	//1.double click 
	public void doubleClickProcess(WebDriver driver,WebElement ele)
	{
		Actions a=new Actions(driver);
		a.doubleClick(ele).perform();
	}
	
	//2.rightClick
	public void rightClick(WebDriver driver,WebElement ele)
	{
		Actions a=new Actions(driver);
		a.contextClick(ele).perform();;
	}
	
	//3.mouseover
	public void mouseOvering(WebDriver driver,WebElement ele1)
	{
		Actions a=new Actions(driver);
		a.moveToElement(ele1).perform();;
	}
	
	//4.Drag and drop
	public void dragging(WebDriver driver,WebElement ele1,WebElement ele2)
	{
		Actions a=new Actions(driver);
		a.dragAndDrop(ele1, ele2).perform();
	}
	
	//5.impplicit wait
	public void implicitWait(WebDriver driver,int time)
	{
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}
	//6.explicit wait
	/*public void expWait(WebDriver driver,int time,WebElement ele)
	{
		WebDriverWait wait=new WebDriverWait(driver,time);
		wait.until(ExpectedCondition,ele);
		
	}*/

}
