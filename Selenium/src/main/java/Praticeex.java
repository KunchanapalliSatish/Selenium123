import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class Praticeex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\geckodriver.exe");
//
//		
		WebDriver driver = new FirefoxDriver();
	driver.get("https://www.google.com/");
    
		//System.setProperty("webdriver.gecko.driver","C:\\Users\\Admin\\Downloads\\geckodriver-v0.33.0-win64\\geckodriver.exe");

//		FirefoxOptions options = new FirefoxOptions();
//		FirefoxProfile profile = new FirefoxProfile(new File("C:\\Users\\Admin\\Downloads\\geckodriver-v0.33.0-win64"));
//		options.setProfile(profile);
//		WebDriver driver = new FirefoxDriver(options);


		//driver.get("http://seleniumhq.com");
		
	}

}
