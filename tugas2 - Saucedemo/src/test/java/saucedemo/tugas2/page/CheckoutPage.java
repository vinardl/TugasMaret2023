package saucedemo.tugas2.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import saucedemo.tugas2.page.BasePage;

public class CheckoutPage extends BasePage {
	
	By firstName = By.id("first-name");
	By lastName = By.id("last-name");
	By postalCode = By.id("postal-code");
	By continueBtn = By.id("continue");
	By finishBtn = By.id("finish");
	By backHBtn = By.id("back-to-products");

    public CheckoutPage(ThreadLocal<WebDriver> driver,ThreadLocal<WebDriverWait> explicitWait) {
		super(driver,explicitWait);
	}
	
    public void enterfirstName(String firstnameInput) {
    	setText(firstName,firstnameInput);
//        WebElement element = driver.findElement(username);
//        element.sendKeys(username);
    }

    public void enterlastName(String lastnameInput) {
    	setText(lastName,lastnameInput);
//        WebElement element = driver.findElement(password);
//        element.sendKeys(password);
    }
	
    public void enterpostalCode(String postalcodeInput) {
    	setText(postalCode,postalcodeInput);
//        WebElement element = driver.findElement(password);
//        element.sendKeys(password);
    }
	
    public void clickContinueButton() {
    	clickAndWait(continueBtn);
//        WebElement element = driver.findElement(loginButton);
//        element.click();
    }
    
    public void clickFinishButton() {
    	clickAndWait(finishBtn);
//        WebElement element = driver.findElement(loginButton);
//        element.click();
    }
    
    public void clickbackhomeButton() {
    	clickAndWait(backHBtn);
//        WebElement element = driver.findElement(loginButton);
//        element.click();
    }
    
//    private final WebDriver driver;
//
//    By firstNameField = By.id("first-name");
//    By lastNameField = By.id("last-name");
//    By zipCodeField = By.id("postal-code");
//    By continueButton = By.xpath("//input[contains(@class, 'cart_button')]");
//
//    public CheckoutPage(WebDriver driver) {
//        this.driver = driver;
//    }
//
//    public void enterFirstName(String firstName) {
//        WebElement element = driver.findElement(firstNameField);
//        element.sendKeys(firstName);
//    }
//
//    public void enterLastName(String lastName) {
//        WebElement element = driver.findElement(lastNameField);
//        element.sendKeys(lastName);
//    }
//
//    public void enterZipCode(String zipCode) {
//        WebElement element = driver.findElement(zipCodeField);
//        element.sendKeys(zipCode);
//    }
//
//    public void clickContinueButton() {
//        WebElement element = driver.findElement(continueButton);
//        element.click();
//    }
//
//    public void fillOutPersonalInfo(String firstName, String lastName, String zipCode) {
//        enterFirstName(firstName);
//        enterLastName(lastName);
//        enterZipCode(zipCode);
//        clickContinueButton();
//    }
}
