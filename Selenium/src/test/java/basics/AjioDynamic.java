package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AjioDynamic {

	public static void main(String[] args) throws Throwable {
		WebDriver  driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.get("https://www.ajio.com/");
		
		WebElement women= driver.findElement(By.xpath("//input[@placeholder='Search AJIO']"));
		
				women.sendKeys("T-shirts");
				
				women.click();
				
				Thread.sleep(3000);
				
				List<WebElement>dropdown=driver.findElements(By.className("search-suggestionList"));
				
				System.out.print(dropdown.size());
				
				Thread.sleep(3000);
				
				for(WebElement list : dropdown) {
					
					System.out.println(list.getText());
					
					if(list.getText().contains("T-shirts"))
					{
						list.click();
						break;
						
					}
					
				}
				

	}

}
