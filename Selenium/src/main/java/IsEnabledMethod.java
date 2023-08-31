import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.gmail.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
     	driver.manage().window().maximize();
		//isDisplayed() method returns boolean value either True or False
		WebElement element = driver.findElement(By.xpath("//span[text()='Next']"));
		System.out.println(element.isDisplayed());
		//isEnabled() method
		WebElement element2 = driver.findElement(By.xpath("//span[text()='Next']"));
		System.out.println(element2.isEnabled());
		//Passing value as "softwaretestingmaterial" in the email field
		driver.findElement(By.id("identifierId")).sendKeys("satish99.marolix@gmail.com");
		//to click on next button
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		//isSelected() method returns boolean value either True or False
		Boolean Select = driver.findElement(By.xpath("//*[@id='PersistentCookie']")).isSelected();
		System.out.println("Element selected is :"+Select);
		} 
		}

	


