package TestNg1;

import java.time.Duration;
import java.util.List;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebTablesTest2 {
	WebDriver driver;
  @Test
  public void webtable() {
	   driver = new ChromeDriver();
	   driver.get("https://cosmocode.io/automation-practice-webtable/");
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	   List<WebElement> countrys = driver.findElements(By.xpath("//table[@id='countries']/tbody/tr"));
	   int row= countrys.size();
	   System.out.println(row);
	      String beforeXpathcountry ="//*[@id='countries']/tbody/tr[";
		  String afterXpathcountry  = "]";
		  String beforeXpathcheck ="//*[@id='countries']/tbody/tr[";
		  String afterXpathcheck  = "]/td[1]/input";
		  
		  for (int i=2; i<countrys.size(); i++) {
			  String Actualpath = beforeXpathcountry +i+ afterXpathcountry;
			  
			  WebElement ele = driver.findElement(By.xpath(Actualpath));
			   // System.out.println(ele.getText());
			  
			  if (ele.getText().contains("Singapore")) {
				  String actualcheck= beforeXpathcheck+i+afterXpathcheck ;
				  WebElement element= driver.findElement(By.xpath(actualcheck));
				  element.click();
				  break;
			  }
			    
		  }
		  
	  
	  
  }
}
