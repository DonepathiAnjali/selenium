package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		List<WebElement> tags=driver.findElements(By.tagName("div"));
		
	    driver.findElement(By.id("email")).sendKeys("AnjaliDonepathi");
		
		driver.findElement(By.id("pass")).sendKeys("123456");
		
		driver.findElement(By.linkText(null));
		
		
	}
	
		//for(WebElement tag:tags) {
			
			
	   //System.out.println(tag.getText());
			
		
		//List<WebElement>tags=driver.findElements(By.tagName("meta"));
		
		
		//for(WebElement tag:tags) {
			
		
		//System.out.println(tag.getText());
	
		
		//driver.findElement(By.id("text")).sendKeys("Anjali@gmail.com");
		
		}


	


