package saucedemo.tugas2;

import org.testng.Assert;
import org.testng.annotations.Test;

//import saucedemo.tugas2.BasedWebTestUsingThreadLocalParalel;
import saucedemo.tugas2.page.CheckoutPage;
import saucedemo.tugas2.page.InventoryPage;
import saucedemo.tugas2.page.LoginPage;

public class WebTestUsingPOMManual extends BasedWebTestUsingThreadLocalParalel{
	LoginPage loginPage = new LoginPage(driver,explicitWait);
//	ProfilePage profilePage = new ProfilePage(driver, explicitWait);
	InventoryPage inventoryPage = new InventoryPage(driver,explicitWait);
	CheckoutPage checkoutPage = new CheckoutPage(driver,explicitWait);
	
	
	@Test
	public void testLogin() {
		//loginpage
		loginPage.enterUsername("standard_user");
		loginPage.enterPassword("secret_sauce");
		loginPage.clickLoginButton();
		
		//inventorypage
		inventoryPage.clickAddToCartButton();
		inventoryPage.clickCartButton();
		inventoryPage.clickCheckoutButton();
		
		//checkout
		checkoutPage.enterfirstName("John");
		checkoutPage.enterlastName("Wick");
		checkoutPage.enterpostalCode("1234");
		checkoutPage.clickContinueButton();
		checkoutPage.clickFinishButton();
		checkoutPage.clickbackhomeButton();
	}
	
//	@Test
//	public void testaddCart() {
//		//inventorypage
//		inventoryPage.clickAddToCartButton();
//		inventoryPage.clickCartButton();
//		inventoryPage.clickCheckoutButton();
//	}
//	
//	public void testCheckout() {
//		//checkout
//		checkoutPage.enterfirstName("fsdsdsda");
//		checkoutPage.enterlastName("asdasdfqwq");
//		checkoutPage.enterpostalCode("1231231");
//		checkoutPage.clickContinueButton();
//		checkoutPage.clickFinishButton();
//	}
}

