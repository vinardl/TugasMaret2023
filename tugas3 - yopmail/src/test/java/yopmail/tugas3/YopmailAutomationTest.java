package yopmail.tugas3;

import org.testng.annotations.Test;
import yopmail.tugas3.page.YopmailHomePage;
import yopmail.tugas3.page.YopmailMessagePage;

public class YopmailAutomationTest extends BasedWebTestUsingThreadLocalParalel {
	//private Object explicitWait;
	YopmailHomePage homePage = new YopmailHomePage(driver,explicitWait);
	YopmailMessagePage messagePage = new YopmailMessagePage(driver,explicitWait);
    //private WebDriver driver;
    
    
    @Test
    public void testYopmail() {

     // enter email "automationtest" and click "Check Inbox" button
        homePage.enterEmail("automationtest");
        homePage.clickCheckInbox();
    }
    
    //switch
//    public void testIframe() {
//        messagePage.testIframe();
//      }
//    
//    public void getmessageBody() {
//    String bodyText = messagePage.getmessageBody();
//    System.out.println("Email Body: " + bodyText);
//    //Assert.assertTrue(getmessageBody.contains("Expected text"));
//     // assert that message body text contains expected text
//    //  Assert.assertTrue(messageBodyText.contains("Expected text"));
//    }
}