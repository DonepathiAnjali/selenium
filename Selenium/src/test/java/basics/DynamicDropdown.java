package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdown {

	public static void main(String[] args) {
		
		
        WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.id("APjFqb")).sendKeys("Vespa");
		
		List<WebElement> options = driver.findElements(By.xpath("//div[@class='wM6W7d']//b"));
		
		System.out.println(options.size());
		
		for(WebElement list : options) {
			
			System.out.println(list.getText());
			
			if (list.getText().contains("price")) {
				
				list.click();
				
				break;
				
			}
			
		}
		
		
		

	}

}
