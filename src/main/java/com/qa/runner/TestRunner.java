package com.qa.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {
		"/Users/loyoladsouza/Desktop/QA/SeleniumWorkspace/CucumberPOM/src/main/java/com/qa/features/freecrm.feature" }, glue = {
				"com/qa/stepDefinitions" }, plugin = { "pretty", "html:html-output/cucumber.html",
						"json:json_output/cucumber.json",
						"junit:junit_xml/cucumber.xml" }, dryRun = false, monochrome = true
// tags = "@SmokeTest or @RegressionTest or @End2End"
)

public class TestRunner {

}
