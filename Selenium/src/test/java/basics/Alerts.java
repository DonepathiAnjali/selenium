package basics;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Alerts {

	public static void main(String[] args) throws Throwable {

		WebDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();

		driver.get("https://testautomationpractice.blogspot.com/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		// Handling the alert
		driver.findElement(By.xpath("//button[@onclick='myFunctionAlert()']")).click();

		Thread.sleep(3000);

		driver.switchTo().alert().accept();

		// Handling the Confirmbox 
		Thread.sleep(3000);

		driver.findElement(By.xpath("//button[@onclick='myFunctionConfirm()']")).click();

		driver.switchTo().alert().accept();


		//handling the prompt//

		driver.findElement(By.xpath("//button[@onclick='myFunctionPrompt()']")).click();

		Thread.sleep(3000);

		Alert alerts=driver.switchTo().alert();

		alerts.sendKeys("Doremon");


	}





}


