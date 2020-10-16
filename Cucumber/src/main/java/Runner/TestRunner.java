package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\Anshu\\git\\CucumberFramework\\Cucumber\\src\\main\\java\\features\\"
		,glue = {"stepDefinition"}
		,plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		//,plugin = { "pretty", "html:target/cucumber-reports/Cucumber.html" }
		, monochrome = true
		//	, dryRun = true
		, publish = true
		)
public class TestRunner {
 
}
