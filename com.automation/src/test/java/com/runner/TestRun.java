package com.runner;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/login.features",
		glue ={"com.steps"},
		dryRun= false,
		plugin ="junit:target\\report.xml"
		)


public class TestRun {

}
