package luma_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Luma_WomensSectionPOM 
{
	WebDriver driver;
	public Luma_WomensSectionPOM(WebDriver idriver)
	{
		driver=idriver;
		PageFactory.initElements(driver, this);
	}
	//Repository WebElements
	@FindBy (id="ui-id-4")WebElement navlink;
	@FindBy (partialLinkText="Tops")WebElement top;
	@FindBy (xpath="/html[1]/body[1]/div[2]/main[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]")WebElement menu;
	@FindBy (partialLinkText="Jacket")WebElement jacket;
	@FindBy (partialLinkText="Neve Studio Dance Jacket")WebElement selectjac;
	@FindBy (xpath="//div[@option-label=\"M\"]")WebElement size;
	@FindBy (xpath="//div[@option-label=\"Orange\"]")WebElement colour;
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
		top.click();
	}
	public void selectsubcategory() throws InterruptedException
	{
		Thread.sleep(2000);
		menu.click();
	}
	public void selectproduct() throws InterruptedException
	{
		Thread.sleep(2000);
		jacket.click();
	}
	public void selecttype() throws InterruptedException
	{
		Thread.sleep(2000);
		selectjac.click();
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
