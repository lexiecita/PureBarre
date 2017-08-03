package com.purebarre.www.datatests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.purebarre.www.dataaction.FooterNavigationActions;
import com.purebarre.www.dataaction.HeaderNavigationActions;
import com.purebarre.www.driver.Manager;
import com.purebarre.www.objects.FooterObjects;

public class NavigationTests {

	private String ResultantURL, SubscribeNewsletterText, URLcheck;
	private HeaderNavigationActions na;
	private FooterNavigationActions fna;

	@Parameters({ "browser" })
	@Test
	public void clickHeaderLink_LocationsHeaderLink() throws IOException {
		na = new HeaderNavigationActions();
		na.clickLocations();
		ResultantURL = Manager.getDriver().getCurrentUrl();
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
		ResultantURL = Manager.getDriver().getCurrentUrl();
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
		ResultantURL = Manager.getDriver().getCurrentUrl();
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
		ResultantURL = Manager.getDriver().getCurrentUrl();
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
		ResultantURL = Manager.getDriver().getCurrentUrl();
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
		ResultantURL = Manager.getDriver().getCurrentUrl();
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
		ResultantURL = Manager.getDriver().getCurrentUrl();
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
		ResultantURL = Manager.getDriver().getCurrentUrl();
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
		ResultantURL = Manager.getDriver().getCurrentUrl();
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
		ResultantURL = Manager.getDriver().getCurrentUrl();
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
		ResultantURL = Manager.getDriver().getCurrentUrl();
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
		ResultantURL = Manager.getDriver().getCurrentUrl();
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
		ResultantURL = Manager.getDriver().getCurrentUrl();
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
		ResultantURL = Manager.getDriver().getCurrentUrl();
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
		ResultantURL = Manager.getDriver().getCurrentUrl();
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
		ResultantURL = Manager.getDriver().getCurrentUrl();
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
		ResultantURL = Manager.getDriver().getCurrentUrl();
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
		ResultantURL = Manager.getDriver().getCurrentUrl();
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
		ResultantURL = Manager.getDriver().getCurrentUrl();
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
		ResultantURL = Manager.getDriver().getCurrentUrl();
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
		ResultantURL = Manager.getDriver().getCurrentUrl();
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
		URLcheck = FooterObjects.icon_Facebook().getAttribute("href");
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
		URLcheck = FooterObjects.icon_Twitter().getAttribute("href");
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
		URLcheck = FooterObjects.icon_Instagram().getAttribute("href");
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
	@Test(groups = { "retest" })
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
	public void clickFooterLink_PressImage() throws IOException {
		fna = new FooterNavigationActions();
		fna.clickFooterLink_PressImage();
		ResultantURL = Manager.getDriver().getCurrentUrl();
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
		ResultantURL = Manager.getDriver().getCurrentUrl();
		if (ResultantURL.contains("privacy-policy")) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}
}
