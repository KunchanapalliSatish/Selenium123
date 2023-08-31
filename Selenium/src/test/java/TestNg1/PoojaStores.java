package TestNg1;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PoojaStores {

	WebDriver driver;
  
		@Test(dataProvider ="getdata",dataProviderClass =ExceldataPoojaStoresTest.class  )
		public void Dataset(String Username,String Password) throws InterruptedException {

            WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://poojastore.marolix.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			
			driver.findElement(By.xpath("//a[text()='Log In']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys(Username);
			
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@name='pword']")).sendKeys(Password);
			driver.findElement(By.xpath("//div[@class='col-md-6']/button")).click();
			String url=driver.getCurrentUrl();
			assertEquals(url ,"http://poojastore.marolix.com/Admin/Dashboard","Failed test case due to credentials");
			//assertEquals(null, false)
			driver.close();
		}
	  
  }

