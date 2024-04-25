package PopUps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPop 
{

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/upload ");;
		WebElement choosefile = driver.findElement(By.xpath("//input[@id=\"file-upload\"]"));
		choosefile.sendKeys("C:\\Users\\admin\\Downloads\\LOCATORS11am.txt");
		driver.findElement(By.xpath("//input[@id=\"file-submit\"]")).click();

	}

}
