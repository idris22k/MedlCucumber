package com.pages;



import org.openqa.selenium.support.PageFactory;

import com.utilities.Base;


import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LoginPage extends Base {
		public LoginPage() {
			PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		}

	
	
	
	public MobileElement getEnglishBtn() {
		return englishBtn;
	}


	public MobileElement getSkipBtn() {
		return skipBtn;
	}


	public MobileElement getActionBar() {
		return actionBar;
	}


	public MobileElement getYourAccount() {
		return yourAccount;
	}


	@AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Continue in English\"]")
	private MobileElement englishBtn;
	

	@AndroidFindBy(id = "in.amazon.mShop.android.shopping:id/skip_sign_in_button")
	private MobileElement skipBtn;

	@AndroidFindBy(id = "in.amazon.mShop.android.shopping:id/chrome_action_bar_burger_icon")
	private MobileElement actionBar;

	
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.ViewAnimator/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View[1]/android.view.View[1]")
	private MobileElement yourAccount;

	
	

}
