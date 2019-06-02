package Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

/* This is a class for Careers page which store all the objects and methods related to careers page*/
public class CareersPage {
	
	WebDriver driver;

	public CareersPage(WebDriver driver)	{
		this.driver=driver; 
	}
	
	//Object Repository
	@FindBy(how=How.XPATH, using="//p[contains(text(),'UI Developer')]/parent::*/following-sibling::div[contains(@class,'sm-4')]/button[contains(text(), ' Job Description')]") WebElement btnJobDesc;
	@FindBy(how=How.XPATH, using="//p[contains(text(),'UI Developer')]/parent::*/following-sibling::div[contains(@class,'md-12')]/div") WebElement uiJobDesc;
	@FindBy(how=How.XPATH, using= "//p[contains(text(),'UI Developer')]/parent::*/following-sibling::div[contains(@class,'sm-4')]/button[contains(text(), ' Apply Now')]") WebElement applyNowLink;;

	
	public void clickOnJobDescLink() throws InterruptedException{
		//Verifying the Job Description is shown for UI developer position by checking the specific div properties
		
		//Getting the original value of div
		String orgValue = uiJobDesc.getAttribute("class");
		
		//Click the Job Desc button
		btnJobDesc.click();
		
		//Wait for 5 secs to get correct value assigned to the class attribute of the div.
		Thread.sleep(500);
		
		//Getting the new value of div
		String newValue = uiJobDesc.getAttribute("class");
		
		//Comparing the class value before and after clicking on Job Des button
		if (orgValue.equals("collapse"))	{
				 Assert.assertEquals( newValue, "collapse in");
		}
		else	{
			Assert.assertEquals(newValue, "collapse");
		}
	}
	
	public void clickApplyNowLink() throws InterruptedException	{
		applyNowLink.click();
	}

}
	