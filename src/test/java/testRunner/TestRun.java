package testRunner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		plugin = {"pretty", "html:target/cucumber-report.html"}, //reporting purpose
		monochrome=false,  //console output color
		
		features = {"src/test/resources/Features"}, //location of feature files
		glue= "stepDefinitions") //location of step definition files



public class TestRun extends AbstractTestNGCucumberTests {

	@Override
    @DataProvider(parallel = false)
    public Object[][] scenarios() {
				
		return super.scenarios();
}

}