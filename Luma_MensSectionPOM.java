package luma_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Luma_MensSectionPOM 
{
	WebDriver driver;
	public Luma_MensSectionPOM(WebDriver idriver)
	{
		driver=idriver;
		PageFactory.initElements(driver, this);
	}
	//Repository WebElements
	@FindBy (id="ui-id-5")WebElement navlink;
	@FindBy (partialLinkText="Bottoms")WebElement bottom;
	@FindBy (xpath="//div[normalize-space()='Climate']")WebElement menu;
	@FindBy (partialLinkText="Rainy")WebElement rainy;
	@FindBy (partialLinkText="Aether Gym Pant")WebElement pant;
	@FindBy (id="option-label-size-143-item-177")WebElement size;
	@FindBy (id="option-label-color-93-item-51")WebElement colour;
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
		Thread.sleep(2000);
		bottom.click();
	}
	
	public void selectsubcategory() throws InterruptedException
	{
		Thread.sleep(2000);
		menu.click();
	}
	
	public void selectproduct() throws InterruptedException
	{
		Thread.sleep(2000);
		rainy.click();
	}
	
	public void selecttype() throws InterruptedException
	{
		Thread.sleep(2000);
		pant.click();
	}
	
	public void selectsize() throws InterruptedException
	{
		Thread.sleep(2000);
		size.click();
	}
	public void selectcolour() throws InterruptedException
	{
		Thread.sleep(2000);
		colour.click();
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
