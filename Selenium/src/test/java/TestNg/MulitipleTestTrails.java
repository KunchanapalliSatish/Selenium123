package TestNg;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.fasterxml.jackson.databind.deser.Deserializers.Base;

import io.github.bonigarcia.wdm.WebDriverManager;


public class MulitipleTestTrails {
  
  
  public class TestClassA extends Base {
	  WebDriver driver;
	  
      
      @Test(testName ="testgoogle" )
  	
  	public void testgoogle () throws Exception {
    	  
    	  WebDriverManager.chromedriver().setup();
  		
  		driver.get("https://www.google.com/");
  		driver.findElement(By.name("q")).sendKeys("Amazon",Keys.ENTER);
  		String expectedTitle = "Amazon - Google Search";
  		String actualTitle   = driver.getTitle();
  		assertEquals(actualTitle, expectedTitle);
//  		System.out.println(driver.getTitle());
  		
  }
     @Test(testName = "TestFacebook")
          public void TestFacebook() throws Exception {
  		
  		driver.get("https://www.facebook.com/");
  		driver.findElement(By.name("email")).sendKeys("HYR Tutorials", Keys.ENTER);

  		SoftAssert softAssert = new SoftAssert();
  		//Title Assertion
  		String actualTitle = driver.getTitle();
  		String expectedTitle = "Log in to Facebook";
  		softAssert.assertEquals(actualTitle, expectedTitle, "Title is mismatched");

  		//URL Assertion
  		String actualUrl = driver.getCurrentUrl();
  		String expectedUrl = "https://www.facebook.com/";
  		softAssert.assertEquals(actualUrl, expectedUrl, "URL is mismatched");

  		//Text Assertion
  		String actualText = driver.findElement(By.xpath("//input[@id='email']")).getAttribute("value");
  		String expectedText = "";
  		softAssert.assertEquals(actualText, expectedText, "Username text is mismatched");
  		

  		//Border Assertion
  		String actualBorder = driver.findElement(By.name("email")).getCssValue("border");
  		String expectedBorder = "1px solid rgb(240, 40, 73)";
  		softAssert.assertEquals(actualBorder, expectedBorder, "Username border is mismatched");

  		//ErrorMessage Assertion
  		String actualErrorMessage = driver.findElement(By.xpath("(//div[@id='email_container']/div)[last()]")).getText();
  		String expectedErrorMessage = "The email address or mobile number you entered isn't connected to an account. Find your account and log in.";
  		softAssert.assertEquals(actualErrorMessage, expectedErrorMessage, "Username error message is mismatched");

  	
  		softAssert.assertAll();
  		}
  		@Test(testName = "TestOrangeHRM")
  		public void TestOrangeHRM() throws Exception {
  			
  			driver.get("https://opensource-demo.orangehrmlive.com/");
  			Thread.sleep(3000);
  			driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
  			Thread.sleep(3000);
  			driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin1234");
  			Thread.sleep(3000);
  			driver.findElement(By.xpath("//button[@type='submit']")).click();
  			Assert.assertTrue(driver.findElement(By.id("welcome")).isDisplayed());
  		}
  		
  		}
  		




}
