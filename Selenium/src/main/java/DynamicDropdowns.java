import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicDropdowns {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		WebDriver  driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//driver.findElement(By.className("react-autosuggest__input react-autosuggest__input--open")).click();
		//driver.findElement(By.xpath("//input[@class='react-autosuggest__input react-autosuggest__input--open']")).click();
		//driver.findElement(By.id("root")).click();
	//	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@class='imageSlideContainer']")).click();
	Thread.sleep(3000);
		//driver.findElement(By.xpath("//span[text()='From']")).click();
		


	}

}
