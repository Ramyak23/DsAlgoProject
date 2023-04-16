package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StackPage {

public WebDriver ldriver;
	
	public StackPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//h5[contains(text(), 'Stack')]/following::a[1]")WebElement butnStackGetStart;
	@FindBy(linkText="Operations in Stack")WebElement linktxt1;
    @FindBy(linkText="Implementation")WebElement linktxt2;
    @FindBy(linkText="Applications")WebElement linktxt3;
	@FindBy(xpath="//div[2]/div/div[2]/a")WebElement btntryhere;
    @FindBy(xpath="//form[@id='answer_form']/div/div/div[1]/textarea")WebElement stacktxtarea;
	@FindBy(xpath="//button[contains(text(),'Run')]")WebElement btnrun;
	
	
    public void clickStackGetStartButn() {
		butnStackGetStart.click();
	}
	public void clickOSLinkTxt() {
		linktxt1.click();
	}
    public void clickImpLinkTxt() {
		linktxt2.click();
	}
    public void clickAppLinkTxt() {
		linktxt3.click();
	}
	public void clickStackTryHereBtn() {
	    btntryhere.click();
	}
	public void setCode(String code) {
		stacktxtarea.sendKeys(code);
	}
	public void clickRunBtn() {
		btnrun.click();
	}
}
