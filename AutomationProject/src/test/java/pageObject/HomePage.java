package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage  {

	public HomePage(WebDriver driver)
	{
	super(driver);
	}
	
	@FindBy(xpath="//a[normalize-space()='Web inputs']")
	WebElement WebInput;
	
	public void clkOnWebInput()
	{
		WebInput.click();
	}
	
	
		
	
	
	
	
	
}