import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpicejetDrop {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver  driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ixigo.com/flights");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.findElement(By.xpath("//div[text()='From']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='HYD']")).click();
		
		

	}

}
