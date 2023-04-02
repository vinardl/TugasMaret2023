package yopmail.tugas3;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.AssertJUnit;
import yopmail.tugas3.page.YopmailHomePage;
import yopmail.tugas3.page.YopmailMessagePage;

public class WebTestUsingPOMManual extends BasedWebTestUsingThreadLocalParalel{
	YopmailHomePage homePage = new YopmailHomePage(driver,explicitWait);
	YopmailMessagePage messagePage = new YopmailMessagePage(driver,explicitWait);
	
	@Test
	public void testEmail() {
		//email
		homePage.enterEmail("automationtest");
		homePage.clickCheckInbox();
		
		//click 
		driver.get().switchTo().frame("ifinbox");
		driver.get().findElement(By.xpath("//*[@id=\"e_ZwZjZmR4ZQx1ZQNmZQNjZwVjAQZkAj==\"]/button")).click();
		
		//message
		driver.get().switchTo().defaultContent();
		driver.get().switchTo().frame("ifmail");
		//driver.get().findElement(By.xpath("//*[@id=\"recaptcha-anchor\"]/div[1]")).click();
		String bodyText = driver.get().findElement(By.id("mail")).getText();
		System.out.println(bodyText);
		
		//System.out.println(bodytext);
//		String messageBody = messagePage.getmessageBody();	
//		AssertJUnit.assertTrue(messageBody.contains("Expected text"));
	}
}

