package com.purebarre.www.datatests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.purebarre.www.dataaction.FooterNavigationActions;
import com.purebarre.www.dataaction.HeaderNavigationActions;
import com.purebarre.www.driver.Manager;
import com.purebarre.www.objects.FooterObjects;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class NavigationTests {

	private String ResultantURL, URLcheck;
	private HeaderNavigationActions na;
	private FooterNavigationActions fna;
	ExtentReports report;
	ExtentTest test;

	@Parameters({ "browser" })
	@Test
	public void clickHeaderLink_LocationsHeaderLink() throws IOException {
		report = new ExtentReports("C://Users//alexisnauer//Documents//Automation//navigationtest.html");
		test = report.startTest("Click locations link in header");
		na = new HeaderNavigationActions();
		na.clickLocations();
		if (ResultantURL.contains("/locations")) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}

	@Parameters({ "browser" })
	@Test
	public void clickHeaderLink_NewToPureBarre() throws IOException {
		na = new HeaderNavigationActions();
		na.hoverclickNewToPureBarre();
		if (ResultantURL.contains("/all-about-the-barre")) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}

	@Parameters({ "browser" })
	@Test
	public void clickHeaderLink_AboutOurTechnique() throws IOException {
		na = new HeaderNavigationActions();
		na.hoverclickAboutOurTechnique();
		if (ResultantURL.contains("/technique")) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}

	@Parameters({ "browser" })
	@Test
	public void clickHeaderLink_PureFoundations() throws IOException {
		na = new HeaderNavigationActions();
		na.hoverclickPureFoundations();
		if (ResultantURL.contains("new-class")) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}

	@Parameters({ "browser" })
	@Test
	public void clickHeaderLink_SpecialtyClasses() throws IOException {
		na = new HeaderNavigationActions();
		na.hoverclickSpecialityClasses();
		if (ResultantURL.contains("specialty-classes")) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}

	@Parameters({ "browser" })
	@Test(groups = { "retest" })
	public void clickHeaderLink_Story() throws IOException {
		na = new HeaderNavigationActions();
		na.clickStory();
		if (ResultantURL.contains("story")) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}

	@Parameters({ "browser" })
	@Test(groups = { "retest" })
	public void clickHeaderLink_Shop() throws IOException {
		na = new HeaderNavigationActions();
		na.clickShop();
		if (ResultantURL.contains("shop")) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}

	@Parameters({ "browser" })
	@Test(groups = { "retest" })
	public void clickHeaderLink_Blog() throws IOException {
		na = new HeaderNavigationActions();
		na.clickBlog();
		if (ResultantURL.contains("blog")) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}

	@Parameters({ "browser" })
	@Test(groups = { "retest" })
	public void clickHeaderLink_OwnAStudio() throws IOException {
		na = new HeaderNavigationActions();
		na.clickOwnAStudio();
		if (ResultantURL.contains("franchise")) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}

	@Parameters({ "browser" })
	@Test
	public void clickFooterLink_OrderInformation() throws IOException {
		fna = new FooterNavigationActions();
		fna.clickFooterLink_OrderInformation();
		if (ResultantURL.contains("order-info")) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}

	@Parameters({ "browser" })
	@Test
	public void clickFooterLink_ReturnsAndExchanges() throws IOException {
		fna = new FooterNavigationActions();
		fna.clickFooterLink_OrderInformation();
		if (ResultantURL.contains("return-policy")) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}

	@Parameters({ "browser" })
	@Test
	public void clickFooterLink_ShippingInformation() throws IOException {
		fna = new FooterNavigationActions();
		fna.clickFooterLink_ShippingInformation();
		ResultantURL = Manager.getDriver().getCurrentUrl();
		if (ResultantURL.contains("shipping-information")) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}

	@Parameters({ "browser" })
	@Test
	public void clickFooterLink_StreamingContentFAQ() throws IOException {
		fna = new FooterNavigationActions();
		fna.clickFooterLink_StreamingContentFAQ();
		if (ResultantURL.contains("streaming-faq")) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}

	@Parameters({ "browser" })
	@Test
	public void clickFooterLink_GiftCards() throws IOException {
		fna = new FooterNavigationActions();
		fna.clickFooterLink_GiftCards();
		if (ResultantURL.contains("gift-cards")) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}

	@Parameters({ "browser" })
	@Test
	public void clickFooterLink_StudioOwnersShop() throws IOException {
		fna = new FooterNavigationActions();
		fna.clickFooterLink_StudioOwnersShop();
		if (ResultantURL.contains("shop/franchisee")) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}

	@Parameters({ "browser" })
	@Test
	public void clickFooterLink_OwnerAndTeachersPortal() throws IOException {
		fna = new FooterNavigationActions();
		fna.clickFooterLink_OwnerAndTeachersPortal();
		if (ResultantURL.contains("schoox.com")) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}

	@Parameters({ "browser" })
	@Test
	public void clickFooterLink_Team() throws IOException {
		fna = new FooterNavigationActions();
		fna.clickFooterLink_Team();
		if (ResultantURL.contains("team")) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}

	@Parameters({ "browser" })
	@Test
	public void clickFooterLink_Careers() throws IOException {
		fna = new FooterNavigationActions();
		fna.clickFooterLink_Careers();
		if (ResultantURL.contains("careers")) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}

	@Parameters({ "browser" })
	@Test(groups = { "retest" })
	public void clickFooterLink_ContactUs() throws IOException {
		fna = new FooterNavigationActions();
		fna.clickFooterLink_ContactUs();
		if (ResultantURL.contains("contact")) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}

	@Parameters({ "browser" })
	@Test
	public void clickFooterLink_Press() throws IOException {
		fna = new FooterNavigationActions();
		fna.clickFooterLink_Press();
		if (ResultantURL.contains("press")) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}

	@Parameters({ "browser" })
	@Test
	public void clickFooterLink_SubscribeNewsletter() throws IOException {
		fna = new FooterNavigationActions();
		fna.clickGetText_SubscribeNewsletter();
		if (FooterObjects.text_SubscribeNewsletter().isDisplayed()) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}

	@Parameters({ "browser" })
	@Test
	public void clickFooterLink_SubscribeNewsletter_Submit() throws IOException {
		fna = new FooterNavigationActions();
		fna.click_SubscribeNewsletter_Submit();
		if (ResultantURL.contains("audience/signup/")) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}

	@Parameters({ "browser" })
	@Test
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
	@Test
	public void clickFooterLink_SubscribeBlog_Submit() throws IOException {
		fna = new FooterNavigationActions();
		fna.click_SubscribeBlog_Submit();
		if (ResultantURL.contains("press")) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}

	@Parameters({ "browser" })
	@Test(groups = { "retest" })
	public void clickFooterLink_Facebook() throws IOException {
		fna = new FooterNavigationActions();
		fna.clickFooterLink_Facebook();
		if (URLcheck.contains("https://www.facebook.com/PureBarre")) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}

	@Parameters({ "browser" })
	@Test(groups = { "retest" })
	public void clickFooterLink_Twitter() throws IOException {
		fna = new FooterNavigationActions();
		fna.clickFooterLink_Twitter();
		if (URLcheck.contains("https://twitter.com/Pure_Barre")) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}

	@Parameters({ "browser" })
	@Test(groups = { "retest" })
	public void clickFooterLink_Instagram() throws IOException {
		fna = new FooterNavigationActions();
		fna.clickFooterLink_Instagram();
		if (URLcheck.contains("https://www.instagram.com/pure_barre/")) {
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
		if (URLcheck.contains("https://www.linkedin.com/company/pure-barre")) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}

	@Parameters({ "browser" })
	@Test(groups = { "retest" })
	public void clickFooterLink_YouTube() throws IOException {
		fna = new FooterNavigationActions();
		fna.clickFooterLink_YouTube();
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
		if (URLcheck.contains("https://play.google.com/store/apps/details?id=com.fitnessmobileapps.purebarre")) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}

	@Parameters({ "browser" })
	public void clickFooterLink_PressImage() throws IOException {
		fna = new FooterNavigationActions();
		fna.clickFooterLink_PressImage();
		if (ResultantURL.contains("story/press/")) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}

	@Parameters({ "browser" })
	@Test
	public void clickFooterLink_PrivacyPolicy() throws IOException {
		fna = new FooterNavigationActions();
		fna.clickFooterLink_PrivacyPolicy();
		if (ResultantURL.contains("privacy-policy")) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}
}
