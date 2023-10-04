package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbstractMethods {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		
		driver.manage().window().minimize();
		
		driver.manage().window().fullscreen();
		
		String title=driver.getTitle();
		
		String url =driver.getCurrentUrl();
		
		System.out.println(title);
		
		System.out.println(url);
		
		System.out.println(driver.getPageSource());
		
		driver.close();
		
		String window = driver.getWindowHandle();
		
		System.out.println(window);
		

	}

}
