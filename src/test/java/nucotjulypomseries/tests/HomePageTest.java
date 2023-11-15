package nucotjulypomseries.tests;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import nucotjulypomseries.appconstants.ApplicationConstants;

public class HomePageTest extends BaseTest {
	
	
	@BeforeClass
	public void homePageSetUp()
	{
		homePage=loginPage.doLoginPage(opro.getProperty("username").trim(),opro.getProperty("password").trim());
		
	}
	
	
	@Test(priority=1)
	public void homePageUrlTest()
	{
		String actualHomePageUrl=homePage.getHomePageURL();
		Assert.assertEquals(actualHomePageUrl,ApplicationConstants.HOMEPAGE_URL_VALUE);
		
	}
	
	
	@Test(priority=2)
	public void homePageTitleTest()
	{
		String actualHomePageTitle=homePage.getHomePageTitle();
		Assert.assertEquals(actualHomePageTitle,ApplicationConstants.HOMEPAGE_TITLE_VALUE );
	}
	
	
	
	@Test(priority=3)
	public void systemUserDetailsTest()
	{
		homePage.systemUserDetails();
	}
	
		
	
	@AfterClass
	public void closeApp()
	{
		odriver.quit();
		
	}
	

}
