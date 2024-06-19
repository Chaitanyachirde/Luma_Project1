package luma_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Luma_AddToCartPOM 
{
	WebDriver driver;
	public Luma_AddToCartPOM(WebDriver idriver)
	{
		driver=idriver;
		PageFactory.initElements(driver, this);	
	}
	//Repository WebElement
	@FindBy (xpath ="//img[@alt=\"Argus All-Weather Tank\"]")WebElement product;
	@FindBy (partialLinkText ="L")WebElement size;
	@FindBy (id ="option-label-color-93-item-52")WebElement colour;
	@FindBy (id ="qty")WebElement qty;
	@FindBy (partialLinkText ="Add to Cart")WebElement cart;
	@FindBy (xpath ="//a[@class=\"logo\"]")WebElement home;
	
	public void selectproduct() throws InterruptedException
	{
		Thread.sleep(2000);
		product.click();
	}
	public void productsize() throws InterruptedException
	{
		Thread.sleep(2000);
		size.click();
	}
	public void productcolour() throws InterruptedException
	{
		Thread.sleep(2000);
		colour.click();
	}
	public void selectquantity(String q) throws InterruptedException
	{
		Thread.sleep(2000);
		qty.clear();
		Thread.sleep(1500);
		qty.sendKeys(q);
		home.click();
	}
	public void addtoCart() throws InterruptedException
	{
		Thread.sleep(2000);
		cart.click();
		Thread.sleep(1500);
		
	}
	public void home() throws InterruptedException
	{
		Thread.sleep(1000);
		home.click();
	}

}
