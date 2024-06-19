package luma_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Luma_CartSectionPOM 
{
	WebDriver driver;
	public Luma_CartSectionPOM(WebDriver idriver)
	{
		driver=idriver;
		PageFactory.initElements(driver, this);
	}
	//Repository WebElements
	@FindBy (xpath="//a[@class=\"action showcart\"]")WebElement carticon;
	@FindBy (xpath="//span[@data-bind=\"i18n: 'View and Edit Cart'\"]")WebElement viewcart;
	@FindBy (xpath="/html[1]/body[1]/div[2]/main[1]/div[3]/div[1]/div[2]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/div[1]/label[1]/input[1]")WebElement cartqty;
	@FindBy (xpath="/html[1]/body[1]/div[2]/main[1]/div[3]/div[1]/div[2]/form[1]/div[1]/table[1]/tbody[2]/tr[1]/td[3]/div[1]/div[1]/label[1]/input[1]")WebElement cartqty1;
	@FindBy (xpath="/html[1]/body[1]/div[2]/main[1]/div[3]/div[1]/div[2]/form[1]/div[1]/table[1]/tbody[7]/tr[1]/td[3]/div[1]/div[1]/label[1]/input[1]")WebElement cartqty2;
	//@FindBy (xpath="//tbody[1]/tr[2]/td[1]/div[1]/a[1]/span[1]")WebElement wishlist;
	@FindBy (xpath="//button[@title=\"Update Shopping Cart\"]")WebElement updatelist;
	@FindBy (xpath="//a[@aria-label='store logo']//img")WebElement home;
	
	public void addtocart() throws InterruptedException
	{
		Thread.sleep(1500);
		carticon.click();
	}
	
	public void viewcart() throws InterruptedException
	{
		Thread.sleep(1500);
		viewcart.click();
	}
	public void selectproductqty(String q) throws InterruptedException
	{
		Thread.sleep(2000);
		cartqty.clear();
		cartqty.sendKeys(q);
	}
	public void selectproductqty1(String s) throws InterruptedException
	{
		Thread.sleep(2000);
		cartqty1.clear();
		cartqty1.sendKeys(s);
	}
	public void selectproductqty2(String r) throws InterruptedException
	{
		Thread.sleep(2000);
		cartqty2.clear();
		cartqty2.sendKeys(r);
	}
	
//	public void addtowishlist() throws InterruptedException
//	{
//		Thread.sleep(1500);
//		wishlist.click();
//	}
	
	public void updatecartlist() throws InterruptedException
	{
		Thread.sleep(1500);
		updatelist.click();
		Thread.sleep(1500);
		home.click();
	}

}
