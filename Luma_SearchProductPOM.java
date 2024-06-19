package luma_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Luma_SearchProductPOM 
{
	WebDriver driver;
	public Luma_SearchProductPOM(WebDriver idriver)
	{
		driver=idriver;
		PageFactory.initElements(driver, this);
	}
	//Repository WebElement
	@FindBy (id="search")WebElement search;
	@FindBy (xpath="//a[@class='product photo product-item-photo']//img[@alt='Aether Gym Pant ']")WebElement product;
	@FindBy (id="option-label-size-143-item-177")WebElement size;
	@FindBy (id="option-label-color-93-item-53")WebElement colour;
	@FindBy (id="qty")WebElement qty;
	@FindBy (xpath="//button[@title=\"Add to Cart\"]")WebElement btncart;
	@FindBy (xpath="//a[@class=\"logo\"]")WebElement home;
	
	public void searchproduct(String sr) throws InterruptedException 
	{
		Thread.sleep(2000);
		search.sendKeys(sr);
		search.submit();
	}
	public void searchedproduct() throws InterruptedException 
	{
		Thread.sleep(4000);
		product.click();
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
	public void selectqty(String n) throws InterruptedException 
	{
		Thread.sleep(2000);
		qty.clear();
		qty.sendKeys(n);
	}
	public void addtocart() throws InterruptedException 
	{
		Thread.sleep(2000);
		btncart.click();
		home.click();
	}

}
