package ptc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) throws Throwable 
	{
		WebDriver driver=new ChromeDriver();
		//method 1: get()-->lanching the application
		driver.get("https://www.saucedemo.com/v1/ ");
		Thread.sleep(2000);
		// Maximize the screen
		driver.manage().window().maximize();
		// Xpath by Attribute
		driver.findElement(By.xpath("//input[@placeholder=\"Username\"]")).sendKeys("standard_user");
		//driver.findElement(By.xpath("")).sendKeys("");


	}

}
