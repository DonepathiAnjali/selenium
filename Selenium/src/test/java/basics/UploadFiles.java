package basics;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFiles {

	public static void main(String[] args) throws Throwable {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.filemail.com/share/upload-file");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.findElement(By.xpath("//span[text()='Add Files']")).click();

		Robot uploadfile = new Robot();

		uploadfile.delay(3000);

		StringSelection path = new StringSelection("C:\\Users\\DELL LATITUDE E7470\\Downloads\\9 tips for writing good test cases.pdf");

		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(path, null);

		uploadfile.keyPress(KeyEvent.VK_CONTROL);
		uploadfile.keyPress(KeyEvent.VK_V);

		uploadfile.keyRelease(KeyEvent.VK_CONTROL);
		uploadfile.keyRelease(KeyEvent.VK_V);

		uploadfile.keyPress(KeyEvent.VK_ENTER);
		uploadfile.keyRelease(KeyEvent.VK_ENTER);



	}

}
