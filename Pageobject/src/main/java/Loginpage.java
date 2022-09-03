import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginpage {
	
	WebDriver driver;
	public Loginpage(WebDriver driver)
	{
		this.driver=driver;
	}
	By username = By.id("userid");
	By continuebtn = By.id("signin-continue-btn");
	By password = By.id("pass");
	By signInButton = By.id("sgnBt");
	
	public WebElement userName()
	{
		return driver.findElement(username);
	}
	
	public WebElement continueButton()
	{
		return driver.findElement(continuebtn);
	}
	
	public WebElement pwd()
	{
		return driver.findElement(password);
	}
	
	public WebElement signinButton()
	{
		return driver.findElement(signInButton);
	}
	
	

}
