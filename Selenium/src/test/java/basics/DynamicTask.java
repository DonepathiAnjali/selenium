package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTask {

		public static void main(String[] args) throws Throwable {
	 
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://www.meesho.com/");
			
			WebElement women= driver.findElement(By.xpath("(//input[@type='text'])[1]"));
			
					women.sendKeys("shirts");
					
					women.click();
					
					Thread.sleep(3000);
					
					List<WebElement>dropdown=driver.findElements(By.xpath("//div[@class='sc-cOxWqc bLdIZq']/p"));
					
					System.out.print(dropdown.size());
					
					Thread.sleep(3000);
					
					for(WebElement list : dropdown) {
						
						System.out.println(list.getText());
						
						if(list.getText().contains("shirts for women"))
						{
							list.click();
							break;
							
						}
						
					}
					
					
					
		}




	}






