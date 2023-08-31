package TestNg;

import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowsing {
  
  	WebDriver driver;

  	@Parameters ("broswerName")
  	
  	@BeforeTest
  	
  	public void intilaiseBroswer (@Optional("chrome") String broswerName)  {
  		switch (broswerName.toLowerCase()) {
  		case "chrome" : 
  			WebDriverManager.chromedriver().setup();
  			 driver = new ChromeDriver();
  			break;
  		case "edge" : 
  			WebDriverManager.edgedriver().setup();
  			 driver = new EdgeDriver();
  			break;
  		case "firefox" : 
  			WebDriverManager.firefoxdriver().setup();
  			 driver = new FirefoxDriver();
  			break;
  			
  			default:
  				System.err.println ("Broswer name is invaild");
  				break;
  			
  			
  		
  		}
//  		WebDriverManager.chromedriver().setup();
// 		 driver = new ChromeDriver();
  		driver.manage().window().maximize();
  		
  	}
      @Parameters("sleepTime")
  	@AfterTest
  	
  	public void TearDown(long sleepTime) throws Exception  {
      	System.out.println(sleepTime);
      	Thread.sleep(sleepTime);
  		driver.quit();
  		
  	}
  	
  	@Parameters ("url")
  	@Test
  	
  	public void LaunchApp (String url) {
  		
  		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
  		driver.get(url);
  	}
  	
  	@Parameters ({"username" , "password"})
  	@Test
  	public void EnterLoginDetails (String username , String password) throws Exception {
  		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
  		
  		Thread.sleep(3000);
  		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(username);
  		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
  		Thread.sleep(3000);
  		driver.findElement(By.xpath("//button[@type='submit']")).click();
  	}
  	
  	@Test
  	public void NavigateToMyInfo () {
  	 driver.findElement(By.xpath("//a[@class='oxd-main-menu-item active']")).click();
  	 
  	}
  	
  	@Test
  	public void VerifyMyInfo () {
  		boolean actualValue = driver.findElement(By.className("orangehrm-background-container")).isDisplayed();
  		assertTrue(actualValue);
  		
  	}
  	
  	@Test
  	
  	public void VerifyLogin () {
  		WebElement element = driver.findElement(By.xpath("//p[text()='hffy CollingsKeneS ']"));
  		assertTrue(element.isDisplayed());
  		assertTrue(element.getText().startsWith("hffy"));
  		
  	}

  }


