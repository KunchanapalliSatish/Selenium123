import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://hospiol.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//a[text()='Patient login ']")).click();
		
		driver.findElement(By.id("email")).sendKeys("satish99.marolix@gmail.com");
		
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.tagName("button")).click();
	 WebElement e= driver.findElement(By.xpath("//div[text()='Invalid Username or Password']"));
	 System.out.println(e.getText());
		
		driver.close();

	}

}
