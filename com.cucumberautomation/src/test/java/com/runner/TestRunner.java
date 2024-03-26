package com.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

import io.cucumber.*;

public class TestRunner {
	
@RunWith(Cucumber.class)
@CucumberOptions(
		
		    features= "src/test/resources/login.feature",
		    glue= {"com.stepdef"},
		    dryRun= false,
		    monochrome = true ,
		    plugin = {"pretty" ,"jason:target/cucumber-reports/Cucumber.xml"}
		   
}
