import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonStaticDropdowns {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
//		TakesScreenshot shot = (TakesScreenshot) driver;
//		File
//		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Gardenpots");
//		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.id("searchDropdownBox")).click();
	    driver.findElement(By.xpath("//option[text()='Car & Motorbike']")).click();
	    Thread.sleep(3000);
	    driver.close();
	}

}
