package TestNg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderfromExcel {
	 WebDriver driver;
  @Test  (dataProvider="Logintestdata")   //, dataProviderClass = ExcelDataGet.class)
  public void dataset(String username, String password) throws Throwable {
	  
	 WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);

		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		String url = driver.getCurrentUrl();
		Assert.assertEquals("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index", url);
		//Assert.assertTrue(driver.findElement(By.xpath("//p[text()='Rasheeka Collings']")).isDisplayed());
		Thread.sleep(3000);
		driver.quit();
  }
		@DataProvider (parallel = true)
		public Object[][] Logintestdata () {
			
			Object [] [] data = new  Object [4] [2];
			data [0] [0]= "Admin";
			data [0] [1] = "admin123";
			
			data [1] [0] = "satish";
			data [1] [1] = "123";
			
			
			data [2][0]="bhavani";
			data [2][1]="123";
			
			data [3] [0]="satya";
			data [3] [1]=" admin123";
			
			return data; 
		}
//		@AfterTest
//			public void logout() {
//			driver.close();
//			
//			}
}
			
			
		
		
		
  

