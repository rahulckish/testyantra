package pageobjactmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.autodesk.genericlib.WebDriverUtiles;
/**
 * 
 * @author RAHULC
 *
 */


public class Home  extends WebDriverUtiles{
	WebDriver driver;
	
	public Home(WebDriver driver) {     
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//img[contains(@src,'user.PNG')]")
	private WebElement adminstrationImg;

	@FindBy(linkText = "Sign Out")
	private WebElement signOutLnk;


	public WebElement getProductlnk() {
		return productlnk;
	}

	@FindBy(linkText = "Contacts")
	private WebElement contactLnk;

	@FindBy(linkText = "Organizations")
	private WebElement orgLnk;

	@FindBy(linkText = "Leads")
	private WebElement leadsLnk;

	@FindBy(linkText = "Products")
	private WebElement productlnk;

	@FindBy(xpath = "//a[.='More']" )
	private WebElement morelink;
	

	@FindBy(xpath = "//a[@name='Quotes']" )
	private WebElement quotelink;
	
	@FindBy(xpath = "//a[@name='Purchase Order']" )
	private WebElement purchaselink;

	public WebElement getPurchaselink() {
		return purchaselink;
	}

	@FindBy(xpath = "//a[@name='Vendors']" )
	private WebElement vendorlink;
	

	public WebElement getVendorlink() {
		return vendorlink;
	}

	public WebElement getQuotelink() {
		return quotelink;
	}

	public WebElement getContactLnk() {
		return contactLnk;
	}

	public WebElement getOrgLnk() {
		return orgLnk;
	}

	public WebElement getLeadsLnk() {
		return leadsLnk;
	}


	public WebElement getMorelink() {
		return morelink;
	}

	
	public void logout() {
		moveToExpectedElemnet(driver, adminstrationImg);
		signOutLnk.click();
	}


}
