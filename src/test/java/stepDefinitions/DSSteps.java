package stepDefinitions;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.AlldsPage;
import utilities.LoggerLoad;

public class DSSteps extends BaseClass {
	
	 
	@Given("User starts browser")
	public void user_starts_browser() {
		ds=new AlldsPage(driver);
	    System.out.println("Validating DataStructures Module");
	}

	@Then("The user enters the home page url")
	public void the_user_enters_the_home_page_url() throws IOException {
		loadPropertiesFile();
        String url =prop.getProperty("home_url");
        driver.get(url);
		}

	@Then("Click signin button")
	public void click_signin_button() throws InterruptedException {
		 Thread.sleep(1000);
		 ds=new AlldsPage(driver);
		 ds.clickBtnSignin();
	}
	
	@Given("User enters username as {string} and password as {string}")
	public void user_enters_username_as_and_password_as(String username, String password) {
	   ds.setUserName(username);
	   ds.setPassword(password);
	}

	@Given("Click Login button")
	public void click_login_button() {
	   ds.clickBtnLogin();
	}

	@Then("Success message {string} is displayed")
	public void success_message_is_displayed(String loginmsg) {
		Assert.assertTrue(driver.findElement(By.xpath("//body/div[2]")).getText().contains(loginmsg));
	       LoggerLoad.info(loginmsg);
	}

	@Given("User clicks on Get Started button of Data Structures-Introduction tab")
	public void user_clicks_on_button_of_data_structures_introduction_tab() {
		LoggerLoad.info("********Data Structures-Introduction********");
	    ds.clickDSGetStartButn();
	}

	@When("User click time complexity link in data structures page")
	public void user_click_time_complexity_link_in_data_structures_page() {
	   ds.clickDSLinkTxt();
	}

	@When("User clicks Try Here button in time complexity page")
	public void user_clicks_try_here_button_in_time_complexity_page() {
	   ds.clickDSTryHereBtn();
	}

	@Then("User navigated to tryEditor page and enters the Python code as {string}")
	public void user_navigated_to_try_editor_page_and_enters_the_python_code_as(String printcode) {
	    ds.setCode(printcode);
	}

	@Then("Clicks Run button and gets the output")
	public void clicks_run_button_and_gets_the_output()  {
	    ds.clickRunBtn();
	    //driver.navigate().back();
	    driver.close();
	}
	
	@Then("User navigated to tryEditor page and enters the incorrect Python code syntax as {string}")
	public void user_navigated_to_try_editor_page_and_enters_the_incorrect_python_code_syntax_as(String wrngcode) {
		ds.setCode(wrngcode);
	}

	@Then("Clicks Run button and gets the popup error message")
	public void clicks_run_button_and_gets_the_popup_error_message() {
		ds.clickRunBtn();
		//Handle Alerts 
	    Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept(); 
		driver.close();
	}

}
