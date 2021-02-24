package com.stepdefenition;

import java.net.MalformedURLException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.utilities.Base;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks  extends Base {

	@Before
	public void beforeScenario() throws MalformedURLException, InterruptedException {
		
		driver = getDriver();
		
	}
	
	@After
public void afterScenario(Scenario sc) {

		TakesScreenshot tk = (TakesScreenshot)driver;
byte[] b = tk.getScreenshotAs(OutputType.BYTES);
	sc.embed(b,"img/png");
	
	
	}





}
