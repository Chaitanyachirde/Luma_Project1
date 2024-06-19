package luma_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Luma_CallingPOM 
{
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//Verify Login Page
		Luma_LoginPOM ll = new Luma_LoginPOM(driver);
		ll.launchURL();
		ll.clickSignInbtn();
		ll.enteremail("rd@mail.com");
		ll.enterpassword("456@Fghij");
		ll.clickOnsignin();
		
		//Verify SearchBox
		Luma_SearchProductPOM ls = new Luma_SearchProductPOM(driver);
		ls.searchproduct("pant");
		ls.searchedproduct();
		ls.selectsize();
		ls.selectcolour();
		ls.selectqty("5");
		ls.addtocart();
		
		//Verify Women section navigation
		Luma_WomensSectionPOM ws = new Luma_WomensSectionPOM(driver);
		ws.navigationlink();
		ws.selectcategory();
		ws.selectsubcategory();
		ws.selectproduct();
		ws.selecttype();
		ws.selectsize();
		ws.selectcolour();
		ws.selectqty("4");
		ws.addtocart();
		
		//Verify Men section navigation
		Luma_MensSectionPOM ms = new Luma_MensSectionPOM(driver);
		ms.navigationlink();
		ms.selectcategory();
		ms.selectsubcategory();
		ms.selectproduct();
		ms.selecttype();
		ms.selectsize();
		ms.selectcolour();
		ms.selectqty("2");
		ms.addtocart();
		
		//Verify Gear section navigation
		Luma_GearSectionPOM gs = new Luma_GearSectionPOM(driver);
		gs.navigationlink();
		gs.selectcategory();
		gs.selectsubcategory();
		gs.selectqty("2");
		gs.addtocart();
		
		//Verify Training section navigation
		Luma_TrainingSsctionPOM ts = new Luma_TrainingSsctionPOM(driver);
		ts.navigationlink();
		ts.selectcategory();
		ts.homepageredirect();
		
		//Verify Sale section navigation
		Luma_SaleSectionPOM ss = new Luma_SaleSectionPOM(driver);
		ss.navigationlink();
		ss.selectcategory();
		ss.selectsubcategory();
		ss.selectqty("5");
		ss.addtocart();
		
		//Verify My Account
		Luma_MyAccountPOM lm = new Luma_MyAccountPOM(driver);
		lm.actionSwitch();
		lm.myaccount();
		lm.myorder();
		lm.accountinfo();
		lm.addressbookt("pune");
		lm.payment();
		lm.myproduct();
		lm.home();
		
		//Verify Promotion pages on Homepage
		Luma_PromotionPageHomePOM ph = new Luma_PromotionPageHomePOM(driver);
		ph.promotionpage();
		ph.selectproduct();
		ph.productsize();
		ph.productcolour();
		ph.selectquantity("2");
		ph.addtoCart();
		ph.home();
		ph.promotionpage1();
		ph.selectproduct1();
		ph.productsize1();
		ph.productcolour1();
		ph.selectquantity1("1");
		ph.addtoCart1();
		ph.home1();
		
		//Verify Cart Module
		Luma_CartSectionPOM cs = new Luma_CartSectionPOM(driver);
		cs.addtocart();
		cs.viewcart();
		cs.selectproductqty("2");
		cs.selectproductqty1("3");
		cs.selectproductqty2("6");
	//cs.addtowishlist();
		cs.updatecartlist();
		
		//Verify order checkout module
		Luma_OrderCheckoutPOM oc = new Luma_OrderCheckoutPOM(driver);
		oc.addtocart();
		oc.clickOnCheckout();
		oc.clickOnNewAdd();
		oc.address("123 poq");
		oc.city("pune");
		oc.state(6);
		oc.postalcode("78799");
		oc.country(17);
		oc.phoneNumber("7879894745");
		oc.clickonShip();
//		oc.selectShipMethod();
		oc.clickOnNextBtn();
//		oc.selectcheckbox();
		oc.clickonPlacrOrder();
		oc.clickOnContineBtn();
		
		//Verify Logout module
		Luma_LogoutPOM lo = new Luma_LogoutPOM(driver);
		lo.dropdown();
		lo.logout();
		lo.closebrowser();
		
	}

}
