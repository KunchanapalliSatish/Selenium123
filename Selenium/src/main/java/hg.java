import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class hg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("iphone");
		 List<WebElement> options =  driver.findElements(By.xpath("//div[@class='YGcVZO _2VHNef']//span"));
		 System.out.println(options.size());
		 
		 for (WebElement option: options) {
			 System.out.println(option.getText());
//			 if(option.getText().equalsIgnoreCase("iphone")) {
//				 option.click();
				 break;
			 }
		 }
		 

	}


