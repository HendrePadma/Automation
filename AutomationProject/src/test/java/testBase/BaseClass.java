package testBase;

import java.io.IOException;
import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;



public class BaseClass {
	public WebDriver driver;
	public Logger logger;
	
	
	@BeforeClass(groups= {"Master"})
	@Parameters({"os","browser"})
	public void setup(@Optional("Windows") String os,@Optional("chrome")String br) throws IOException
	{
		logger=LogManager.getLogger(this.getClass());
		switch(br.toLowerCase())
		{
		case "chrome":driver= new ChromeDriver();break;
		case "edge":driver= new EdgeDriver();break;
		default :driver= new ChromeDriver();break;
		}
		
		driver.get("https://practice.expandtesting.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	
	@AfterClass
	public void tearDown()
	{
		driver.close();
	}

}
