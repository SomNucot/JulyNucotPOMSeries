package nucotjulypomseries.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import nucotjulypomseries.util.ElementUtil;

public class HomePage {

	
	private WebDriver odriver;
	private ElementUtil eleUtil;
	//1.private By locators
	 By admin=By.xpath("//span[text()='Admin']");
	 By username=By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
	
	
	
	//2.page constant or cons
	public HomePage(WebDriver odriver) {
		this.odriver=odriver;
		eleUtil=new ElementUtil(odriver);
	}
	
	
	
	//3.page actions/methods
	
	public String getHomePageTitle(){	
		//String title=odriver.getTitle();
		String title=eleUtil.waitForTitleContainsAndFetch(10,"OrangeHRM");
		System.out.println(title);
		return title;	
	}
		
		
	public String getHomePageURL(){	
		//String url=odriver.getCurrentUrl();
		String url=eleUtil.waitForURLContainsAndFetch(10, "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
		System.out.println(url);
		return url;	
	}
	
	
	
	public void systemUserDetails()
	{
		
		//odriver.findElement(admin).click();
		//odriver.findElement(username).sendKeys("Nucot");
		eleUtil.waitForElementVisible(admin, 10).isDisplayed();
		eleUtil.doClick(admin);
		eleUtil.waitForElementVisible(admin, 10).isDisplayed();
		eleUtil.doSendKeys(username, "Nucot");
	}
	
	
	
	
	

}
