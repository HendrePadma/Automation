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
	
	@FindBy(xpath="//input[@id='input-text']")
	WebElement inputText;
	
	@FindBy(xpath="//input[@id='input-password']")
	WebElement inputPassword;
	
	@FindBy(xpath="//input[@id='input-date']")
	WebElement datepicker;
	 
	public void inputNumberData()
	{
		//System.out.println("Enter number to be filled in input number field value");
		//String num=sc.next();
		String num="5";
		inputNumber.sendKeys(num);
		
	}
	public void inputText()
	{
		//System.out.println("Enter text to be filled in input text field value");
		//String text=sc.next();
		String text="Padma";
		inputText.sendKeys(text);
		
	}
	
	public void inputPassword()
	{
		//System.out.println("Enter password to be filled in input number field value");
		String pw="abcd";
		//String pw=sc.next();
		inputPassword.sendKeys(pw);
		
	}
	
	public void clkDatePicker()
	{
		datepicker.sendKeys("02/01/1985");	}
}
