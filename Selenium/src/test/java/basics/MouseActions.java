package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();

		driver.get("https://testautomationpractice.blogspot.com/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//movetoElement//
		//WebElement hover=driver.findElement(By.xpath("Selenium"));
		//Actions Ac = new Actions (driver);
		//Ac.moveToElement(hover).perform();
		
		//DoubleClick//
		//WebElement doubleClick=driver.findElement(By.xpath("//button[@ondblclick='myFunction1()']"));
		//Actions Ac = new Actions (driver);
		//Ac.doubleClick(doubleClick).build().perform();	
		
		//DragAndDrop//
		//WebElement source=driver.findElement(By.id("draggable"));
		//Actions Ac = new Actions (driver);
		//WebElement destination=driver.findElement(By.id("droppable"));
		//Actions Ac = new Actions (driver);
		//Ac.dragAndDrop(source, destination).perform();
		
		
        //rightclick---ContextClick//
		WebElement rightClick=driver.findElement(By.id("name"));
		Actions Ac = new Actions (driver);
		Ac.contextClick(rightClick).perform();
		
		
	}

}
