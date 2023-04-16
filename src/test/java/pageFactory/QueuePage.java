package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QueuePage {

public WebDriver ldriver;
	
	public QueuePage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//a[contains(text(),'Sign in')]")WebElement btnSignin;
	@FindBy(name="username")WebElement txtUserName;
	@FindBy(name="password")WebElement txtpassword;
	@FindBy(xpath="//input[@type='submit']")WebElement btnLogin;
	@FindBy(xpath="//h5[contains(text(), 'Queue')]/following::a[1]")WebElement butnQueueGetStart;
	@FindBy(linkText="Implementation of Queue in Python")WebElement qlinktxt1;
	@FindBy(linkText="Implementation using collections.deque")WebElement qlinktxt2;
	@FindBy(linkText="Implementation using array")WebElement qlinktxt3;
	@FindBy(linkText="Queue Operations")WebElement qlinktxt4;
	@FindBy(xpath="//div[2]/div/div[2]/a")WebElement btntryhere;
    @FindBy(xpath="//form[@id='answer_form']/div/div/div[1]/textarea")WebElement qtxtarea;
	@FindBy(xpath="//button[contains(text(),'Run')]")WebElement btnrun;
	
	
	public void clickBtnSignin() {
		btnSignin.click();
	}
	public void clickBtnLogin() {
		btnLogin.click();
		}
    public void clickQueueGetStartButn() {
		butnQueueGetStart.click();
	}
	public void clickqLinkTxt1() {
		qlinktxt1.click();
	}
    public void clickqLinkTxt2() {
		qlinktxt2.click();
	}
    public void clickqLinkTxt3() {
		qlinktxt3.click();
	}
    public void clickqLinkTxt4() {
		qlinktxt4.click();
	}
    public void clickQueueTryHereBtn() {
	    btntryhere.click();
	}
	public void clickRunBtn() {
		btnrun.click();
	}
	
}
