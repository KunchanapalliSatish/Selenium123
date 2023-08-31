package TestNg1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTablelsPractice {
	@Test
	  public void webtabletest () {
	WebDriver driver;
	

	  
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  driver.manage().window().maximize();
	  
	  driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html"); // By using Xpath with index we have to find elements in web tables
	  JavascriptExecutor js=(JavascriptExecutor)driver;
	  js.executeScript("window.scrollBy(0,1700)");
	  
	  List<WebElement> rows = driver.findElements(By.xpath("//*[@id='contactList']/tbody/tr"));
	  int rowCount= rows.size(); //7
	 System.out.println(rowCount);
	  
	  String beforeXpathcountry ="//*[@id='contactList']/tbody/tr[";
	  String afterXpathcountry  = "]";
	  String beforeXpathcheck ="//*[@id='contactList']/tbody/tr[";
	  String afterXpathcheck  = "]/td[1]/input";
	  
	  for (int i =2; i<rowCount;i++ ) {
		  String ActualXpath= beforeXpathcountry + i + afterXpathcountry;
		  
		   WebElement element = driver.findElement(By.xpath(ActualXpath));
		  // System.out.println(element.getText());
		   
		   
		   if(element.getText().contains("5000")&&element.getText().contains("Canada"))
		   {
			   String actualcheck=beforeXpathcheck+i+afterXpathcheck;
			   WebElement check=driver.findElement(By.xpath(actualcheck));
			   check.click();
			   break;
		   }
		   
	  }
	  
	  
		
	  }
}

