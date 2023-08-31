package TestNg1;

import org.testng.annotations.Test;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTables {
	WebDriver driver;
  @Test
  public void webtables() throws Exception {



	  
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  
	  driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html"); // By using Xpath with index we have to find elements in web tables
	  driver.manage().window().maximize();
	  Thread.sleep(3000);
	  
	  driver.findElement(By.xpath("//table[@id='contactList']/tbody/tr[4]")).click();
	WebElement rows = driver.findElement(By.xpath(("//table[@id='contactList']/tbody/tr/td)[23]"))); // for identifying some element in the web table we have write x path like tihs
	  
	
}

  }

