package saucedemo.tugas2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import saucedemo.tugas2.BasedWebTestUsingThreadLocalParalel;
import saucedemo.tugas2.page.CheckoutPage;
import saucedemo.tugas2.page.InventoryPage;
import saucedemo.tugas2.page.LoginPage;

public class SaucedemoTest extends BasedWebTestUsingThreadLocalParalel{
	LoginPage loginPage = new LoginPage(driver,explicitWait);
	InventoryPage inventoryPage = new InventoryPage(driver,explicitWait);
	CheckoutPage checkoutPage = new CheckoutPage(driver,explicitWait);
	
    @Test
    public void testLogin() {
    	loginPage.enterUsername("standard_user");
		loginPage.enterPassword("secret_sauce");
		loginPage.clickLoginButton();
//        loginPage.login("standard_user", "secret_sauce");
//        String expectedUrl = "https://www.saucedemo.com/inventory.html";
//        String actualUrl = driver.getCurrentUrl();
//		Assert.assertTrue(actualText.contains(expectedText));
    }

    @Test(dependsOnMethods = "testLogin")
    public void testAddCart() {
        inventoryPage.clickAddToCartButton();
        inventoryPage.clickCartButton();
//        String expectedUrl = "https://www.saucedemo.com/cart.html";
//        String actualUrl = driver.getCurrentUrl();
//        Assert.assertEquals(actualUrl, expectedUrl);
    }

//    @Test(dependsOnMethods = "testAddCart")
//    public void testCheckout() {
//        inventoryPage.clickCheckoutButton();
//        checkoutPage.fillOutPersonalInfo("John", "Doe", "12345");
//        String expectedUrl = "https://www.saucedemo.com/checkout-step-two.html";
//        String actualUrl = driver.getCurrentUrl();
//        Assert.assertEquals(actualUrl, expectedUrl);
//   }

}
