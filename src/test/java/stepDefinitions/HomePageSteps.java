package stepDefinitions;

import java.time.Duration;
import utilities.LoggerLoad;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;
import pageFactory.HomePage;

public class HomePageSteps {
	
	public WebDriver driver;
	public HomePage hp;
	
	
	@Given("User launch browser")
	public void user_launch_browser() {
	    System.setProperty("webdriver.edge.driver", ".\\src\\test\\resources\\Drivers\\chromedriver.exe");
	    ChromeOptions options = new ChromeOptions();
	    options.addArguments("--remote-allow-origins=*");
	    driver = new ChromeDriver(options);
	    //driver=new ChromeDriver();
	    driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    hp=new HomePage(driver);
	}

	@When("The user opens DS Algo portal link {string}")
	public void the_user_opens_ds_algo_portal_link(String url) {
	   driver.get(url);
	}

	@When("The user clicks the {string} button")
	public void the_user_clicks_the_button(String string) {
	    hp.clickGetStartBtn();
	}

	@Then("The user should be redirected to homepage")
	public void the_user_should_be_redirected_to_homepage() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("Page title is : " + driver.getTitle());
	}

	@When("The user is navigated to home page {string}")
	public void the_user_is_navigated_to_home_page(String url) {
	   driver.get(url);
	}

	@When("The user clicks on {string} button of Data Structures without login")
	public void the_user_clicks_on_button_of_data_structures_without_login(String string) {
	   hp.clickDSGetStartBtn();
	}

	@Then("The user get warning message {string}")
	public void the_user_get_warning_message(String warningmsg) throws InterruptedException {
	   LoggerLoad.error(warningmsg);
	   Thread.sleep(2000);
	}

	@When("The user click Data Structures dropdown menu and select Arrays options")
	public void the_user_click_data_structures_dropdown_menu_and_select_arrays_options() throws InterruptedException {
	    hp.clickDSMenu();
	  	Thread.sleep(2000);
	}
	
	@Then("Close browser")
	public void close_browser() {
	   driver.close();
	}

}
