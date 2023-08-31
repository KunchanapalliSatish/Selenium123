package TestNg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowsing2 {
	WebDriver driver;
  @Test 
  @Parameters("browser")
  public void browswertest(String browsername) {
  
  if( browsername.equalsIgnoreCase("Firefox")) {
	  WebDriverManager.firefoxdriver().setup();
	  driver = new FirefoxDriver();
	  
  }
  else  if( browsername.equalsIgnoreCase("chrome")) {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
  }
  else if( browsername.equalsIgnoreCase("edge")) {
	  WebDriverManager.edgedriver().setup();
	  driver = new EdgeDriver();
}
  driver.manage().window().maximize();
  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
  driver.findElement(By.name("username")).sendKeys("Admin");
  driver.findElement(By.name("password")).sendKeys("admin123");
  driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
  String url = driver.getCurrentUrl();
  Assert.assertEquals(url,"https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
  }
  @AfterTest
  public void logout () throws Exception {
	  Thread.sleep(3000);
	  driver.close();
  }
}
