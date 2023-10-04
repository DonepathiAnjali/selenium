package basics;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Waitss {


	public static void main(String[] args) throws Throwable {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.id("alert")).click();

		WebDriverWait waits = new WebDriverWait(driver,Duration.ofSeconds(10));

		Alert element=waits.until(ExpectedConditions.alertIsPresent());

		Thread.sleep(2000);

		driver.switchTo().alert().accept();

		System.out.println("alert handled");



		//Text display//

		driver.findElement(By.id("populate-text")).click();

		WebElement text=driver.findElement(By.className("target-text"));

		waits.until(ExpectedConditions.textToBePresentInElement(text, "Selenium Webdriver"));

		System.out.println(text.isDisplayed());




		//Button Display//

		driver.findElement(By.id("display-other-button")).click();

		WebElement button=driver.findElement(By.id("hidden"));

		waits.until(ExpectedConditions.visibilityOf(button));

		System.out.println(button.isDisplayed());




		//enable button//

		driver.findElement(By.id("enable-button")).click();

		WebElement enablebutton=driver.findElement(By.id("disable"));

		waits.until(ExpectedConditions.elementToBeClickable(enablebutton));

		System.out.println(enablebutton.isEnabled());




		//checkbox//

		driver.findElement(By.id("checkbox")).click();

		WebElement checkbox=driver.findElement(By.id("ch"));

		waits.until(ExpectedConditions.elementToBeSelected(checkbox));

		System.out.println(checkbox.isSelected());


	}


}


