package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class clickoncountry {
	@Test

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		int rows = driver.findElements(By.xpath("//table[@id='countries']/tbody/tr")).size();
		System.out.println(rows);
		
		int coloumns = driver.findElements(By.xpath("//table[@id='countries']//tr[1]/td")).size();
		System.out.println(coloumns);

		for(int i=2;i<=rows;i++)
		{
			for(int j=2;j<=coloumns;j++)
			{
				String value = driver.findElement(By.xpath("//table[@id='countries']//tr["+i+"]/td["+j+"]")).getText();
				
				//System.out.println(value);
				
				if(value.contains("South Korea"))
				{
					checkboxes(driver,i);
					
					break;
				}
			}
		}
	}
	public static void checkboxes(WebDriver driver,int i)
	{
		driver.findElement(By.xpath("//table[@id='countries']//tr["+i+"]//td[1]//input")).click();
		
		
	}



}


