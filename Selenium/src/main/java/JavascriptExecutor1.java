import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.annotations.VisibleForTesting;

public class JavascriptExecutor1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		{


		      
		            WebDriver driver = new ChromeDriver();
		            driver.get("https://www.amazon.in/");
		            driver.manage().window().maximize();
		            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		            //to perform Scroll on application using Selenium
		            JavascriptExecutor js = (JavascriptExecutor) driver;
		            js.executeScript("window.scrollBy(0,500)");
		         }
		}

	}


