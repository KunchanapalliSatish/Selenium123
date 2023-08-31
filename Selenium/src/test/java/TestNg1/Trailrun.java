package TestNg1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Trailrun {
	WebDriver driver;

  @Test 
  public void Webtabletest() {
   WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://cosmocode.io/automation-practice-webtable/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
  int rowscount=driver.findElements(By.xpath("//table[@id='countries']//tr")).size();
  System.out.println(rowscount);
  int columnscount=driver.findElements(By.xpath("//table[@id='countries']//tr[1]//td")).size();
  System.out.println(columnscount);
  //for(int i=2;i<=rowscount;i++) {
  	//System.out.println(i+":");
  	//for(int j=2;j<=columnscount;j++) {
  		List<WebElement>  value=driver.findElements(By.xpath("//table[@id='countries']"));
  		    	for (WebElement Bus:value) {
  					if( Bus.getText().contains("Colombia")) {
  						driver.findElement(By.xpath("//input[@type='checkbox']")).click();
  						break;
  		    }
}
  
  }
}

