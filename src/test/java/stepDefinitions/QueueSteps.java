package stepDefinitions;

import java.util.Map;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import pageFactory.QueuePage;
import utilities.LoggerLoad;

public class QueueSteps extends BaseClass{

	@Given("User clicks on Get Started button of Queue in dsalgo home page")
	public void user_clicks_on_get_started_button_of_queue_in_dsalgo_home_page() {
	   qp=new QueuePage(driver);
	   System.out.println("Automating Queue Module");
	   LoggerLoad.info("****Validating Queue Page****");
	   qp.clickQueueGetStartButn();
	}

	@When("User click Implementation of Queue in Python link in Queue home page")
	public void user_click_implementation_of_queue_in_python_link_in_queue_home_page() {
	    qp.clickqLinkTxt1();
	}

	@When("Clicks Try Here button in that specific link page")
	public void clicks_try_here_button_in_that_specific_link_page() {
		qp=new QueuePage(driver);
	    qp.clickQueueTryHereBtn();
	}

	@Then("User navigated back to tryEditor page and enters the wrong Python code")
	public void user_navigated_back_to_try_editor_page_and_enters_the_wrong_python_code(DataTable table) {
	    driver.navigate().back();
	    qp.clickQueueTryHereBtn();
	    Map<String,String> map= table.asMap(String.class,String.class);
	    driver.findElement(By.xpath("//form[@id='answer_form']/div/div/div[1]/textarea")).sendKeys(map.get("pythoncode"));
	}

	@Then("Again clicks Run button and gets popup error message")
	public void again_clicks_run_button_and_gets_popup_error_message() throws InterruptedException {
		qp=new QueuePage(driver);
	    qp.clickRunBtn();
	    Thread.sleep(1000);
		//Handle Alerts 
	    Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept(); 
		driver.close();
	}

   @When("User click Implementation using collections.deque link in Queue home page")
   public void user_click_implementation_using_collections_deque_link_in_queue_home_page() {
           qp.clickqLinkTxt2();
   }

    @When("User click Implementation using array link in Queue home page")
    public void user_click_implementation_using_array_link_in_queue_home_page() {
           qp.clickqLinkTxt3();
    }

    @When("User click Queue Operations link in Queue home page")
    public void user_click_queue_operations_link_in_queue_home_page() {
          qp.clickqLinkTxt4();
    }

}
