import java.time.Duration;

import javax.swing.text.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynaimcDropdownPratice {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub


	
			
				WebDriver  driver=new ChromeDriver();
				driver.manage().window().maximize();
				
				driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
				//WebDriverWait wat= new WebDriverWait(driver, 15);
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			
			   //	driver.findElement(By.id("display-other-button")).click();
			    //Thread.sleep(10);
				//WebElement element=driver.findElement(By.id("hidden"));
				driver.findElement(By.id("enable-button")).click();
				//wait.until(ExpectedConditions.visibilityOf(element));
				//Thread.sleep(10);
			
				//System.out.println(element.isDisplayed());
				
			}

		



	}


