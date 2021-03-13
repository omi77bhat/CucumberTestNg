package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)				
@CucumberOptions(features= {"src/test/resource/Login.feature"},
				glue={"stepDefinition"},
	//			tags = "@Smoke",
	//			monochrome = true,
				dryRun = true
				
				
)


public class RunnerTest extends AbstractTestNGCucumberTests{}
