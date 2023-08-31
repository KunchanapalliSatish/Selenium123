import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleDrop {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/search");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// driver.findElement(By.id("APjFqb")).sendKeys("Google" , Keys.ENTER);
		// driver.findElement(By.tagName("h3")).click();
		driver.findElement(By.id("APjFqb")).sendKeys("flights");
		Thread.sleep(3000);
		List<WebElement> element = driver.findElements(By.xpath("//div[@class='wM6W7d']//b"));
		System.out.println(element.size());
		for (WebElement ele : element) {
			System.out.println(ele.getText());
			// Thread.sleep(3000);
			 if (ele.getText().equalsIgnoreCase("from vijayawada to bangalore")) {
			// Thread.sleep(3000);
			 ele.click();
			 break;
		}

	}

}
}
