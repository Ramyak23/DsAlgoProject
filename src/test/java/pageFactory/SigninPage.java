package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SigninPage {

public WebDriver ldriver;
	
	public SigninPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//a[contains(text(),'Sign in')]")WebElement btnSignin;
	@FindBy(name="username")WebElement txtUserName;
	@FindBy(name="password")WebElement txtpassword;
	@FindBy(xpath="//input[@type='submit']")WebElement btnLogin;
	
	public void clickBtnSignin() {
		btnSignin.click();
	}
	
	public void setUserName(String uname) {
		txtUserName.clear();
		txtUserName.sendKeys(uname);
	}
	public void setPassword(String pwd) {
		txtpassword.clear();
		txtpassword.sendKeys(pwd);
	}
	
	public void clickBtnLogin() {
		btnLogin.click();
		}
}
