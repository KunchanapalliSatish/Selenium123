import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class eq {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://e-quarz.com/customer/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.id("si-email")).sendKeys("jakkamsairam3@gmail.com");
		driver.findElement(By.id("si-password")).sendKeys("Namo@12345");
		driver.findElement(By.id("remember")).click();
		Thread.sleep(15000);
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		driver.findElement(By.xpath("//button[@class='close __close']")).click();
		Actions ac= new Actions(driver);
		 WebElement ele = driver.findElement(By.xpath("//span[text()='Electronics']"));
		 ac.moveToElement(ele).build().perform();
		 WebElement ele2 = driver.findElement(By.xpath("//span[text()='Mobile Accessoires']"));
		 ac.moveToElement(ele2).build().perform();
		 driver.findElement(By.xpath("//a[text()='Cases And Covers']")).click();
		 driver.findElement(By.xpath("//img[@src='http://e-quarz.com/storage/app/public/product/thumbnail/2023-06-22-64945be4d2044.png']")).click();
		 driver.findElement(By.xpath("//span[text()='Add to cart']")).click();
		 WebElement ele3= driver.findElement(By.xpath("//i[@class='navbar-tool-icon czi-cart']"));
		 ac.moveToElement(ele3).build().perform();
		 driver.findElement(By.xpath("//a[@href='http://e-quarz.com/checkout-details']")).click();
		 WebElement ele4 = driver.findElement(By.xpath("//select[@class='form-control']"));
		 Select sc = new Select(ele4);
		 sc.selectByIndex(1);
		 Thread.sleep(4000);
		 driver.findElement(By.xpath("//a[@class='btn btn--primary pull-right']")).click();
		 driver.findElement(By.id("same_as_shipping_address")).click();
		 driver.findElement(By.xpath("//span[text()='Proceed payment']")).click();
		
		
		

	}

}
