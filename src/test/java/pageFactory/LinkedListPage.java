package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LinkedListPage {

public WebDriver ldriver;
	
	public LinkedListPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//h5[contains(text(), 'Linked List')]/following::a[1]")WebElement butnLLGetStart;
	@FindBy(linkText="Introduction")WebElement LLlinktxt1;
	@FindBy(linkText="Creating Linked LIst")WebElement LLlinktxt2;
	@FindBy(linkText="Types of Linked List")WebElement LLlinktxt3;
	@FindBy(linkText="Implement Linked List in Python")WebElement LLlinktxt4;
	@FindBy(linkText="Traversal")WebElement LLlinktxt5;
	@FindBy(linkText="Insertion")WebElement LLlinktxt6;
	@FindBy(linkText="Deletion")WebElement LLlinktxt7;
	@FindBy(xpath="//div[2]/div/div[2]/a")WebElement btntryhere;
	@FindBy(xpath="//form[@id='answer_form']/div/div/div[1]/textarea")WebElement LLtxtarea;
	@FindBy(xpath="//button[contains(text(),'Run')]")WebElement btnrun;
	
	
	public void clickLLGetStartButn() {
		butnLLGetStart.click();
	}
	public void clickLLLinkTxt1() {
		LLlinktxt1.click();
	}
	public void clickLLLinkTxt2() {
		LLlinktxt2.click();
	}
	public void clickLLLinkTxt3() {
		LLlinktxt3.click();
	}
	public void clickLLLinkTxt4() {
		LLlinktxt4.click();
	}
	public void clickLLLinkTxt5() {
		LLlinktxt5.click();
	}
	public void clickLLLinkTxt6() {
		LLlinktxt6.click();
	}
	public void clickLLLinkTxt7() {
		LLlinktxt7.click();
	}
	public void clickLLTryHereBtn() {
		    btntryhere.click();
	}
	public void clickRunBtn() {
			btnrun.click();
	}
	
	
}
