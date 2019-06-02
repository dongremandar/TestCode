package AutoTests;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.CareersPage;
import Pages.HomePage;
import Pages.ApplyNow;
 
/* This will class should have all the tests which needs to be carried out*/

public class HomeTest extends TestBase{
 
 @Test(priority=1)
 //Test to check if Careers page is loaded from Home Page
 public void validateCareers() throws Exception{
	 HomePage homepage = PageFactory.initElements(driver, HomePage.class);
	 homepage.clickOncareersLink();
 }
 
 @Test(priority=2)
 //Test to check if Job Description is shown correctly for UI Developer Opening.
 public void validateJobDesc() throws Exception{
	 CareersPage careerspage = PageFactory.initElements(driver, CareersPage.class);
	 careerspage.clickOnJobDescLink();
	 careerspage.clickApplyNowLink();
 }
 
 @Test(priority=3)
 //Test to check if Apply Now is showing Validation Error..
 public void validateApplyNow() throws Exception{
	 ApplyNow applynowpage = PageFactory.initElements(driver, ApplyNow.class);
	 applynowpage.clickOnSubmit();
 }
 
}