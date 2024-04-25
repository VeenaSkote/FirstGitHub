package ptc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipKart {

	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver=new ChromeDriver();
		//method 1: get()-->lanching the application
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		// Maximize the screen
		driver.manage().window().maximize();
		
		
		//xpath by text() method Syntax://HTMLTag[text()="AttributrValue"]
		//driver.findElement(By.xpath("//span[text()=\"Grocery\"]")).click();
		//amzon appliction
		//driver.findElement(By.xpath("//a[text()=\"Amazon miniTV\"]")).click();
		
		//xpath by containes Attribute Syntax://HTMLTag[contains(@AttributeName,"AttributeValue")]
		//driver.findElement(By.xpath("//input[contains(@title,\"Search for \")]")).sendKeys("Nike");
		//xpath by containes Text() method Syntax://HTMLTag[contains(text(),"AttributeValue")]
		driver.findElement(By.xpath("//input[contains(@title,\"Search for \")]"));
		driver.findElement(By.xpath("//span[contains(text(),\"Mob\")]")).click();


	}

}
