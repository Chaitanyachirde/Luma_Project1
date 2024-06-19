package luma_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Luma_LogoutPOM 
{
	WebDriver driver;
	public Luma_LogoutPOM(WebDriver idriver)
	{
		driver=idriver;
		PageFactory.initElements(driver, this);
//		this.driver=idriver;
	}
	//Repository WebElement
	@FindBy (xpath="//button[@class=\"action switch\"]")WebElement dropdown;
	@FindBy (partialLinkText="Sign Out")WebElement logout;
	
	public void dropdown() throws InterruptedException
	{
		Thread.sleep(1500);
		dropdown.click();
	}
	public void logout() throws InterruptedException
	{
		Thread.sleep(1000);
		logout.click();
	}
	public void closebrowser()
	{
		driver.quit();
	}

}
