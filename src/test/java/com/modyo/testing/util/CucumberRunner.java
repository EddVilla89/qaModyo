package com.modyo.testing.util;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/java/com/modyo/testing/features"},
		plugin = {"pretty", "html:target/cucumber-html-report"},
		glue={"com.modyo.testing.definitions"},
		tags = {"@prueba"},
		monochrome = true)
public class CucumberRunner {

}
