package testCases;

import org.testng.annotations.Test;

import pageObject.HomePage;
import pageObject.WebInput;
import testBase.BaseClass;

public class TC001_WebInput extends BaseClass {
	
	@Test
	public void WebInputTestValidation()
	{
		HomePage hp=new HomePage(driver);
		logger.info("******************Different Input****************************");
		hp.clkOnWebInput();
		WebInput webip=new WebInput(driver);
		webip.inputNumberData();
		webip.inputText();
		webip.inputPassword();
		webip.clkDatePicker();
	}
	

}
