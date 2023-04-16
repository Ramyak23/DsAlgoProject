package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageFactory.TreePage;
import utilities.LoggerLoad;

public class TreeSteps extends BaseClass{

	@Given("User clicks on Get Started button of Tree in dsalgo home page")
	public void user_clicks_on_get_started_button_of_tree_in_dsalgo_home_page() {
	   tp=new TreePage(driver);
	   LoggerLoad.info("*****Validating Tree Module*****");
	   System.out.println("Validating Tree Module");
	   tp.clickTreeGetStartButn();
	}

	@When("User click Overview of Trees link in Tree home page")
	public void user_click_overview_of_trees_link_in_tree_home_page() {
	    tp.clickTLinkTxt1();
	}
    
	@When("User click Terminologies link in Tree home page")
	public void user_click_terminologies_link_in_tree_home_page() {
	    tp.clickTLinkTxt2();
	}

	@When("User click Types of Trees link in Tree home page")
	public void user_click_types_of_trees_link_in_tree_home_page() {
	   tp.clickTLinkTxt3();
	}

	@When("User click Tree Traversals link in Tree home page")
	public void user_click_tree_traversals_link_in_tree_home_page() {
	    tp.clickTLinkTxt4();
	}

	@When("User click Traversals-Illustration link in Tree home page")
	public void user_click_traversals_illustration_link_in_tree_home_page() {
	    tp.clickTLinkTxt5();
	}

	@When("User click Binary Trees link in Tree home page")
	public void user_click_binary_trees_link_in_tree_home_page() {
	    tp.clickTLinkTxt6();
	}

	@When("User click Types of Binary trees link in Tree home page")
	public void user_click_types_of_binary_trees_link_in_tree_home_page() {
	    tp.clickTLinkTxt7();
	}

	@When("User click Implementation in Python link in Tree home page")
	public void user_click_implementation_in_python_link_in_tree_home_page() {
	    tp.clickTLinkTxt8();
	}

	@When("User click Binary Tree Traversals link in Tree home page")
	public void user_click_binary_tree_traversals_link_in_tree_home_page() {
	    tp.clickTLinkTxt9();
	}

	@When("User click Implementation of Binary Trees link in Tree home page")
	public void user_click_implementation_of_binary_trees_link_in_tree_home_page() {
	    tp.clickTLinkTxt10();
	}

	@When("User click Applications of Binary trees link in Tree home page")
	public void user_click_applications_of_binary_trees_link_in_tree_home_page() {
	    tp.clickTLinkTxt11();
	}

	@When("User click Binary Search Trees link in Tree home page")
	public void user_click_binary_search_trees_link_in_tree_home_page() {
	    tp.clickTLinkTxt12();
	}

	@When("User click Implementation Of BST link in Tree home page")
	public void user_click_implementation_of_bst_link_in_tree_home_page() {
	    tp.clickTLinkTxt13();
	}

}
