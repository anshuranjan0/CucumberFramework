package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\Admin\\git\\Cucumber_Framework\\Cucumber\\src\\main\\java\\features\\"
		,glue = {"stepDefinition"}
		,plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		,monochrome = true
		,publish = true
		)
public class TestRunner {
 
}

