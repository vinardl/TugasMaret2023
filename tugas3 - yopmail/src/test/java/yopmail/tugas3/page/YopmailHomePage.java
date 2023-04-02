package yopmail.tugas3.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class YopmailHomePage extends BasePage {
    
	By login = By.id("login");
	By checkInboxButton = By.id("refreshbut");
  
	public YopmailHomePage(ThreadLocal<WebDriver> driver,ThreadLocal<WebDriverWait> explicitWait) {
		super(driver,explicitWait);
	}
	
	public void enterEmail(String automationtest) {
		setText(login,automationtest);
    }
    
    public void clickCheckInbox() {
        clickAndWait(checkInboxButton);
    }
}
