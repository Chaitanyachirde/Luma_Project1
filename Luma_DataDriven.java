package luma_dataDriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Luma_DataDriven 
{
	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://magento.softwaretestingboard.com/");
		
		String filepath = "C:\\Users\\user\\Documents\\Luma_LoginData.xlsx";
		FileInputStream fis = new FileInputStream(filepath);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Details");
		
		int rows = sheet.getLastRowNum();
		System.out.println("Number of rows: "+rows);
		
		for (int r=1;r<=rows;r++)
		{
			XSSFRow row = sheet.getRow(r);
			XSSFCell email = row.getCell(0);
			XSSFCell password = row.getCell(1);
			System.out.println("Email id--> "+email+ "Password--> "+password);
			
			try {
				Thread.sleep(1000);
				driver.findElement(By.xpath("//div[@class='panel header']//a[contains(text(),'Sign In')]")).click();
				driver.findElement(By.id("email")).sendKeys(email.toString());
				Thread.sleep(1500);
				driver.findElement(By.id("pass")).sendKeys(password.toString());
				Thread.sleep(1000);
				driver.findElement(By.id("send2")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//a[@class=\"logo\"]")).click();
				driver.findElement(By.xpath("//div[@class=\"ea-stickybox-hide\"]")).click();
				
				
				//PromotionPageHomepage
//				driver.findElement(By.partialLinkText("Wicking to raingear, Luma covers you")).click();
//				Thread.sleep(1000);
//				driver.findElement(By.xpath("//img[@alt='Karmen Yoga Pant']")).click();
//				Thread.sleep(1000);
//				driver.findElement(By.id("option-label-size-143-item-172")).click();
//				Thread.sleep(1000);
//				driver.findElement(By.xpath("//div[@option-label=\"White\"]")).click();
//				Thread.sleep(1000);
//				WebElement qty = driver.findElement(By.id("qty"));
//				qty.clear();
//				qty.sendKeys("2");
//				Thread.sleep(1000);
//				driver.findElement(By.xpath("//button[@title=\"Add to Cart\"]")).click();
//				Thread.sleep(1500);
//				driver.findElement(By.xpath("//a[@class=\"logo\"]")).click();
				
//				My Account module
//				Thread.sleep(1000);
//				driver.findElement(By.xpath("//button[@class=\"action switch\"]")).click();
//				driver.findElement(By.partialLinkText("My Account")).click();
//				driver.findElement(By.partialLinkText("My Orders")).click();
//				Thread.sleep(1000);
//				driver.findElement(By.partialLinkText("Account Information")).click();
//				Thread.sleep(1000);
//				driver.findElement(By.xpath("//button[@title=\"Save\"]")).click();
//				Thread.sleep(1000);
//				driver.findElement(By.partialLinkText("Address Book")).click();
//				Thread.sleep(1500);
//				driver.findElement(By.id("street_1")).sendKeys("Nagpur");
//				Thread.sleep(1500);
//				driver.findElement(By.xpath("//button[@title=\"Save Address\"]")).click();
//				Thread.sleep(1500);
//				driver.findElement(By.partialLinkText("Stored Payment Methods")).click();
//				Thread.sleep(1500);
//				driver.findElement(By.partialLinkText("My Product Reviews")).click();
//				Thread.sleep(1500);
//				driver.findElement(By.xpath("//a[@class=\"logo\"]")).click();
				
				//Search function
				WebElement search = driver.findElement(By.id("search"));
				search.sendKeys("pants");
				search.submit();
				driver.findElement(By.xpath("//img[@alt=\"Livingston All-Purpose Tight\"]")).click();
				Thread.sleep(1500);
				driver.findElement(By.id("option-label-size-143-item-177")).click();
				Thread.sleep(1000);
				driver.findElement(By.id("option-label-color-93-item-50")).click();
				Thread.sleep(1000);
				driver.findElement(By.id("qty")).clear();
				driver.findElement(By.id("qty")).sendKeys("2");
				Thread.sleep(1000);
				driver.findElement(By.xpath("//button[@title=\"Add to Cart\"]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//a[@class=\"logo\"]")).click();
				Thread.sleep(1000);
				
				driver.findElement(By.xpath("//button[@class=\"action switch\"]")).click();
				driver.findElement(By.partialLinkText("Sign Out")).click();
				System.out.println("Valid Data");
				Thread.sleep(2500);
			}
			catch(Exception e)
			{
				System.out.println("Invalid Data");
			}
		}
		fis.close();
	}
}
