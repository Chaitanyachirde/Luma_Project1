package luma_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Luma_TrainingSsctionPOM 
{
	WebDriver driver;
	public Luma_TrainingSsctionPOM(WebDriver idriver)
	{
		driver=idriver;
		PageFactory.initElements(driver, this);
	}
	//Repository WebElements
	@FindBy (id="ui-id-7")WebElement navlink;
	@FindBy (partialLinkText="Video Download")WebElement video;
	@FindBy (xpath="//a[@title=\"Go to Home Page\"]")WebElement home;
	
	public void navigationlink() throws InterruptedException
	{
		Thread.sleep(2000);
		navlink.click();
	}
	
	public void selectcategory() throws InterruptedException
	{
		Thread.sleep(2000);
		video.click();
	}
	
	public void homepageredirect() throws InterruptedException
	{
		Thread.sleep(1500);
		home.click();
	}
}
