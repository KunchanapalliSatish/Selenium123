package TestNg;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;


public class MakemyTrip {
  

	 
	
	    @Test
	    public void makemytriptest() throws Exception {
	  	  WebDriverManager.chromedriver().setup();
	  	  WebDriver driver = new ChromeDriver();
	  		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  		 driver.get("https://www.makemytrip.com/flights/");
	  		 driver.manage().window().maximize();
	  		 driver.findElement(By.xpath("//span[@class='langCardClose']")).click();
	  		 driver.findElement(By.xpath("//li[@class='selected']")).click();
	  		 Thread.sleep(3000);
	  		 driver.findElement(By.xpath("//span[@class='lbl_input latoBold  appendBottom5']")).click();
	  		 Thread.sleep(3000);
	  		// driver.findElement(By.xpath("//div[@value='BOM']")).click();
	  		    driver.findElement(By.xpath("//div[text()='HYD']")).click();
	  		    Thread.sleep(3000);
	  		   driver.findElement(By.xpath("//div[text()='GOI']")).click();
	  		    Thread.sleep(3000);
	  		   driver.findElement(By.xpath("//div[@class='DayPicker-Day']")).click();
	  		   Thread.sleep(3000);
	  		  // driver.findElement(By.xpath("//a[class='primaryBtn font24 latoBold widgetSearchBtn']" )).click();
	  		   //driver.findElement(By.xpath("//div[text()='Search']")).click();
	  		   driver.findElement(By.xpath("//a[@class='primaryBtn font24 latoBold widgetSearchBtn ']")).click();
	  		   driver.findElement(By.xpath("//button[@class='button buttonSecondry buttonBig fontSize12 relative']")).click();
	           driver.quit();
	    }
	    @BeforeMethod
	    public void beforeMethod() {
	  	  System.out.println("before method");
	    }

	  

  }

