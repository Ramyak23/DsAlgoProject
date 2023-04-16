package stepDefinitions;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.HomePage;
import utilities.LoggerLoad;

public class HomePageSteps extends BaseClass {
	
		
	@Given("User launch browser")
	public void user_launch_browser() {
	    hp=new HomePage(driver);
	   	}

	@When("The user opens DS Algo portal link")
	public void the_user_opens_ds_algo_portal_link() throws IOException {
		LoggerLoad.info("********Opening DSAlgo Portal********");
		System.out.println("Validating Home Page");
		loadPropertiesFile();
        String url =prop.getProperty("app_url");
      	driver.get(url);
	}

	@When("The user clicks the Get Started button")
	public void the_user_clicks_the_button() {
	    hp.clickGetStartBtn();
	}

	@Then("The user should be redirected to homepage")
	public void the_user_should_be_redirected_to_homepage() throws InterruptedException {
		Thread.sleep(1000);
		String title=driver.getTitle();
		System.out.println("Page title is : " +title);
		Assert.assertEquals("NumpyNinja", title);
		
	}

	@When("The user is navigated to home page")
	public void the_user_is_navigated_to_home_page() throws IOException {
		LoggerLoad.info("********Validating Home Page********");
		loadPropertiesFile();
        String url =prop.getProperty("home_url");
        driver.get(url);
	}

	@When("The user clicks on Get Started button of Data Structures without login")
	public void the_user_clicks_on_button_of_data_structures_without_login() {
	   hp.clickDSGetStartBtn();
	}

	@Then("The user get warning message {string}")
	public void the_user_get_warning_message(String warningmsg) throws InterruptedException {
	   String actualwarnmsg=driver.findElement(By.xpath("//body/div[2]")).getText();
	   Assert.assertEquals(actualwarnmsg,warningmsg);
	   LoggerLoad.warn(warningmsg);
	   Thread.sleep(2000);
	}

	@When("The user click Data Structures dropdown menu and select Arrays options")
	public void the_user_click_data_structures_dropdown_menu_and_select_arrays_options() throws InterruptedException {
	    hp.clickDSMenu();
	    hp.clickDSArrayOption();
	  	Thread.sleep(2000);
	}
	
	@Then("Close browser")
	public void close_browser() {
	   driver.close();
	}
    
	@Given("User is on home page")
	public void user_is_on_home_page() throws IOException {
		loadPropertiesFile();
        String url =prop.getProperty("home_url");
        driver.get(url);
	   	}

	@When("User clicks Data Structures dropdown menu")
	public void user_clicks_data_structures_dropdown_menu() {
		hp=new HomePage(driver);
	   hp.clickDSMenu();
	}

	@Then("User should be able to see list of all the options in the dropdown")
	public void user_should_be_able_to_see_list_of_all_the_options_in_the_dropdown() throws InterruptedException {
	    Thread.sleep(2000);
	}
    
	@When("User clicks on Register link")
	public void user_clicks_on_register_link() {
		hp=new HomePage(driver);
	    hp.clickRegisterBtn();
	}

	@Then("User should land in the Register page")
	public void user_should_land_in_the_register_page() throws InterruptedException {
		String title=driver.getTitle();
	    Assert.assertEquals("Registration", title);
	    Thread.sleep(1000);
	}

	@When("User clicks on Sign in link")
	public void user_clicks_on_sign_in_link() {
		hp=new HomePage(driver);
	   hp.clickSigninBtn();
	}

	@Then("User should land in the Login page")
	public void user_should_land_in_the_login_page() throws InterruptedException {
		String title=driver.getTitle();
	    Assert.assertEquals("Login", title);
	    Thread.sleep(1000);
	}

}
