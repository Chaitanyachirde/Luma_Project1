package luma_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Luma_PromotionPageHomePOM 
{
	WebDriver driver;
	public Luma_PromotionPageHomePOM(WebDriver idriver)
	{
		driver = idriver;
		PageFactory.initElements(driver, this);
	}
	//Repository WebElements
	//Promotion page 1 
	@FindBy (partialLinkText="Luma pants when you shop today*")WebElement pantsoffer;
	@FindBy (xpath="/html[1]/body[1]/div[2]/main[1]/div[3]/div[1]/div[3]/ol[1]/li[1]/div[1]/a[1]/span[1]/span[1]/img[1]")WebElement product;
	@FindBy (id="option-label-size-143-item-171")WebElement size;
	@FindBy (xpath="//div[@option-label=\"Green\"]")WebElement colour;
	@FindBy (id="qty")WebElement qty;
	@FindBy (xpath="//button[@title=\"Add to Cart\"]")WebElement cart;
	@FindBy (xpath ="//a[@class=\"logo\"]")WebElement home;

	//Promotion page2
	@FindBy (partialLinkText="Wicking to raingear, Luma covers you")WebElement shopperform;
	@FindBy (xpath="/html[1]/body[1]/div[2]/main[1]/div[3]/div[1]/div[3]/ol[1]/li[9]/div[1]/a[1]/span[1]/span[1]/img[1]")WebElement yogapant;
	@FindBy (id="option-label-size-143-item-168")WebElement size1;
	@FindBy (id="option-label-color-93-item-57")WebElement colour1;
	@FindBy (id ="qty")WebElement qty1;
	@FindBy (xpath="//button[@title=\"Add to Cart\"]")WebElement cart1;
	@FindBy (xpath ="//a[@class=\"logo\"]")WebElement home1;
	
	
	public void promotionpage() throws InterruptedException
	{
		Thread.sleep(2000);
		pantsoffer.click();
	}
	
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
	}
	public void addtoCart() throws InterruptedException
	{
		Thread.sleep(2000);
		cart.click();
	}
	public void home() throws InterruptedException
	{
		Thread.sleep(1000);
		home.click();
	}
	public void promotionpage1() throws InterruptedException
	{
		Thread.sleep(2000);
		shopperform.click();
	}
	
	public void selectproduct1() throws InterruptedException
	{
		Thread.sleep(4000);
		yogapant.click();
	}
	public void productsize1() throws InterruptedException
	{
		Thread.sleep(2000);
		size1.click();
	}
	public void productcolour1() throws InterruptedException
	{
		Thread.sleep(2000);
		colour1.click();
	}
	public void selectquantity1(String s) throws InterruptedException
	{
		Thread.sleep(2000);
		qty1.clear();
		Thread.sleep(1500);
		qty1.sendKeys(s);
	}
	public void addtoCart1() throws InterruptedException
	{
		Thread.sleep(2000);
		cart1.click();
	}
	public void home1() throws InterruptedException
	{
		Thread.sleep(1000);
		home1.click();
	}
	

}
