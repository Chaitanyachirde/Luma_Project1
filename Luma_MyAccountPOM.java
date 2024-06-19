package luma_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Luma_MyAccountPOM 
{
	WebDriver driver;
	public Luma_MyAccountPOM(WebDriver idriver)
	{
		driver=idriver;
		PageFactory.initElements(driver, this);
	}
	//Repository WebElement
	@FindBy (xpath="//button[@class=\"action switch\"]")WebElement action;
	@FindBy (partialLinkText="My Account")WebElement act;
	@FindBy (partialLinkText="My Orders")WebElement order;
	@FindBy (partialLinkText="Account Information")WebElement actinfo;
	@FindBy (xpath="//button[@title=\"Save\"]")WebElement save;
	@FindBy (partialLinkText="Address Book")WebElement addbook;
	@FindBy (xpath="//span[normalize-space()='Add New Address']")WebElement newAdd;
	@FindBy (id="street_1")WebElement street;
	@FindBy (xpath="//button[@title=\"Save Address\"]")WebElement addsave;
	@FindBy (partialLinkText="Stored Payment Methods")WebElement payment;
	@FindBy (partialLinkText="My Product Reviews")WebElement review;
	@FindBy (xpath="//a[@class=\"logo\"]")WebElement home;
	
	public void actionSwitch() throws InterruptedException 
	{
		Thread.sleep(2000);
		action.click();
	}
	public void myaccount() throws InterruptedException
	{
		Thread.sleep(1000);
		act.click();
	}
	public void myorder() throws InterruptedException
	{
		Thread.sleep(1000);
		order.click();
	}
	public void accountinfo() throws InterruptedException
	{
		Thread.sleep(1000);
		actinfo.click();
		save.click();
	}
	public void addressbookt(String str) throws InterruptedException
	{
		Thread.sleep(1000);
		addbook.click();
		Thread.sleep(1500);
		newAdd.click();
		street.sendKeys(str);
		addsave.click();
	}
	public void payment() throws InterruptedException
	{
		Thread.sleep(1000);
		payment.click();
	}
	public void myproduct() throws InterruptedException
	{
		
		Thread.sleep(1000);
		review.click();
	}
	public void home() throws InterruptedException
	{
		Thread.sleep(1000);
		home.click();
	}
}
