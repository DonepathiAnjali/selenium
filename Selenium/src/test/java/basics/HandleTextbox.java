package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleTextbox {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(3000);
		
		WebElement usernameTxt=driver.findElement(By.id("email"));
		
	//	if(usernameTxt.isDisplayed()) {
			
			//if(usernameTxt.isEnabled()) {
				
				usernameTxt.sendKeys("Anju");
				
				String enteredTxt = usernameTxt.getAttribute("value");
				
				System.out.println(enteredTxt);
				
				Thread.sleep(3000);
				
				usernameTxt.clear();
				
			}
			
		

	

	}
	


