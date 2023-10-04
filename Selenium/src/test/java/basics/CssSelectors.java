package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectors {

	public static void main(String[] args)  {


		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://testautomationpractice.blogspot.com/");

		driver.findElement(By.cssSelector("[id='name']")).sendKeys("Anjali Donepathi");

		driver.findElement(By.cssSelector("[id='email']")).sendKeys("anjalidonepathi@gmail.com");

		driver.findElement(By.cssSelector("[id='phone']")).sendKeys("9133223322");

		driver.findElement(By.xpath("//textarea[@id='textarea']")).sendKeys("Hyderabad");

		driver.findElement(By.id("female")).click();
		
		List<WebElement> checkboxes = driver.findElements(By.cssSelector("input[value*='day']"));
		for (int i = 0; i < 7; i++) {
			checkboxes.get(i).click();
}

		

	}



}


