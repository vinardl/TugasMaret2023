package saucedemo.tugas2.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import saucedemo.tugas2.page.BasePage;

public class InventoryPage extends BasePage {
	
    By addcartButton = By.id("add-to-cart-sauce-labs-backpack");
    By shoppingCart = By.className("shopping_cart_link") ;
    By checkOut = By.id("checkout") ;

    public InventoryPage(ThreadLocal<WebDriver> driver,ThreadLocal<WebDriverWait> explicitWait) {
		super(driver,explicitWait);
	}
    
//    private final WebDriver driver;
//
//    By addToCartButton = By.xpath("//button[contains(text(), 'ADD TO CART')]");
//    By cartButton = By.xpath("//a[contains(@class, 'shopping_cart_container')]");
//    By checkoutButton = By.xpath("//a[contains(text(), 'CHECKOUT')]");
//
//    public InventoryPage(WebDriver driver) {
//        this.driver = driver;
//    }
//
	public void clickAddToCartButton() {
		clickAndWait(addcartButton);
//        WebElement element = driver.findElement(addToCartButton);
//        element.click();
    }
//
    public void clickCartButton() {
    	clickAndWait(shoppingCart);
//        WebElement element = driver.findElement(cartButton);
//        element.click();
    }
//
    public void clickCheckoutButton() {
    	clickAndWait(checkOut);
//        WebElement element = driver.findElement(checkoutButton);
//        element.click();
    }
}
