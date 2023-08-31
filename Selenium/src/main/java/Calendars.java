

		import java.time.Duration;
		import java.util.List;

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;

		public class Calendars {

			public static void main(String[] args) {
				WebDriver driver = new ChromeDriver();
				driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
				driver.findElement(By.id("second_date_picker")).click();
//				String day="21";
//				String month="january";
//				String year="2024";
				while (true) {
					String calender = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
					String[] cal = calender.split(" ");
					String months = cal[0];
					String years = cal[1];
					if (months.equalsIgnoreCase("August") && years.equalsIgnoreCase("2023")) {
						break;

					} else {
						driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
					}

				}

				List<WebElement> day = driver.findElements(By.xpath("//td[@data-handler='selectDay']"));
				for (WebElement days : day) {
					if (days.getText().equalsIgnoreCase("16")) {
						days.click();
						break;
					}
				}
			}

		


	}

