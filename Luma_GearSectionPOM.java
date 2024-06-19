package luma_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Luma_GearSectionPOM 
{
	WebDriver driver;
	public Luma_GearSectionPOM(WebDriver idriver)
	{
		driver=idriver;
		PageFactory.initElements(driver, this);
	}
	//Repository WebElements
	@FindBy (id="ui-id-6")WebElement navlink;
	@FindBy (xpath="//ol[@class='items']//a[normalize-space()='Fitness Equipment']")WebElement fitnessequip;
	@FindBy (xpath="//img[@alt='Quest Lumaflex™ Band']")WebElement menu;
	@FindBy (id="qty")WebElement qty;
	@FindBy (xpath="//button[@title=\"Add to Cart\"]")WebElement btncart;
	@FindBy (xpath="//a[@class=\"logo\"]")WebElement home;

	public void navigationlink() throws InterruptedException
	{
		Thread.sleep(2000);
		navlink.click();
	}
	
	public void selectcategory() throws InterruptedException
	{
		Thread.sleep(3000);
		fitnessequip.click();
	}
	public void selectsubcategory() throws InterruptedException
	{
		Thread.sleep(4000);
		menu.click();
	}
	
	public void selectqty(String q) throws InterruptedException
	{
		Thread.sleep(2000);
		qty.clear();
		qty.sendKeys(q);
	}
	public void addtocart() throws InterruptedException 
	{
		Thread.sleep(2000);
		btncart.click();
		home.click();
	}
}
