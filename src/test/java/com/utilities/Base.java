package com.utilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Base {
	
public static AndroidDriver<MobileElement> driver;

	public static AndroidDriver<MobileElement> getDriver() throws MalformedURLException, InterruptedException {

	DesiredCapabilities cap = new DesiredCapabilities();
		
		
		cap.setCapability("deviceName", "redmi");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "8.1.0");
		cap.setCapability("appPackage", "in.amazon.mShop.android.shopping");
		cap.setCapability("appActivity", "com.amazon.mShop.home.HomeActivity");
		 driver = new AndroidDriver<MobileElement>(new URL("http://localhost:4723/wd/hub"),cap);
			
		 return driver;
		
		
		
		
		
	}
	
	public static void btnClick(MobileElement element) {
		element.click();

	}
	
	public static void implicitlywait() {
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	private void threadsleep() throws InterruptedException {
	Thread.sleep(5000);
	}
	
}
