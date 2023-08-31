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

	public class WebTables1 {
	  @Test
	  public void webtable() throws Exception {
		  
		  
	WebDriver driver;
		  
		  WebDriverManager.chromedriver().setup();
		  driver = new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		  
		  driver.get("https://demo.guru99.com/test/web-table-element.php"); // By using Xpath with index we have to find elements in web tables
		  
		 //no.of columns
		  List col =driver.findElements(By.xpath(".//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
		  System.out.println("No col's are :" + col.size());
		  
		  List rows = driver.findElements(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr/td[1]"));
		  System.out.println("No Rows are : "+ rows.size() );
	  }
		  
	  @Test
		  public void webtabletest () {
	WebDriver driver;
		  
		  WebDriverManager.chromedriver().setup();
		  driver = new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		  driver.manage().window().maximize();
		  
		  driver.get("https://www.w3schools.com/html/html_tables.asp"); // By using Xpath with index we have to find elements in web tables
		  
		  List<WebElement> rows = driver.findElements(By.xpath("//*[@id='customers']/tbody/tr"));
		  int rowCount= rows.size(); //7
		  
		  String beforeXpath ="//*[@id='customers']/tbody/tr[";
		  String afterXpath  = "]/td[1]";
		  
		  for (int i =2; i<rowCount; i++) {
			  String ActualXpath= beforeXpath + i + afterXpath;
			   WebElement element = driver.findElement(By.xpath(ActualXpath));
			   System.out.println(element.getText());
			   
			   if(element.getText()=="Island Trading");
			   {
				   System.out.println("company name is" + element.getText()+"found");
				   break;
			   }
			   
		  }
		  
		  
			
		  }

		  
		  
	  


  @Test
  public void f() {
  }
}
