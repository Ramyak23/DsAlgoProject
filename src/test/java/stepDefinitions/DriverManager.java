package stepDefinitions;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Allure;
import utilities.LoggerLoad;

public class DriverManager extends BaseClass {

	
	@Before
	public void setup() throws IOException {
		//Reading Properties
	configProp = new Properties();
	FileInputStream configPropfile=new FileInputStream("src/test/resources/config.properties");
	configProp.load(configPropfile);
	
	String br=configProp.getProperty("browser");
	
	if(br.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", configProp.getProperty("chromepath"));
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	else if(br.equals("edge")) {
		System.setProperty("webdriver.edge.driver", configProp.getProperty("edgepath"));
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	else if(br.equals("firefox")) {
		System.setProperty("webdriver.gecko.driver", configProp.getProperty("firefoxpath"));
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	//LoggerLoad.info("********Launching Browser********");
	
		}	
	
	@After
	public void teardown(Scenario scenario) {
		
		if(scenario.isFailed()) {
			LoggerLoad.error("Steps Failed, Taking Screenshot");
			byte[] screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot,"image/png","Failed Screenshot");
			Allure.addAttachment("Failed Screenshot", new ByteArrayInputStream(screenshot));
		}
		//LoggerLoad.info("********Closing Browser********");
		driver.quit();
	}
	
}
