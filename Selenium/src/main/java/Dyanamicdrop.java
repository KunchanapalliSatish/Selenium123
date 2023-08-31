import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dyanamicdrop {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		// For filpkart
//		driver.get("https://www.flipkart.com/");
//		driver.manage().window().maximize();
//		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Lenovo");
//		//driver.findElement(By.tagName("button")).click();
//		
//		
//       List<WebElement> element= driver.findElements(By.xpath("//input[@value='lenovo laptop']"));
//		System.out.println(element.size());
		// for Amazon 
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("lenovo");
		List<WebElement> element =driver.findElements(By.xpath("//div[@class='s-suggestion s-suggestion-ellipsis-direction']"));
		
		for( WebElement ele:element) {
			Thread.sleep(3000);
			if (ele.getText().equals("lenovo thinkpad")) {
				ele.click();
			}
		}
		

	}

}
