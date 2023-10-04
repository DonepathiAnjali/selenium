package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrames {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		WebElement frame=driver.findElement(By.id("frm2"));

		driver.switchTo().frame(frame);

		driver.findElement(By.id("firstName")).sendKeys("Anjali");

		driver.findElement(By.id("lastName")).sendKeys("Donepathi");

		driver.findElement(By.id("femalerb")).click();

		driver.findElement(By.id("englishchbx")).click();

		driver.findElement(By.name("email")).sendKeys("anjalidonepathi@gmail.com");

		driver.findElement(By.id("password")).sendKeys("Dora123");

		driver.switchTo().defaultContent();

		driver.findElement(By.id("name")).sendKeys("AnjaliKrishna");
		
	
		

	}

}
