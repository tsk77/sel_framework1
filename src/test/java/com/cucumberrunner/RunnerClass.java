package com.cucumberrunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= "/Users/shivakumarthalla/Documents/neon-workspace/TU/src/test/resources/features",
		glue={"com.stepdefinition"},
		tags={"@now"}
		//plugin={}
		)
public class RunnerClass {

}
