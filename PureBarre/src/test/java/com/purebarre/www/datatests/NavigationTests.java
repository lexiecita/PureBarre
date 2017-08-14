package com.purebarre.www.datatests;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.purebarre.www.dataaction.FooterNavigationActions;
import com.purebarre.www.dataaction.HeaderNavigationActions;
import com.purebarre.www.driver.Manager;
import com.purebarre.www.objects.FooterObjects;

public class NavigationTests {

	private String ResultantURL, ExpectedURL, URLcheck, ActionCheck, BlogSubmitText;
	WebElement BlogText;
	WebElement ExpectedText;
	private HeaderNavigationActions na;
	private FooterNavigationActions fna;
	ExtentReports report;
	ExtentTest test;

	@Parameters({ "browser" })
	@Test
	public void clickHeaderLink_LocationsHeaderLink() throws IOException {
		report = new ExtentReports();
		na = new HeaderNavigationActions();
		na.clickLocations();
		ExpectedURL = "locations";
		resultantURL();
	}

	@Parameters({ "browser" })
	@Test
	public void clickHeaderLink_NewToPureBarre() throws IOException {
		na = new HeaderNavigationActions();
		na.hoverclickNewToPureBarre();
		ExpectedURL = "all-about-the-barre";
		resultantURL();
	}

	@Parameters({ "browser" })
	@Test
	public void clickHeaderLink_AboutOurTechnique() throws IOException {
		na = new HeaderNavigationActions();
		na.hoverclickAboutOurTechnique();
		ExpectedURL = "technique";
		resultantURL();
	}

	@Parameters({ "browser" })
	@Test
	public void clickHeaderLink_PureFoundations() throws IOException {
		na = new HeaderNavigationActions();
		na.hoverclickPureFoundations();
		ExpectedURL = "new-class";
		resultantURL();
	}

	@Parameters({ "browser" })
	@Test
	public void clickHeaderLink_SpecialtyClasses() throws IOException {
		na = new HeaderNavigationActions();
		na.hoverclickSpecialityClasses();
		ExpectedURL = "specialty-classes";
		resultantURL();
	}

	@Parameters({ "browser" })
	@Test
	public void clickHeaderLink_Story() throws IOException {
		na = new HeaderNavigationActions();
		na.clickStory();
		ExpectedURL = "story";
		resultantURL();
	}

	@Parameters({ "browser" })
	@Test
	public void clickHeaderLink_Shop() throws IOException {
		na = new HeaderNavigationActions();
		na.clickShop();
		ExpectedURL = "shop";
		resultantURL();
	}

	@Parameters({ "browser" })
	@Test
	public void clickHeaderLink_Blog() throws IOException {
		na = new HeaderNavigationActions();
		na.clickBlog();
		ExpectedURL = "blog";
		resultantURL();
	}

	@Parameters({ "browser" })
	@Test
	public void clickHeaderLink_OwnAStudio() throws IOException {
		na = new HeaderNavigationActions();
		na.clickOwnAStudio();
		ExpectedURL = "franchise";
		resultantURL();
	}

	@Parameters({ "browser" })
	@Test
	public void clickFooterLink_OrderInformation() throws IOException {
		fna = new FooterNavigationActions();
		fna.clickFooterLink_OrderInformation();
		ExpectedURL = "order-info";
		resultantURL();
	}

	@Parameters({ "browser" })
	@Test
	public void clickFooterLink_ReturnsAndExchanges() throws IOException {
		fna = new FooterNavigationActions();
		fna.clickFooterLink_ReturnsAndExchanges();
		ExpectedURL = "return-policy";
		resultantURL();
	}

	@Parameters({ "browser" })
	@Test
	public void clickFooterLink_ShippingInformation() throws IOException {
		fna = new FooterNavigationActions();
		fna.clickFooterLink_ShippingInformation();
		ExpectedURL = "shipping-information";
		resultantURL();
	}

	@Parameters({ "browser" })
	@Test
	public void clickFooterLink_StreamingContentFAQ() throws IOException {
		fna = new FooterNavigationActions();
		fna.clickFooterLink_StreamingContentFAQ();
		ExpectedURL = "streaming-faq";
		resultantURL();
	}

	@Parameters({ "browser" })
	@Test
	public void clickFooterLink_GiftCards() throws IOException {
		fna = new FooterNavigationActions();
		fna.clickFooterLink_GiftCards();
		ExpectedURL = "gift-cards";
		resultantURL();
	}

	@Parameters({ "browser" })
	@Test
	public void clickFooterLink_StudioOwnersShop() throws IOException {
		fna = new FooterNavigationActions();
		fna.clickFooterLink_StudioOwnersShop();
		ExpectedURL = "shop/franchisee";
		resultantURL();
	}

	@Parameters({ "browser" })
	@Test
	public void clickFooterLink_OwnerAndTeachersPortal() throws IOException {
		fna = new FooterNavigationActions();
		fna.clickFooterLink_OwnerAndTeachersPortal();
		ExpectedURL = "schoox.com";
		resultantURL();
	}

	@Parameters({ "browser" })
	@Test
	public void clickFooterLink_Team() throws IOException {
		fna = new FooterNavigationActions();
		fna.clickFooterLink_Team();
		ExpectedURL = "team";
		resultantURL();
	}

	@Parameters({ "browser" })
	@Test
	public void clickFooterLink_Careers() throws IOException {
		fna = new FooterNavigationActions();
		fna.clickFooterLink_Careers();
		ExpectedURL = "careers";
		resultantURL();
	}

	@Parameters({ "browser" })
	@Test
	public void clickFooterLink_ContactUs() throws IOException {
		fna = new FooterNavigationActions();
		fna.clickFooterLink_ContactUs();
		ExpectedURL = "contact";
		resultantURL();
	}

	@Parameters({ "browser" })
	@Test
	public void clickFooterLink_Press() throws IOException {
		fna = new FooterNavigationActions();
		fna.clickFooterLink_Press();
		ExpectedURL = "press";
		resultantURL();
	}

	@Parameters({ "browser" })
	@Test(groups = { "subscribenewsletter" })
	public void clickFooterLink_SubscribeNewsletter_Text() throws IOException {
		fna = new FooterNavigationActions();
		fna.clickGetText_SubscribeNewsletter();
		if (FooterObjects.field_SubscribeNewsletter().isDisplayed()) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}

	@Parameters({ "browser" })
	@Test(groups = { "subscribenewsletter" })
	public void clickFooterLink_SubscribeNewsletter_Submit() throws IOException {
		fna = new FooterNavigationActions();
		fna.click_SubscribeNewsletter_Submit();
		ActionCheck = FooterObjects.form_GetId_SubscribeNewsletter().getAttribute("action");
		if (ActionCheck.contains("audience/signup")) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}

	@Parameters({ "browser" })
	@Test(groups = { "blog" })
	public void clickFooterLink_SubscribeBlog() throws IOException {
		fna = new FooterNavigationActions();
		fna.clickGetText_SubscribeBlog();
		if (FooterObjects.text_SubscribeBlog().isDisplayed()) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}

	@Parameters({ "browser" })
	@Test(groups = { "blog" })
	public void clickFooterLink_SubscribeBlog_Submit() throws IOException {
		fna = new FooterNavigationActions();
		fna.click_SubscribeBlog_Submit();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (FooterObjects.text_FollowingSubmit_SubscribeBlog().isDisplayed()) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}

	@Parameters({ "browser" })
	@Test
	public void clickFooterLink_Facebook() throws IOException {
		fna = new FooterNavigationActions();
		fna.clickFooterLink_Facebook();
		URLcheck = FooterObjects.icon_Facebook().getAttribute("href");
		if (URLcheck.contains("https://www.facebook.com/PureBarre")) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}

	@Parameters({ "browser" })
	@Test
	public void clickFooterLink_Twitter() throws IOException {
		fna = new FooterNavigationActions();
		fna.clickFooterLink_Twitter();
		URLcheck = FooterObjects.icon_Twitter().getAttribute("href");
		if (URLcheck.contains("https://twitter.com/Pure_Barre")) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}

	@Parameters({ "browser" })
	@Test
	public void clickFooterLink_Instagram() throws IOException {
		fna = new FooterNavigationActions();
		fna.clickFooterLink_Instagram();
		URLcheck = FooterObjects.icon_Instagram().getAttribute("href");
		if (URLcheck.contains("http://instagram.com/pure_barre")) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}

	@Parameters({ "browser" })
	@Test
	public void clickFooterLink_Pinterest() throws IOException {
		fna = new FooterNavigationActions();
		fna.clickFooterLink_Pinterest();
		URLcheck = FooterObjects.icon_Pinterest().getAttribute("href");
		if (URLcheck.contains("https://www.pinterest.com/purebarre/")) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}

	@Parameters({ "browser" })
	@Test
	public void clickFooterLink_Linkedin() throws IOException {
		fna = new FooterNavigationActions();
		fna.clickFooterLink_Linkedin();
		URLcheck = FooterObjects.icon_Linkedin().getAttribute("href");
		if (URLcheck.contains("https://www.linkedin.com/company/pure-barre")) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}

	@Parameters({ "browser" })
	@Test
	public void clickFooterLink_YouTube() throws IOException {
		fna = new FooterNavigationActions();
		fna.clickFooterLink_YouTube();
		URLcheck = FooterObjects.icon_YouTube().getAttribute("href");
		if (URLcheck.contains("https://www.youtube.com/user/PureBarreCompany")) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}

	@Parameters({ "browser" })
	@Test
	public void clickFooterLink_DownloadForApple() throws IOException {
		fna = new FooterNavigationActions();
		fna.clickFooterLink_DownloadForApple();
		URLcheck = FooterObjects.button_DownloadApple().getAttribute("href");
		if (URLcheck.contains("https://itunes.apple.com/us/app/pure-barre/id723157189?mt=8")) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}

	@Parameters({ "browser" })
	@Test
	public void clickFooterLink_DownloadForGoogle() throws IOException {
		fna = new FooterNavigationActions();
		fna.clickFooterLink_DownloadForGoogle();
		URLcheck = FooterObjects.button_DownloadGoogle().getAttribute("href");
		if (URLcheck.contains("https://play.google.com/store/apps/details?id=com.fitnessmobileapps.purebarre")) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}

	@Parameters({ "browser" })
	@Test
	public void clickFooterLink_PressImage() throws IOException {
		fna = new FooterNavigationActions();
		fna.clickFooterLink_PressImage();
		ExpectedURL = "story/press/";
		resultantURL();
	}

	@Parameters({ "browser" })
	@Test
	public void clickFooterLink_PrivacyPolicy() throws IOException {
		fna = new FooterNavigationActions();
		fna.clickFooterLink_PrivacyPolicy();
		ExpectedURL = "privacy-policy";
		resultantURL();
	}
	
	private void resultantURL() {
		ResultantURL = Manager.getDriver().getCurrentUrl();
		if (ResultantURL.contains(ExpectedURL)) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}
}
