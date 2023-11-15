package nucotjulypomseries.tests;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import nucotjulypomseries.driversetup.InitialSetUp;
import nucotjulypomseries.pages.HomePage;
import nucotjulypomseries.pages.LoginPage;
import nucotjulypomseries.pages.LoginWithDifferentData;

public class BaseTest {

	InitialSetUp is;
	WebDriver odriver;
	public Properties opro;
	protected LoginPage loginPage;
	protected HomePage homePage;
	protected LoginWithDifferentData loginWithDifferent;
	
	
	//protected ProductList productList;
	@BeforeTest
	public void setup()
	{
	  is=new InitialSetUp();
	  opro= is.initProp();
	  odriver=is.initDriver(opro);
	  loginPage=new LoginPage(odriver);
	  loginWithDifferent=new LoginWithDifferentData(odriver);
	 
	}
	

	@AfterTest
	public void closeApp()
	{
		odriver.quit();
	}
	
	
	
	
	
	
	
	
	
	
}
