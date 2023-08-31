package TestNg1;

  import org.testng.annotations.Test;
  import java.io.File;
  import java.io.IOException;

  import org.apache.commons.io.FileUtils;
  import org.openqa.selenium.OutputType;
  import org.openqa.selenium.TakesScreenshot;
  import org.openqa.selenium.WebDriver;
  import org.openqa.selenium.chrome.ChromeDriver;
  import org.testng.annotations.AfterTest;
  import org.testng.annotations.BeforeTest;

  import io.github.bonigarcia.wdm.WebDriverManager;

  public class BaseTest {
  	public static WebDriver driver;
  	
  	@BeforeTest
  	public void setup() {
  		WebDriverManager.chromedriver().setup();
  		 driver = new ChromeDriver();
  		driver.manage().window().maximize();
  		
  	}
  	@AfterTest
  	public void teardown() throws Throwable {
  		Thread.sleep(2000);
  		driver.close();
  		
  	}
  	public void captureScreenshot(String fileName) {
  		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
  		File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
  		File destFile = new File("./Screenshots/" + fileName);
  		try {
  			FileUtils.copyFile(sourceFile, destFile);
  		} catch (IOException e) {
  			e.printStackTrace();
  		}
  		System.out.println("Screenshot saved successfully");
  	}

  }


