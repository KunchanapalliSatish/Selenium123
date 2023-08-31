import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelectMethodStaticDrop {

	public static void main(String[] args) {
                // For seleciting " Static Dropdowns "
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://itera-qa.azurewebsites.net/home/automation");
				//WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
				WebElement dropdown=driver.findElement(By.xpath("//select[@class='custom-select']"));
				Select sel=new Select(dropdown);
				//sel.selectByVisibleText("Spain");
				//sel.selectByValue("3");
				sel.selectByIndex(5);
			
				
				
				
			
			}
		


	}

