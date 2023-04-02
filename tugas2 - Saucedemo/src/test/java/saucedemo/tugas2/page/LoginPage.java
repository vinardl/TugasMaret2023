package saucedemo.tugas2.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage {
   // private final WebDriver driver;

    By username = By.id("user-name");
    By password = By.id("password");
    By loginButton = By.id("login-button");

    public LoginPage(ThreadLocal<WebDriver> driver,ThreadLocal<WebDriverWait> explicitWait) {
		super(driver,explicitWait);
	}

    public void enterUsername(String usernameInput) {
    	setText(username,usernameInput);
//        WebElement element = driver.findElement(username);
//        element.sendKeys(username);
    }

    public void enterPassword(String passwordInput) {
    	setText(password,passwordInput);
//        WebElement element = driver.findElement(password);
//        element.sendKeys(password);
    }

    public void clickLoginButton() {
    	clickAndWait(loginButton);
//        WebElement element = driver.findElement(loginButton);
//        element.click();
    }

//    public void login(String username, String password) {
//        enterUsername(username);
//        enterPassword(password);
//        clickLoginButton();
//    }

}
