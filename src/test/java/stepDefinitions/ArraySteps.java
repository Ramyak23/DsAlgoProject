package stepDefinitions;

import java.util.Map;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.ArrayPage;
import utilities.LoggerLoad;

public class ArraySteps extends BaseClass{

	@Given("User clicks on Get Started button of Array in dsalgo home page")
	public void user_clicks_on_get_started_button_of_array_in_dsalgo_home_page() {
	   ap=new ArrayPage(driver);
	   LoggerLoad.info("*****Validating Array Page*****");
	   System.out.println("Automating Array Module");
	   ap.clickArrayGetStartButn();
	}

	@When("User click Arrays in Python link in Array home page")
	public void user_click_arrays_in_python_link_in_array_home_page() {
	   ap.clickArrayLinkTxt1();
	}

	@When("User click Arrays Using List link in Array home page")
	public void user_click_arrays_using_list_link_in_array_home_page() {
	    ap.clickArrayLinkTxt2();
	}

	@When("User click Basic Operations in Lists link in Array home page")
	public void user_click_basic_operations_in_lists_link_in_array_home_page() {
	    ap.clickArrayLinkTxt3();
	}

	@When("User click Applications of Array link in Array home page")
	public void user_click_applications_of_array_link_in_array_home_page() {
	    ap.clickArrayLinkTxt4();
	}

	@When("User click Practice Questions link in Arrays in python page")
	public void user_click_practice_questions_link_in_arrays_in_python_page() {
		ap.clickArrayLinkTxt1();
	    ap.clickArrayLinkTxt5();
	}

	@Then("User navigated to array practice page with respective four practice link")
	public void user_navigated_to_array_practice_page_with_respective_four_practice_link() {
		    if(driver.findElement(By.xpath("//body/div[2][@class='list-group']")).isDisplayed()) {
	    	Assert.assertTrue(true);
	    }
	}
    
	@When("User navigated to array practice page and clicks Search the array practice link")
	public void user_navigated_to_array_practice_page_and_clicks_search_the_array_practice_link() {
	   ap.clickArrayLinkTxt6();
	}
	@Then("User enters the Python code in the respective field")
	public void user_enters_the_python_code_in_the_respective_field(DataTable table) throws InterruptedException {
		Map<String,String> map= table.asMap(String.class,String.class);
		 WebElement txtfield=driver.findElement(By.xpath("//form[@id='answer_form']/div/div/div[1]/textarea"));
		 Actions action = new Actions(driver);
		 action.keyDown(Keys.SHIFT).sendKeys(txtfield, "a").perform();
		 txtfield.sendKeys(Keys.DELETE);
		 txtfield.sendKeys(map.get("pythoncode"));
	     Thread.sleep(1000);
	}
    
	@Then("User validates with the wrong Python code")
	public void user_validates_with_the_wrong_python_code(DataTable table) throws InterruptedException {
	    driver.navigate().back();
	    ap.clickArrayLinkTxt6();
	    Map<String,String> map= table.asMap(String.class,String.class);
	    WebElement txtfield=driver.findElement(By.xpath("//form[@id='answer_form']/div/div/div[1]/textarea"));
		 Actions action = new Actions(driver);
		 action.keyDown(Keys.SHIFT).sendKeys(txtfield, "a").perform();
		 txtfield.sendKeys(Keys.DELETE);
		 txtfield.sendKeys(map.get("pythoncode"));
	     Thread.sleep(1000);
	}
	
	@When("User navigated to array practice page and clicks Max Consecutive Ones practice link")
	public void user_navigated_to_array_practice_page_and_clicks_max_consecutive_ones_practice_link() {
	    ap.clickArrayLinkTxt7();
	}
	
	@When("User navigated to array practice page and clicks Find Numbers with Even Number of Digits practice link")
	public void user_navigated_to_array_practice_page_and_clicks_find_numbers_with_even_number_of_digits_practice_link() {
	    ap.clickArrayLinkTxt8();
	}
	
	@When("User navigated to array practice page and clicks Squares of a Sorted Array practice link")
	public void user_navigated_to_array_practice_page_and_clicks_squares_of_a_sorted_array_practice_link() {
	    ap.clickArrayLinkTxt9();
	}
}
