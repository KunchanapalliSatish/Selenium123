package listenersss;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IexecutionlistenersTest2 {
	WebDriver driver;
  @Test
  public void f() throws Exception {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
  driver.manage().window().maximize();
  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
  driver.findElement(By.name("username")).sendKeys("Admin");
  driver.findElement(By.name("password")).sendKeys("admin123");
  driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
  String url = driver.getCurrentUrl();
  Assert.assertEquals(url,"https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
  // Thread.sleep(2000);
  driver.close();
  }
}
