package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\Anshu\\Test\\Cucumber\\src\\main\\java\\features"
		,glue = {"stepDefinition"}
		,plugin = {"pretty", "html:target/cucumber"}
		,monochrome = true
		
		)
public class TestRunner {

}
