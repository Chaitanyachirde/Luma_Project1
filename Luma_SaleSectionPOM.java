package luma_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Luma_SaleSectionPOM 
{
	WebDriver driver;
	public Luma_SaleSectionPOM(WebDriver idriver)
	{
		driver=idriver;
		PageFactory.initElements(driver, this);
	}
	//Repository WebElements
	@FindBy (id="ui-id-8")WebElement navlink;
	@FindBy (xpath="//a[contains(text(),'Fitness Equipment')]")WebElement equipment;
	@FindBy (xpath="//a[@class='product photo product-item-photo']//img[@alt='Sprite Yoga Companion Kit']")WebElement yoga;
	@FindBy (xpath = "//span[normalize-space()='Customize and Add to Cart']")WebElement custom;
	@FindBy (id="qty")WebElement qty;
	@FindBy (xpath="//button[@title=\"Add to Cart\"]")WebElement btncart;
	@FindBy (xpath="//a[contains(text(),'Fitness Equipment')]")WebElement back;
	//@FindBy (xpath="//a[@class=\"logo\"]")WebElement home;
	
	public void navigationlink() throws InterruptedException
	{
		Thread.sleep(2000);
		navlink.click();
	}
	
	public void selectcategory() throws InterruptedException
	{
		Thread.sleep(2000);
		equipment.click();
	}
	
	public void selectsubcategory() throws InterruptedException
	{
		Thread.sleep(4000);
		yoga.click();
		custom.click();
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
		Thread.sleep(3000);
		back.click();
		
	}
}
