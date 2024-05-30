package pageObject;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebInput extends BasePage {
	Scanner sc=new Scanner(System.in);
	
	public WebInput(WebDriver driver)
	{
		super(driver);
	}
	//WebElement
	@FindBy(xpath="//input[@id='input-number']")
	WebElement inputNumber;
	
	public void inputNumberData()
	{
		System.out.println("Enter number to be filled in input number field value");
		String num=sc.next();
		inputNumber.sendKeys(num);
		
	}
	

}
