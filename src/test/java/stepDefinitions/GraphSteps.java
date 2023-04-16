package stepDefinitions;

import java.io.IOException;
import java.util.Map;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.GraphPage;
import utilities.LoggerLoad;

public class GraphSteps extends BaseClass{

		
	@Given("User is on home page and clicks signin button")
	public void user_is_on_home_page_and_clicks_signin_button() throws IOException  {
	    gp=new GraphPage(driver);
	    System.out.println("Automating Graph Module");
	    loadPropertiesFile();
        String locator =prop.getProperty("home_url");
  	    driver.get(locator);
	    gp.clickBtnSignin();
	}
	    
	@Then("User enters username and password")
	public void user_enters_username_and_password() {
	   driver.findElement(By.name("username")).sendKeys(prop.getProperty("username"));
	   driver.findElement(By.name("password")).sendKeys(prop.getProperty("password"));
	}

	@Then("Clicks Login button")
	public void clicks_login_button() {
	   gp.clickBtnLogin();
	}

	@Then("User gets success login message")
	public void user_gets_success_login_message() {
		Assert.assertTrue(driver.findElement(By.xpath("//body/div[2]")).getText().contains("You are logged in"));
	}

	@Given("User clicks on Get Started button of Graph in home page")
	public void user_clicks_on_get_started_button_of_graph_in_home_page() {
		LoggerLoad.info("****Validating Graph Page****");
		gp.clickGraphGetStartButn();
	}

	@When("User click Graph link in Graph home page")
	public void user_click_graph_link_in_graph_home_page() {
	    gp.clickGraphLinkTxt();
	}

	@When("Clicks Try Here button in Graph page")
	public void clicks_try_here_button_in_graph_page() {
	   gp.clickGraphTryHereBtn();
	}

	@Then("User navigated to tryEditor page and enters the Python code")
	public void user_navigated_to_try_editor_page_and_enters_the_python_code(DataTable table) {
	   	Map<String,String> map= table.asMap(String.class,String.class);
	    driver.findElement(By.xpath("//form[@id='answer_form']/div/div/div[1]/textarea")).sendKeys(map.get("pythoncode"));
	}

	@Then("Clicks Run button and gets the respected output")
	public void clicks_run_button_and_gets_the_respected_output() throws InterruptedException {
	    gp.clickRunBtn();
	    Thread.sleep(1000);
	}
	
	@Then("User navigated to tryEditor page and enters the incorrect Python code")
	public void user_navigated_to_try_editor_page_and_enters_the_incorrect_python_code(DataTable table) {
		Map<String,String> map= table.asMap(String.class,String.class);
	    driver.findElement(By.xpath("//form[@id='answer_form']/div/div/div[1]/textarea")).sendKeys(map.get("pythoncode"));
	 	}
   
	@Then("Clicks Run button and gets popup error message")
	public void clicks_run_button_and_gets_popup_error_message() throws InterruptedException {
		gp.clickRunBtn();
		Thread.sleep(1000);
		//Handle Alerts 
	    Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept(); 
		driver.close();
	}
	
	@When("User click Graph Representation link in Graph home page")
	public void user_click_graph_representation_link_in_graph_home_page() {
	    gp.clickGraphRepLinkTxt();
	}

	@When("Clicks Try Here button in Graph Representation page")
	public void clicks_try_here_button_in_graph_representation_page() {
	   gp.clickGraphTryHereBtn();
	}

}
