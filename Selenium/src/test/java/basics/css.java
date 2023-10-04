package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class css {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://testautomationpractice.blogspot.com/");

		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Donepathi Anjali");

		driver.findElement(By.cssSelector("#email")).sendKeys("anjalidora@gmail.com");

		driver.findElement(By.cssSelector("#phone")).sendKeys("9933445566");

		driver.findElement(By.xpath("//textarea[@id='textarea']")).sendKeys("Hyderabad");

		driver.findElement(By.xpath("//input[@id='female']")).click();

		driver.findElement(By.xpath("//div[@class='form-check form-check-inline'][5]")).click();

		List<WebElement> checkboxes = driver.findElements(By.cssSelector("input[value*='day']"));
		for (int i = 0; i < 7; i++) {
			checkboxes.get(i).click();
		}

	}
}
