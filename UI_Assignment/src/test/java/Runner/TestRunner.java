package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions( 
		features={"Features/DemoTest.feature"},
		glue={"Steps"},
				 plugin = {"pretty"  , "html:target/TestReport/report.html"},
		publish = true,
		monochrome=true
	)

public class TestRunner {

}
