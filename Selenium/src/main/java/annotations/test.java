package annotations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class test {
	WebDriver driver;

	@BeforeMethod


	public void Login(){

		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://poojastore.marolix.com/#");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	

	@Test(dataProvider = "data",dataProviderClass = Demo.class)

	public void test1(String username,String password) {
		driver.findElement(By.linkText("Log In")).click();
	

		driver.findElement(By.xpath("//input[@placeholder='example@gmail.com']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@title='Please enter your password']")).sendKeys(password);
	}


}
