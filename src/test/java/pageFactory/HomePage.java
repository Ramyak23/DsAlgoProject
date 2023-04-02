package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
 
	public WebDriver ldriver;
	
	public HomePage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//button[contains(text(),'Get Started')]")WebElement btnGetStart;
	@FindBy(xpath="//div[1]/a[contains(text(),'Get Started')]")WebElement btnDSGetStart;
	@FindBy(xpath="//div[@id=\"navbarCollapse\"]/div[1]/div/a")WebElement dsMenu;
	@FindBy(xpath="//div[@id=\"navbarCollapse\"]/div[1]/div/div/a[1]")WebElement selectArrays;
	
	public void clickGetStartBtn() {
		btnGetStart.click();
	}
	
	public void clickDSGetStartBtn() {
		btnDSGetStart.click();
	}
	public void clickDSMenu() {
		dsMenu.click();
		selectArrays.click();
	}
	
}



