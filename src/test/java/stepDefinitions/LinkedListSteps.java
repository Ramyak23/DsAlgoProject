package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageFactory.LinkedListPage;
import utilities.LoggerLoad;

public class LinkedListSteps extends BaseClass{

	@Given("User clicks on Get Started button of LinkedList in dsalgo home page")
	public void user_clicks_on_get_started_button_of_linked_list_in_dsalgo_home_page() {
		   lp=new LinkedListPage(driver);
		   LoggerLoad.info("*****Validating LinkedList Module*****");
		   System.out.println("Automating LinkedList Module");
		   lp.clickLLGetStartButn();
	}

	@When("User click Introduction link in LinkedList home page")
	public void user_click_introduction_link_in_linked_list_home_page() {
	    lp.clickLLLinkTxt1();
	}

	@When("User click Creating Linked LIst link in LinkedList home page")
	public void user_click_creating_linked_l_ist_link_in_linked_list_home_page() {
	    lp.clickLLLinkTxt2();
	}

	@When("User click Types of Linked List link in LinkedList home page")
	public void user_click_types_of_linked_list_link_in_linked_list_home_page() {
	    lp.clickLLLinkTxt3();
	}

	@When("User click Implement Linked List in Python link in LinkedList home page")
	public void user_click_implement_linked_list_in_python_link_in_linked_list_home_page() {
	   lp.clickLLLinkTxt4();
	}

	@When("User click Traversal link in LinkedList home page")
	public void user_click_traversal_link_in_linked_list_home_page() {
	   lp.clickLLLinkTxt5();
	}

	@When("User click Insertion link in LinkedList home page")
	public void user_click_insertion_link_in_linked_list_home_page() {
	    lp.clickLLLinkTxt6();
	}

	@When("User click Deletion link in LinkedList home page")
	public void user_click_deletion_link_in_linked_list_home_page() {
	    lp.clickLLLinkTxt7();
	}

}
