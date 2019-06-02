package Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

/* This is a class for validating Apply Now page*/
public class ApplyNow {
	
	WebDriver driver;

	public ApplyNow(WebDriver driver)	{
		this.driver=driver; 
	}
	
	//Object Repository
	@FindBy(how=How.XPATH, using="//button[contains(text(), ' Submit')]") WebElement btnSubmit;
	@FindBy(how=How.NAME, using="full_name") WebElement txtFullName;

	
	public void clickOnSubmit() throws InterruptedException{
		//Clicking on submit button.
		btnSubmit.click();
		validateSubmitError();
	}
	
	//checking the validaiton error on clicking submit.
	public void validateSubmitError(){
		String validationMessage = txtFullName.getAttribute("validationMessage");
		Assert.assertEquals( validationMessage, "Please fill out this field.");
	}	
}
