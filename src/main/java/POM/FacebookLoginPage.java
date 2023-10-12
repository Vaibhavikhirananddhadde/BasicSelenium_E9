package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookLoginPage {
	//Declaration
	//address of email text field
	@FindBy(id="email")
	private WebElement emailTf;
	
	//address of password textfield
	@FindBy(name="pass")
	private WebElement passwordTf;
	
	//address of loginbutton
	@FindBy(xpath="//button[@name='login']")
	private WebElement loginBtn;
	
	//Initialization
	public FacebookLoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	//Utilization
	//getters 
	
	public WebElement getEmailTf() {
		return emailTf;
	}

	
	public WebElement getPasswordTf() {
		return passwordTf;
	}


	public WebElement getLoginBtn() {
		return loginBtn;
	}
	
	//business libraries
	public void emailTextField(String data)
	{
		emailTf.sendKeys(data);
	}
	
	public void passwordTextField(String data)
	{
		passwordTf.sendKeys(data);
	}
	
	public void loginButton()
	{
		loginBtn.click();
	}
	

}
