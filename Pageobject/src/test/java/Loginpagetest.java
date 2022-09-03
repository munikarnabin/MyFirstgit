import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Loginpagetest {
	
	//https://www.ebay.com/signin
	@Test
	
	public void signIn() 
	{
	System.setProperty("webdriver.chrome.driver", "C:\\\\Udemy Selenium\\\\Drivers\\\\ChromeDriver\\\\chromedriver.exe");	
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	driver.get("https://www.ebay.com/signin");
	
	Loginpage lPage = new Loginpage(driver);
	lPage.userName().sendKeys("nabeen_y@yahoo.com");
	lPage.continueButton().click();
	
	lPage.pwd().sendKeys("Testingonly!");
	lPage.signinButton().click();
	
	
	}
	

}
