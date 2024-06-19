package luma_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Luma_OrderCheckoutPOM 
{
	WebDriver driver;
	public Luma_OrderCheckoutPOM(WebDriver idriver)
	{
		driver=idriver;
		PageFactory.initElements(driver, this);
	}
	//Repository WebElements
	@FindBy (xpath="//a[@class=\"action showcart\"]")WebElement carticon;
	@FindBy (id="top-cart-btn-checkout")WebElement checkoutbtn;
	@FindBy (css=".action.action-show-popup")WebElement newadd;
	@FindBy (name="street[0]")WebElement address;
	@FindBy (name="city")WebElement city;
	@FindBy (xpath="/html[1]/body[1]/div[3]/aside[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[5]/div[1]/select[1]")WebElement state;
	@FindBy (name="postcode")WebElement postalcode;
	@FindBy (name="country_id")WebElement country;
	@FindBy (name="telephone")WebElement phone;
	@FindBy (xpath="//span[normalize-space()='Ship here']")WebElement shiphere;
//	@FindBy (xpath="//input[@name=\"ko_unique_1\"]")WebElement shippingmethod;
	@FindBy (xpath="//span[normalize-space()='Next']")WebElement nextbtn;
	@FindBy (xpath="(//input[@id='billing-address-same-as-shipping-checkmo'])[1]")WebElement checkbox;
	@FindBy (css="button[title='Place Order']")WebElement placeorderbtn;
	@FindBy (xpath="//span[normalize-space()='Continue Shopping']")WebElement continueshopbtn;
	
	public void addtocart() throws InterruptedException
	{
		Thread.sleep(2000);
		carticon.click();
	}
	public void clickOnCheckout() throws InterruptedException
	{
		Thread.sleep(2000);
		checkoutbtn.click();
	}
	public void clickOnNewAdd() throws InterruptedException
	{
		Thread.sleep(5000);
		newadd.click();
	}
	public void address(String a) throws InterruptedException
	{
		Thread.sleep(2000);
		address.sendKeys(a);
	}
	public void city(String c) throws InterruptedException
	{
		Thread.sleep(2000);
		city.sendKeys(c);
	}
	public void state(int a) throws InterruptedException
	{
		Thread.sleep(3000);
		state.click();
		Select drpstate = new Select(state);
		drpstate.selectByIndex(a);
	}
	public void postalcode(String p) throws InterruptedException
	{
		Thread.sleep(2000);
		postalcode.sendKeys(p);
	}
	public void country(int c) throws InterruptedException
	{
		Thread.sleep(1500);
		country.click();
		Select drpcountry = new Select(country);
		drpcountry.selectByIndex(c);
	}
	public void phoneNumber(String p) throws InterruptedException
	{
		Thread.sleep(1500);
		phone.sendKeys(p);
	}
	public void clickonShip() throws InterruptedException
	{
		Thread.sleep(1500);
		shiphere.click();
	}
//	public void selectShipMethod() throws InterruptedException
//	{
//		Thread.sleep(1500);
//		shippingmethod.click();
//	}
	public void clickOnNextBtn() throws InterruptedException
	{
		Thread.sleep(1500);
		nextbtn.click();	
	}
	public void selectcheckbox() throws InterruptedException
	{
		Thread.sleep(1500);
		checkbox.click();
	}
	public void clickonPlacrOrder() throws InterruptedException
	{
		Thread.sleep(5000);
		placeorderbtn.click();
	}
	public void clickOnContineBtn() throws InterruptedException
	{
		Thread.sleep(4500);
		continueshopbtn.click();
	}
	

}
