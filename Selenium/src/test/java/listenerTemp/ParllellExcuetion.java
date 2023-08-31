package listenerTemp;

import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
  import org.openqa.selenium.WebDriver;
  import org.openqa.selenium.chrome.ChromeDriver;
  import org.testng.Assert;
  import org.testng.annotations.DataProvider;
  import org.testng.annotations.Test;
  import io.github.bonigarcia.wdm.WebDriverManager;
  public class ParllellExcuetion {
	  
	     @Test(dataProvider = "loginData")
  	public void TestLogin(String userName, String password) throws Throwable {
  		WebDriverManager.chromedriver().setup();
  		WebDriver driver = new ChromeDriver();
  		driver.manage().window().maximize();
  		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
  		
  		driver.get("https://opensource-demo.orangehrmlive.com/");
  		Thread.sleep(2000); 
  		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(userName);
  		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
  		driver.findElement(By.xpath("//button[@type='submit']")).click();
  		String url = driver.getCurrentUrl();
  		Assert.assertEquals(url,"https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
  		Thread.sleep(3000);
  		driver.quit();
  	}
  	
  	@DataProvider  (parallel = true)  // use this flag for run the test data tests in a parallel mode 
  	public Object[][] loginData() {
  		Object[][] data = new Object[4][2];
  		data[0][0] = "Admin";
  		data[0][1] = "admin123";
  		
  		data[1][0] = "Admin";
  		data[1][1] = "test123";
  		
  		data[2][0] = "Test";
  		data[2][1] = "admin123";
  		
  		data[3][0] = "Prod";
  		data[3][1] = "test123";
//  		
//  		data[4][0] = "Stage";
//  		data[4][1] = "admin123";
//  		
//  		data[5][0] = "L6";
//  		data[5][1] = "test123";
  		return data;
  	}
}
