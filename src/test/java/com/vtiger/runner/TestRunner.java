package com.vtiger.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/Features",
		glue= {"com.vtiger.stepdefinitions"},
		dryRun = true
		
		
		
		
		
		)
public class TestRunner {

}
