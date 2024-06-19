package luma_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Luma_LoginPOM 
{
	WebDriver driver;
	public Luma_LoginPOM(WebDriver idriver)
	{
		driver=idriver;
		PageFactory.initElements(driver, this);
//		this.driver=idriver;
	}
	//repository WebElements
	@FindBy (partialLinkText="Sign In")WebElement signinbtn;
	@FindBy (id ="email")WebElement email;
	@FindBy (id="pass")WebElement password;
	@FindBy (id="send2")WebElement signin;
	//Because of site problem we are unable to get dropdown next to user name on header, so we will click on other module and then try to go home
//	@FindBy (partialLinkText="Sale")WebElement sale;
//	@FindBy (xpath="//a[@aria-label=\"store logo\"]")WebElement home;
	
	public void launchURL()
	{
		
		driver.get("https://magento.softwaretestingboard.com/");
	}
	public void clickSignInbtn() throws InterruptedException
	{
		Thread.sleep(1200);
		signinbtn.click();
	}
	public void enteremail(String em) throws InterruptedException
	{
		Thread.sleep(1000);
		email.sendKeys(em);
	}
	public void enterpassword(String ep) throws InterruptedException
	{
		Thread.sleep(1000);
		password.sendKeys(ep);
	}
	public void clickOnsignin() throws InterruptedException
	{
		Thread.sleep(1000);
		signin.click();
		Thread.sleep(1500);
//		sale.click();
//		home.click();
		
	}

}
