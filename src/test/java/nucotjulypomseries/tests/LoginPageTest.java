package nucotjulypomseries.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import nucotjulypomseries.appconstants.ApplicationConstants;

public class LoginPageTest extends BaseTest{
	

	@Test(priority=1)
	public void loginPageUrlTest(){
		String actualUrl=loginPage.getLoginPageURL();
		Assert.assertEquals(actualUrl,ApplicationConstants.LOGINPAGE_URL_VALUE );
		
	}
	
	@Test(priority=2)
	public void loginPageTitleTest()
	{
		String actualTitle=loginPage.getLoginPageTitle();
		Assert.assertEquals(actualTitle, ApplicationConstants.LOGINPAGE_TITLE_VALUE);
		
	}
		
	@Test(priority=3)
	public void loginTest(){
		loginPage.doLoginPage(opro.getProperty("username").trim(),opro.getProperty("password").trim());
	
		
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
