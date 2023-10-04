package basics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowHandles {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();

		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		
		driver.findElement(By.id("newWindowBtn")).click();
		
		Set<String> windows = driver.getWindowHandles();
		
		Iterator<String> it=windows.iterator();
		
		String window1=it.next();
		
		String window2=it.next();
		
		driver.switchTo().window(window2);
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("firstName")).sendKeys("AnjaliKrishna");
		
		Thread.sleep(3000);
		
		driver.switchTo().window(window1);
		
		driver.quit();
		


	}

}
