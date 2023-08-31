import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

import javax.swing.JWindow;
import javax.swing.text.Document;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class iteraSeleniumPractice {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		driver.manage().window().maximize();
     	driver.findElement(By.id("name")).sendKeys("Satish");
		driver.findElement(By.id("phone")).sendKeys("9949130551");
		driver.findElement(By.id("email")).sendKeys("Satish99.Marolix@gmail.com");
		driver.findElement(By.id("password")).sendKeys("12345");
		driver.findElement(By.id("address")).sendKeys("Rajamundry");
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='female']")).click();
		
		 List<WebElement> week = driver.findElements(By.xpath("//input[@class='form-check-input']"));
		 for (int i=3; i<week.size()-2; i++) {
			 week.get(i).click();
		 }
		//driver.findElement(By.id("saturday")).click();
		WebElement dropdown=driver.findElement(By.xpath("//select[@class='custom-select']"));
		Select sel=new Select(dropdown);
		sel.selectByVisibleText("Spain");
		//sel.selectByValue("3");
		//sel.selectByIndex(5);
		driver.findElement(By.xpath("//label[text()='2 years']")).click();
		  List<WebElement> framework = driver.findElements(By.xpath("//label[@class='custom-control-label']"));
		   for (WebElement frame: framework) {
			   if   (frame.getText().equals("Selenium Webdriver") || frame.getText().equals("TestNG")) {
			   frame.click();
			   }
		   }
		
		//driver.findElement(By.xpath("//label[text()='Selenium Webdriver']")).click();   // we try at in  this way also
		//driver.findElement(By.xpath("//label[@for='testng']")).click();
		
		Thread.sleep(3000);
//
////JavascriptExecutor js = (JavascriptExecutor) driver;
// //js.executeScript("window., args)
//
//				Robot robo=new Robot();
		Thread.sleep(3000);
				driver.findElement(By.xpath("//input[@class='custom-file-input']")).click();
//				robo.delay(3000);
//			
//				StringSelection upload=new StringSelection("C:\\Users\\Admin\\Documents.docx");
//				Toolkit.getDefaultToolkit().getSystemClipboard().setContents(upload, null);
//				robo.keyPress(KeyEvent.VK_CONTROL);
//				robo.keyPress(KeyEvent.VK_V);
//				robo.keyRelease(KeyEvent.VK_CONTROL);
//				robo.keyRelease(KeyEvent.VK_V);
//				robo.keyPress(KeyEvent.VK_ENTER);
//				robo.keyRelease(KeyEvent.VK_ENTER);
				
			}

		

		

	}


