package luma_TestNG;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


	
public class Luma_P1 
{
	WebDriver driver;
	@BeforeSuite
	public void LaunchBrowser() throws InterruptedException 
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://magento.softwaretestingboard.com/");
		Thread.sleep(1500);
	}
	
	WebElement home;
//	@Test
	public void createAccount() throws InterruptedException
	{
		driver.findElement(By.partialLinkText("Create an Account")).click();
		driver.findElement(By.id("firstname")).sendKeys("Chaitanya");
		Thread.sleep(1000);
		driver.findElement(By.id("lastname")).sendKeys("Chirde");
		Thread.sleep(1000);
		driver.findElement(By.id("email_address")).sendKeys("cc@mail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("password")).sendKeys("123@Abcde");
		Thread.sleep(1000);
		driver.findElement(By.id("password-confirmation")).sendKeys("123@Abcde");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@title=\"Create an Account\"]")).click();
		Thread.sleep(1000);
		home = driver.findElement(By.xpath("//a[@class=\"logo\"]"));
		home.click();
	}
	
	@Test(priority=1)
	public void Login() throws InterruptedException
	{
		driver.findElement(By.xpath("//div[@class='panel header']//a[contains(text(),'Sign In')]")).click();
		driver.findElement(By.id("email")).sendKeys("rd@mail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("pass")).sendKeys("456@Fghij");
		Thread.sleep(1000);
		driver.findElement(By.id("send2")).click();
		Thread.sleep(1000);
	}
	
	@Test(priority=2)
	public void myAccount() throws InterruptedException
	{
		driver.findElement(By.xpath("//button[@class=\"action switch\"]")).click();
		driver.findElement(By.partialLinkText("My Account")).click();
		driver.findElement(By.partialLinkText("My Orders")).click();
		Thread.sleep(1000);
		driver.findElement(By.partialLinkText("Account Information")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@title=\"Save\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@class=\"logo\"]")).click();
		
	}
	
	@Test(priority=3)
	public void Search_Function() throws InterruptedException
	{
		WebElement search = driver.findElement(By.xpath("//input[@id='search']"));
		search.sendKeys("pants");
		search.submit();
		driver.findElement(By.xpath("//a[@class='product photo product-item-photo']//img[@alt='Aether Gym Pant ']")).click();
		Thread.sleep(1500);
		driver.findElement(By.id("option-label-size-143-item-177")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("option-label-color-93-item-53")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("qty")).clear();
		driver.findElement(By.id("qty")).sendKeys("2");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@title=\"Add to Cart\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@class=\"logo\"]")).click();
		Thread.sleep(1000);
		
	}
	@Test(priority=4)
	//PromotionPageHomepage
	public void promotionpage() throws InterruptedException
	{
	driver.findElement(By.partialLinkText("Wicking to raingear, Luma covers you")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html[1]/body[1]/div[2]/main[1]/div[3]/div[1]/div[3]/ol[1]/li[9]/div[1]/a[1]/span[1]/span[1]/img[1]")).click();
	Thread.sleep(1000);
	driver.findElement(By.id("option-label-size-143-item-168")).click();
	Thread.sleep(1000);
	driver.findElement(By.id("option-label-color-93-item-57")).click();
	Thread.sleep(2000);
	WebElement qty = driver.findElement(By.id("qty"));
	qty.clear();
	qty.sendKeys("2");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//button[@title=\"Add to Cart\"]")).click();
	Thread.sleep(1500);
	driver.findElement(By.xpath("//a[@class=\"logo\"]")).click();
	}	
	
	@Test(priority=5)
	//Women Section navigation
	public void WomenNav() throws InterruptedException
	{
		Thread.sleep(1500);
		driver.findElement(By.id("ui-id-4")).click();
		Thread.sleep(1500);
		driver.findElement(By.partialLinkText("Tops")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/main[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]")).click();
		Thread.sleep(1500);
		driver.findElement(By.partialLinkText("Jacket")).click();
		Thread.sleep(1500);
		driver.findElement(By.partialLinkText("Neve Studio Dance Jacket")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//div[@option-label=\"M\"]")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//div[@option-label=\"Orange\"]")).click();
		Thread.sleep(1500);
		WebElement qty = driver.findElement(By.id("qty"));
		qty.clear();
		qty.sendKeys("2");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//button[@title=\"Add to Cart\"]")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//a[@class=\"logo\"]")).click();
		}
	
	@Test(priority=6)
	public void MenNav() throws InterruptedException
	{
		Thread.sleep(1000);
		driver.findElement(By.id("ui-id-5")).click();
		Thread.sleep(1500);
		driver.findElement(By.partialLinkText("Bottoms")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//div[normalize-space()='Climate']")).click();
		Thread.sleep(1500);
		driver.findElement(By.partialLinkText("Rainy")).click();
		Thread.sleep(1500);
		driver.findElement(By.partialLinkText("Aether Gym Pant")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("option-label-size-143-item-177")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("option-label-color-93-item-53")).click();
		Thread.sleep(1000);
		WebElement qty = driver.findElement(By.id("qty"));
		qty.clear();
		qty.sendKeys("2");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//button[@title=\"Add to Cart\"]")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//a[@class=\"logo\"]")).click();	
	}
	
	@Test(priority=7)
	public void Gearnav() throws InterruptedException 
	{
		Thread.sleep(1500);
		driver.findElement(By.id("ui-id-6")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[normalize-space()='Watches'])[2]")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("(//img[@alt='Aim Analog Watch'])[1])")).click();
		Thread.sleep(1000);
		WebElement qty = driver.findElement(By.id("qty"));
		qty.clear();
		qty.sendKeys("3");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@title=\"Add to Cart\"]")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//a[@class=\"logo\"]")).click();	
	}
	
	@Test(priority=8)
	public void TrainingNav() throws InterruptedException
	{
		driver.findElement(By.id("ui-id-7")).click();
		Thread.sleep(4500);
		driver.findElement(By.partialLinkText("Video Download")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//a[@title=\\\"Go to Home Page\\\"]")).click();
	}
	
	@Test(priority=9)
	public void SalesNav() throws InterruptedException
	{
		driver.findElement(By.id("ui-id-8")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//a[contains(text(),'Fitness Equipment')]")).click();
		Thread.sleep(4500);
		driver.findElement(By.xpath("//img[@alt='Affirm Water Bottle ']")).click();
		Thread.sleep(1500);
		WebElement qty = driver.findElement(By.id("qty"));
		qty.clear();
		qty.sendKeys("2");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//button[@title=\"Add to Cart\"]")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//a[@class=\"logo\"]")).click();	
	}
	
	@Test(priority=10)
	public void orderCheckout() throws InterruptedException
	{
		Thread.sleep(4500);
		driver.findElement(By.xpath("//a[@class=\"action showcart\"]")).click();
		Thread.sleep(2500);
		driver.findElement(By.id("top-cart-btn-checkout")).click();
		Thread.sleep(3500);
		driver.findElement(By.cssSelector(".action.action-show-popup")).click();
		Thread.sleep(1500);
		driver.findElement(By.name("street[0]")).sendKeys("090 koregaon");
		Thread.sleep(1500);
		driver.findElement(By.name("city")).sendKeys("Mumbai");
		Thread.sleep(1500);
		Select dropstate = new Select(driver.findElement(By.xpath("/html[1]/body[1]/div[3]/aside[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[5]/div[1]/select[1]")));
		dropstate.selectByIndex(9);
		Thread.sleep(1500);
		driver.findElement(By.name("postcode")).sendKeys("9897");
		Thread.sleep(1500);
		Select dropcountry = new Select(driver.findElement(By.name("country_id")));
		dropcountry.selectByIndex(16);
		Thread.sleep(1500);
		driver.findElement(By.name("telephone")).sendKeys("787454712");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//span[normalize-space()='Ship here']")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//span[normalize-space()='Next']")).click();
		Thread.sleep(4500);
		driver.findElement(By.cssSelector("button[title='Place Order']")).click();
		Thread.sleep(2500);
		driver.findElement(By.xpath("//span[normalize-space()='Continue Shopping']")).click();
		Thread.sleep(1500);
	}
	
	
	@Test(priority=15)
	public void Logout_Quit() throws InterruptedException
	{
		Thread.sleep(2500);
		driver.findElement(By.xpath("//button[@class=\"action switch\"]")).click();
		driver.findElement(By.partialLinkText("Sign Out")).click();
	}

}
