

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

		public class frame {
		public static void main(String[] args) throws InterruptedException {
			
			 WebDriverManager.chromedriver().setup();
				
				WebDriver driver= new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
				
				WebElement fram=driver.findElement(By.xpath("//iframe[@src='https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html']"));
				
				driver.switchTo().frame(fram);
				
				WebElement dropdown=driver.findElement(By.id("selectnav1"));
				
				Select sel=new Select(dropdown);
				
				sel.selectByVisibleText("c-- TestNG");
				
				driver.switchTo().defaultContent();
				
				
				driver.findElement(By.id("name")).sendKeys("krish");
				Thread.sleep(3000);
				//driver.close();
				

	}

}
