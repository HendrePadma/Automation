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
		hp.clkOnWebInput();
		WebInput webip=new WebInput(driver);
		webip.inputNumberData();
	}
	

}
