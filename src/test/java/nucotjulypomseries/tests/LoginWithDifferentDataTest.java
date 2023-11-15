package nucotjulypomseries.tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import nucotjulypomseries.appconstants.ApplicationConstants;
import nucotjulypomseries.util.ExcelUtil;

public class LoginWithDifferentDataTest  extends BaseTest{
	
	
	
	
	@DataProvider
	public void getRegTestData() throws Exception {
		 ExcelUtil.getTestData(ApplicationConstants.LOGINPAGE_TEST_DATA_SHEETNAME);
		
	}

	@Test(dataProvider="getRegTestData")
	public void  doSetupLoginData(String un,String pw)
	{
		
		loginWithDifferent.doLoginPageWithDifferentData(un, pw);
		
	
	}
	
	
	
	

}
