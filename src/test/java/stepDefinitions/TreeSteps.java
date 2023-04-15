package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.apache.commons.logging.Log;
import org.apache.logging.log4j.Logger;
//import junit.framework.Assert;
import org.junit.Assert;
import pageFactory.Tree;
import utilities.LoggerLoad;

public class TreeSteps extends BasePage {
	
	
	//public WebDriver driver;
	
	Hooks ho = new Hooks();
	Tree tr = new Tree(driver);
	
	
	@Given("User Launch Chrome browser")
	public void user_launch_chrome_browser() throws InterruptedException {
		//ho.setupDriver();
	}
	
	@When("User opens URL {string}")
	public void user_opens_url(String url) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		driver.get(url);
		Thread.sleep(2000);
	    //throw new io.cucumber.java.PendingException();
	}

	@When("User Enters username as {string} and Password as {string}")
	public void user_enters_username_as_and_password_as(String userName, String password) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Tree object created successfully.");
		Thread.sleep(2000);
		tr.clickLoginBtn();
		tr.sendUsername(userName);
    	tr.sendPassword(password);
	}

	@When("Click on Login")
	public void click_on_login() {
		tr.submitLoginBtn();
	}

	@When("The user is navigated to  page {string}")
	public void the_user_is_navigated_to_page(String string) {
	    driver.get(string);
	}
	
	@Given("User is on home page")
	public void user_is_on_home_page() {
		System.out.println("Get title :," + driver.getTitle());
	}
	@When("User click on {string} page")
	public void user_click_on_page(String string) {
		tr.clickTree();
	}
	@Then("The user is redirected to {string}")
	public void the_user_is_redirected_to(String string) {
		driver.get(string);
	}
	
	@Given("User is on Tree page")
	public void user_is_on_tree_page() {
	    driver.getTitle();
	}
	@When("The user is navigated to {string}")
	public void the_user_is_navigated_to(String string) {
		driver.get(string);
	}
	@When("The user click {string}")
	public void the_user_click(String string) {
		tr.clickOverViewOfTrees(string);
	}
	
	@When("The user is on page {string}")
	public void the_user_is_on_page(String string) {
		driver.getTitle();
	}
	
	@When("The user click on {string}")
	public void the_user_click_on(String string) throws InterruptedException {
	   Thread.sleep(2000);
	   System.out.println("current url in try here statment" + driver.getCurrentUrl());
	   tr.clickTryHere();
	}
	
	@When("The user should write {string} in tryhere;")
	public void the_user_should_write_in_tryhere(String string) throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("current url in print statment" + driver.getCurrentUrl());
    	tr.printCode(string);
	}
	
	@Then("The user should see {string} printed in blank space.")
	public void the_user_should_see_printed_in_blank_space(String txt) {
		String outputTxt = tr.getCodeOutput(txt);
        Assert.assertEquals(outputTxt, txt);
	}
 
	@When("user is on tryEdititor page")
	public void user_is_on_try_edititor_page() {
	    driver.getCurrentUrl();
	}
	
	@Then("The user should get popup {string}")
	public void the_user_should_get_popup(String string) {
		String popup = driver.switchTo().alert().getText();
		Assert.assertEquals(popup, string);
	}
	
	@When("The user click on second link {string}")
	public void the_user_click_on_second_link(String string) throws InterruptedException {
	    tr.clickTerminologies(string);
	    Thread.sleep(5000);
		LoggerLoad.info("*********current url*********");
		System.out.println(driver.getCurrentUrl());

	}
	
	@When("The user click on third link {string}")
	public void the_user_click_on_third_link(String string) throws InterruptedException {
		tr.clickTypesOfTress(string);
	    Thread.sleep(5000);
		LoggerLoad.info("*********current url*********");
		System.out.println("url for third link," + driver.getCurrentUrl());
	}
	
	@When("The user click on fourth link {string}")
	public void the_user_click_on_fourth_link(String string) {
	   tr.clickTreeTraversals(string);
	}
	
	@When("The user click on binary tree {string}")
	public void the_user_click_on_binary_tree(String string) {
	    tr.clickTraversalsIllustration(string);
	}
	
	@When("The user click on traversal illustration {string}")
	public void the_user_click_on_traversal_illustration(String string) {
	    tr.clickBinaryTree(string);
	}
	
	@When("The user click on types of binary trees {string}")
	public void the_user_click_on_types_of_binary_trees(String string) {
	    tr.clickTypesOfBinaryTree(string);
	}
	
	@When("The user click on implementation in python {string}")
	public void the_user_click_on_implementation_in_python(String string) {
	    tr.clickImplementationOfPyhton(string);
	}
    
	@When("The user click on binary tree traversals {string}")
	public void the_user_click_on_binary_tree_traversals(String string) {
	    tr.clickBinaryTreeTrav(string);
	}
    
	@When("The user click on implementation of tree {string}")
	public void the_user_click_on_implementation_of_tree(String string) {
	    tr.clickImpOfBinarytree(string);
	}
	
	@When("The user click on apps of binary tree {string}")
	public void the_user_click_on_apps_of_binary_tree(String string) {
	    tr.clickAppsOfBinaryTrees(string);
	}
	
	@When("The user click implementation of bst {string}")
	public void the_user_click_implementation_of_bst(String string) {
	    tr.clickImplementationOfBST(string);
	}
    
	@When("The user click on binary search tree {string}")
	public void the_user_click_on_binary_search_tree(String string) {
	    tr.clickBinarySearchTrees(string);
	}




	
	

}
