package com.testrunner2;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features = "Feature2",
		glue = "com.stepdef",
		tags="@tests"
		
	
		
		
		)

public class TestRunner2 extends AbstractTestNGCucumberTests {

}
