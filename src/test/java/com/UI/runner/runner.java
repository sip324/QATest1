package com.UI.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources"
		,glue={"src/test/java"}
		,tags= "@Smoke"
		,dryRun = false
		)

public class runner {


}
