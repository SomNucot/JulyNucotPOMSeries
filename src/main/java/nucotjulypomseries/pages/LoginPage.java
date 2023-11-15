package nucotjulypomseries.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import nucotjulypomseries.util.ElementUtil;

public class LoginPage {
	
	private WebDriver odriver;
	private ElementUtil eleUtil;
	
	//1.private By locators
	
	private By userName=By.xpath("//input[@name='username']");
	private By password=By.xpath("//input[@name='password']");
	private By loginButton=By.xpath("//button[@type='submit']");
	
	
	//2.page constant or cons
		public LoginPage(WebDriver odriver){
			this.odriver=odriver;	
			eleUtil=new ElementUtil(odriver);
		}
	
	
	//3.page actions/methods
		
		
	public String getLoginPageTitle(){	
		//String title=odriver.getTitle();
		String title=eleUtil.waitForTitleContainsAndFetch(10,"OrangeHRM");
		System.out.println(title);
		return title;	
	}
		
		
	public String getLoginPageURL(){	
		//String url=odriver.getCurrentUrl();
		String url=eleUtil.waitForURLContainsAndFetch(10, "/auth/login");
		System.out.println(url);
		return url;	
	}
	
	
	public HomePage doLoginPage(String un,String pw){
		
		//odriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//odriver.findElement(userName).sendKeys(un);
		//odriver.findElement(password).sendKeys(pw);
		//odriver.findElement(loginButton).click();
		eleUtil.waitForElementVisible(userName, 20).isDisplayed();
		eleUtil.doSendKeys(userName, un);
		eleUtil.doSendKeys(password, pw);
		eleUtil.doClick(loginButton);
		return new HomePage(odriver);
		

	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
