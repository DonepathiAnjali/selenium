package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		int row=driver.findElements(By.xpath("//table[@id='countries']/tbody/tr")).size();
		System.out.println(row);
		
		int coloumn=driver.findElements(By.xpath("//table[@id='countries']//tr[1]/td")).size();
		System.out.println(coloumn);
		
		Cellvalue(driver,"78","2");
		checkboxes(driver,"78");
	}
	public static void Cellvalue(WebDriver driver,String rownum,String collnum)
	{
		WebElement cellvalue=driver.findElement(By.xpath("//table[@id='countries']//tr["+rownum+"]//td["+collnum+"]"));
		System.out.println(cellvalue.getText());
	}
	public static void checkboxes(WebDriver driver,String rownum)
	{
		driver.findElement(By.xpath("//table[@id='countries']//tr["+rownum+"]//td[1]//input")).click();
	}


}

