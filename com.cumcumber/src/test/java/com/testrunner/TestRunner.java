package com.testrunner;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\HP\\eclipse-workspace\\com.cumcumber\\src\\test\\resources\\login.feature",
		glue ="com.stepdefinition",
		dryRun= false,
		plugin ="junit:target\\report.xml"
		)



public class TestRunner {

}
