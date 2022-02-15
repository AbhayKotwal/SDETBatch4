package SeleniumTestscripts;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\karrivi\\git\\SeleniumAssignment\\LiveProject\\src\\test\\java\\project\\features\\orangehrp.feature",
		glue="project.StepDefinition",
		dryRun=false, // dryRun should be false to open the chrome
		strict=true, //strict shoould be true to open the chrome
		monochrome=true,
		format= {"pretty", "html:test-output"},
		tags= {"@SmokeTest"}
		)


public class TestCase16_17_18 {

}
