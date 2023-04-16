package stepDefinitions;

import io.cucumber.java.en.*;
import pageFactory.StackPage;
import utilities.LoggerLoad;

public class StackSteps extends BaseClass{

	@Given("User clicks on Get Started button of Stack in home page")
	public void user_clicks_on_get_started_button_of_stack_in_home_page() {
	    stp=new StackPage(driver);
	    System.out.println("Automating Stack Module");
	    LoggerLoad.info("****Validating Stack Page****");
	    stp.clickStackGetStartButn();
	}

	@When("User click Operations in Stack link in Stack home page")
	public void user_click_operations_in_stack_link_in_stack_home_page() {
	    stp.clickOSLinkTxt();
	}

	@When("Clicks Try Here button in Operations in Stack page")
	public void clicks_try_here_button_in_operations_in_stack_page() {
	    stp.clickStackTryHereBtn();
	}
	
	@When("User click Implementation link in Stack home page")
	public void user_click_implementation_link_in_stack_home_page() {
	   stp.clickImpLinkTxt();
	}

	@When("Clicks Try Here button in Implementation page")
	public void clicks_try_here_button_in_implementation_page() {
	    stp.clickStackTryHereBtn();
	}

	@When("User click Applications link in Stack home page")
	public void user_click_applications_link_in_stack_home_page() {
	    stp.clickAppLinkTxt();
	}

	@When("Clicks Try Here button in Applications page")
	public void clicks_try_here_button_in_applications_page() {
	    stp.clickStackTryHereBtn();
	}

}
