package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BasePage {
	
	@Before
	public void setupDriver() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", ".\\src\\test\\resources\\Drivers\\chromedriver.exe");
	    ChromeOptions options = new ChromeOptions();
	    options.addArguments("--remote-allow-origins=*");
	    driver = new ChromeDriver(options);
	    driver.manage().window().maximize();
	    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

	@After
	public void quit() throws Exception {

		driver.quit();
	}


}
