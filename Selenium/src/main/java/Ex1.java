import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.findElement(By.id("APjFqb")).sendKeys("Lenova");
		

		List<WebElement> element = driver.findElements(By.xpath("//div[@class='lnnVSe']//b"));
		
		System.out.println(element.size());

		for (WebElement ele : element) {
			
			System.out.println(ele.getText());
			
			
			if (ele.getText().equals("service center")) {
				ele.click();

			}
		}


	}

}
