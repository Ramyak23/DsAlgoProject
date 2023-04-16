package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TreePage {

public WebDriver ldriver;
	
	public TreePage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//h5[contains(text(), 'Tree')]/following::a[1]")WebElement butnTreeGetStart;
	@FindBy(linkText="Overview of Trees")WebElement tlinktxt1;
	@FindBy(linkText="Terminologies")WebElement tlinktxt2;
	@FindBy(linkText="Types of Trees")WebElement tlinktxt3;
	@FindBy(linkText="Tree Traversals")WebElement tlinktxt4;
	@FindBy(linkText="Traversals-Illustration")WebElement tlinktxt5;
	@FindBy(linkText="Binary Trees")WebElement tlinktxt6;
	@FindBy(xpath="//body/div[2]//ul[7]/a")WebElement tlinktxt7;
	@FindBy(linkText="Implementation in Python")WebElement tlinktxt8;
	@FindBy(linkText="Binary Tree Traversals")WebElement tlinktxt9;
	@FindBy(linkText="Implementation of Binary Trees")WebElement tlinktxt10;
	@FindBy(linkText="Applications of Binary trees")WebElement tlinktxt11;
	@FindBy(linkText="Binary Search Trees")WebElement tlinktxt12;
	@FindBy(linkText="Implementation Of BST")WebElement tlinktxt13;
	@FindBy(xpath="//div[2]/div/div[2]/a")WebElement btntryhere;
	@FindBy(xpath="//form[@id='answer_form']/div/div/div[1]/textarea")WebElement treetxtarea;
	@FindBy(xpath="//button[contains(text(),'Run')]")WebElement btnrun;
	
	
	public void clickTreeGetStartButn() {
		butnTreeGetStart.click();
	}
	public void clickTLinkTxt1() {
		tlinktxt1.click();
	}
	public void clickTLinkTxt2() {
		tlinktxt2.click();
	}
	public void clickTLinkTxt3() {
		tlinktxt3.click();
	}
	public void clickTLinkTxt4() {
		tlinktxt4.click();
	}
	public void clickTLinkTxt5() {
		tlinktxt5.click();
	}
	public void clickTLinkTxt6() {
		tlinktxt6.click();
	}
	public void clickTLinkTxt7() {
		tlinktxt7.click();
	}
	public void clickTLinkTxt8() {
		tlinktxt8.click();
	}
    public void clickTLinkTxt9() {
		tlinktxt9.click();
	}
    public void clickTLinkTxt10() {
		tlinktxt10.click();
	}
    public void clickTLinkTxt11() {
		tlinktxt11.click();
	}
    public void clickTLinkTxt12() {
		tlinktxt12.click();
	}
    public void clickTLinkTxt13() {
		tlinktxt13.click();
	}
    public void clickTreeTryHereBtn() {
	    btntryhere.click();
	}
	public void clickRunBtn() {
		btnrun.click();
	}
}
