import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AbhiBbusTicketBooking {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.abhibus.com/");
		driver.manage().window().maximize();;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.id("source")).sendKeys("Ravulapalem");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[text()='Ravulapalem']")).click();
		driver.findElement(By.id("destination")).sendKeys("Hyderabad");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[text()='Hyderabad']")).click();
		driver.findElement(By.id("datepicker1")).click();
		List<WebElement> days = driver.findElements(By.xpath("//td[@data-month='7']"));
		for (WebElement Days:days) {
			if ( Days.getText().equalsIgnoreCase("16")) {
				Days.click();
				break;
			}
		}
		driver.findElement(By.xpath("//a[@class='btn btn-main px-5 py-2 border-right-radius']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("Bustypes1")).click();
		driver.findElement(By.id("Bustypes3")).click();
		driver.findElement(By.id("startTime3")).click();
		List<WebElement> bus = driver.findElements(By.xpath("//div[@class='col2 column-middle']"));
		for (WebElement Bus:bus) {
			if( Bus.getText().contains("SAI SRI KRISHNA TRAVELS")) {
				driver.findElement(By.id("1649097047")).click();
				break;
			}
					
		}
		driver.findElement(By.id("O5-4ZZ")).click();
		 WebElement board= driver.findElement(By.id("boardingpoint_id"));
		 Select sct = new Select(board);
		 sct.selectByIndex(1);
		  WebElement drop= driver.findElement(By.id("droppingpoint_id"));
		  Select Drop = new Select(drop);
		  Drop.selectByVisibleText("S R NAGAR-06:05");
		  driver.findElement(By.id("btnEnable1")).click();
 

	}

}
