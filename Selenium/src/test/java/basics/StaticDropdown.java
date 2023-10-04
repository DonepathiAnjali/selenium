package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdown {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		WebElement country = driver.findElement(By.id("country"));
		
		///country.click();
		
		Select sel = new Select(country);
		
		//sel.selectByVisibleText("india");
		
		
		
		
		
		//sel.selectByValue("search-alias=popular");
		
		sel.selectByIndex(9);
		
		
		

	}

}
