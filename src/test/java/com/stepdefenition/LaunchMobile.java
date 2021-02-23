package com.stepdefenition;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import com.pages.LoginPage;

import com.utilities.Base;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class LaunchMobile extends Base {
AndroidDriver<MobileElement> driver;
LoginPage  l;
	
	@Given("userbshould launch the mobile application")
	public void userbshould_launch_the_mobile_application() throws MalformedURLException, InterruptedException {
		
		getDriver();
		l = new LoginPage();
		Thread.sleep(5000);
		MobileElement englishBtn = l.getEnglishBtn();
		
	
		englishBtn.click();
		

	}

	@When("user should search products")
	public void user_should_search_products() {
	}

	@When("user should select toggle button")
	public void user_should_select_toggle_button() {
	}

	@When("user  should select your account")
	public void user_should_select_your_account() {
	}

	@Then("user with login username and password")
	public void user_with_login_username_and_password() {
	}

	
	
}
