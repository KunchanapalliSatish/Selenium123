import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Marolix {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://hr.marolix.com/hrm-dashboard");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.id("email")).sendKeys("satish99.marolix@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456789");
		driver.findElement(By.id("login_button")).submit();
		Thread.sleep(3000);
		//driver.findElement(By.id("clock_out"));
//		driver.findElement(By.xpath("//span[text()='Dashboard']")).click();
//		driver.findElement(By.xpath("//a[text()='HRM ']")).click();
//		driver.findElement(By.xpath("//a[text()=' Overview']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("clock_in"));
	}

}
