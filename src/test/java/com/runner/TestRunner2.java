package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.utilities.JVMReport1;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources", glue = {
		"com.stepdefenition" }, monochrome = true, snippets = SnippetType.CAMELCASE, strict = false, plugin = { "pretty",
				"json:src\\test\\resources\\Report\\cucumber.json" })

public class TestRunner2 {

	@AfterClass
	public static void afterClass() {
//		JVMReport.generateJVMReport(System.getProperty("user.dir") + "\\src\\test\\resources\\Report\\cucumber.json");
System.out.println("ssjdd");
		
JVMReport1.generateJVMReport(System.getProperty("user.dir") + "\\src\\test\\resources\\Report\\cucumber.json");
	}
}
