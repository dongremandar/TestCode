package Base;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
 

/* This will class is a base class which initiate the web driver and call the home page.*/

public class TestBase {
 
//Initiate the WebDriver object	
 public static WebDriver driver = null;
 
 @BeforeSuite
 //Before the automation starts, assign the chrome driver to web driver object and access the home page. 
 public void initialize() throws IOException	{
	 System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\java\\drivers\\chromedriver.exe");
	 driver = new ChromeDriver(); 
	 
	 //To maximize browser
     driver.manage().window().maximize();
     
     //Implicit wait
     driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
     
     //To open hexad homepage
     driver.get("https://hexad.de/en/home.html");
 }
 
 @AfterSuite
 //Test cleanup once all the test cases are executed
public void TeardownTest()	{
        TestBase.driver.quit();
    }
}