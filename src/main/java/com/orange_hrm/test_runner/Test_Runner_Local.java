package com.orange_hrm.test_runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		plugin= {"pretty","html:target","com.cucumber.listener.ExtentCucumberFormatter:target/Cucumber_Extents_report.html"},
		features="src/test/resources/Feature_Files/Orange_Hrm_LogIn.feature",
		glue="com.orange_hrm_step_def"
		
		
		)

public class Test_Runner_Local extends AbstractTestNGCucumberTests {
	

}
