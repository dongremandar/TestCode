package Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

/* This is a class for Home page which store all the objects and methods related to home page*/
public class HomePage {

	WebDriver driver;

	public HomePage(WebDriver driver)	{    
		this.driver=driver; 
        }
	
    //Object Repository
	@FindBy(how=How.PARTIAL_LINK_TEXT, using="Careers") WebElement careersLink;
	
	//Metod to check the careers link on home page
	public void clickOncareersLink() throws InterruptedException	{
		careersLink.click();
		//Call to a function which validates the careers page title.
		validateTitle();
	}
	
	//checking the careers page title.
	public void validateTitle(){
		String expectedTitle = "Hexad GMBH - Careers";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
	}
}