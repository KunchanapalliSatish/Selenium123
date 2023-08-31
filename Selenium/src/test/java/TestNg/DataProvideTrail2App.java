package TestNg;

import java.time.Duration;  

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class DataProvideTrail2App {
	
	@Test (dataProvider ="face", dataProviderClass = DataprovideTrail1Ex.class)
	
	
	public void logintest(String Username,String Password) {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjkxNjQyOTgzLCJjYWxsc2l0ZV9pZCI6MjY5NTQ4NDUzMDc");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		driver.findElement(By.id("email")).sendKeys(Username);
		driver.findElement(By.id("pass")).sendKeys(Password);
		driver.findElement(By.id("loginbutton")).click();
		String url=driver.getCurrentUrl();
		Assert.assertEquals("https://www.facebook.com/?sk=welcome", url);
		
		
		
	}
	




}

