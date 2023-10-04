import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickCountryInWebTable {
	public static void main(String[] args) {
		// Set the path to the ChromeDriver executable
		
		// Create a WebDriver instance (in this case, for Chrome)
		WebDriver driver = new ChromeDriver();

		// Navigate to the webpage with the web table
		driver.get("https://cosmocode.io/automation-practice-webtable/");

		// Replace the URL above with the actual URL of your webpage.
		// Replace these selectors with the appropriate CSS or XPath selectors for your table structure
		WebElement table = driver.findElement(By.cssSelector("table"));
		java.util.List<WebElement> rows = table.findElements(By.tagName("tr"));

		String targetCountry = "India"; // Replace with the name of the country you want to click

		for (WebElement row : rows) {
			List<WebElement> columns = row.findElements(By.xpath("//td[@style='width: 134.667px']"));
			for (WebElement column : columns) {
				String cellText = column.getText();
				if (cellText.equals(targetCountry)) {
					// Perform a click action on the desired element (e.g., a link or a button)
					column.click();
					break; // You found the country, so exit the loop
				}
			}
		}


	}
}
