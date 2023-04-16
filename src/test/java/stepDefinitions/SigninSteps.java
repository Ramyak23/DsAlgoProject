package stepDefinitions;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import io.cucumber.java.en.*;
import pageFactory.SigninPage;
import utilities.LoggerLoad;

public class SigninSteps extends BaseClass{
	
	@Given("User is already on home page")
	public void user_is_already_on_home_page() throws IOException {
	    sp=new SigninPage(driver);
	    System.out.println("Validating Login Page");
	    LoggerLoad.info("****Validating Login Page****");
	    loadPropertiesFile();
        String url =prop.getProperty("home_url");
        driver.get(url);
	}

	@When("User clicks signin button")
	public void user_clicks_signin_button() {
		sp.clickBtnSignin();
	}

	@Then("User should land in the login page")
	public void user_should_land_in_the_login_page() throws InterruptedException {
		String title=driver.getTitle();
	    Assert.assertEquals("Login", title);
	    Thread.sleep(1000);
	}

	@Then("User enters {string} and {string}")
	public void user_enters_and(String username, String password) {
		   sp.setUserName(username);
		   sp.setPassword(password);
	}

	@Then("Clicks login button")
	public void clicks_login_button() {
		sp.clickBtnLogin();
	}

	@Then("User gets success message as you are logged in")
	public void user_gets_success_message_you_are_logged_in() throws InterruptedException {
		Thread.sleep(1000);
		if(driver.findElement(By.xpath("//a[contains(text(),'Sign out')]")).isDisplayed()) {
	    	Assert.assertTrue(true);
	    	System.out.println("User Login Passed");
	    	LoggerLoad.info("Login Successful");
	    }
		else {
	    	Assert.assertTrue(false);
	    }
   	}
	
	@Then("User should get a proper warning message")
	public void user_should_get_a_proper_warning_message() throws InterruptedException {
		       Thread.sleep(1000);
		       String actualwarnmsg=driver.findElement(By.xpath("//body/div[3]")).getText();
			   Assert.assertTrue(actualwarnmsg.contains("Invalid Username and Password"));
			   LoggerLoad.info("Login Unsuccessful, Invalid Username and Password");
			   System.out.println("User Login Failed");

	}
}
