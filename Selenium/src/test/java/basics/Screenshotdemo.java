package basics;

import java.io.File;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Screenshotdemo {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		File Source =ts.getScreenshotAs(OutputType.FILE);
		
		File Destination = new File("./src/Screenshots/test.png");
		
		FileUtils.copyFile(Source, Destination);
		
		
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,300)");

	}

}
