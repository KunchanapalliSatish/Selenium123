package listenersss;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.IExecutionListener;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Iexecutionlisteners implements IExecutionListener {
	WebDriver driver;

	
      @Override
	public void onExecutionStart() {
		System.out.println("Test suite execution started.");
		// Your initialization or setup code here
	}

	
	public void onExecutionFinish() {
		// Your cleanup or reporting code here
		
		String url = driver.getCurrentUrl();
		if (url.equalsIgnoreCase("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index"))
		    driver.close();
		

		System.out.println("Test suite execution finished.");
	}
}
