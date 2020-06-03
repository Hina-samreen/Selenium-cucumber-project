package cucumbercv.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions (
	
	features= {"src/test/java/cucumbercv/featureFiles/"},
	glue= {"cucumbercv.stepFiles"},
	plugin= {"pretty","html:target/cucumberReport"}
)

public class MainRunner {
	

}
