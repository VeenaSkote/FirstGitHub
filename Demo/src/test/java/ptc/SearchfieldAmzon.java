package ptc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchfieldAmzon {

	public static void main(String[] args) throws InterruptedException 
	{
		//Finding element by using locator id()
				//syntax:AttributeName=AttributeValue;
				WebDriver driver=new ChromeDriver();
		//method 1: get()-->lanching the Amzon application
				driver.get("https://www.amazon.in/ ");
				//driver.get("https://www.flipkart.in/");
				Thread.sleep(2000);
				// Maximize the screen
				driver.manage().window().maximize();
				//search field
				//driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
				//search field
				//driver.findElement(By.id("nav-search-submit-button")).click();
				
				//locating the webelements using name() locator
				//syntax:AttributeName=AttributeValue;
				
				//driver.findElement(By.name("field-keywords")).sendKeys("iphone");
				//search field
				//driver.findElement(By.id("nav-search-submit-button")).click();
				
				//linktext locator when:when HTML Tag having the <a> tage anchor tag
				 // driver.findElement(By.linkText("Amazon miniTV")).click();
				//particalLinkText when:when HTML Tag having the <a> tage anchor tag and here parical we can use text here we 
				  //need to check the uniquness of elemnent where as linktext not need for checking the uniquness
				 // driver.findElement(By.partialLinkText("Amazon mi")).click();
				  
				  //locatorname:cssselector()
				  //syntax:[AttributeName="AttributeValue"]
				//search field
				 driver.findElement(By.cssSelector("[id=\"twotabsearchtextbox\"]")).sendKeys("puma");
				  //search button
				  driver.findElement(By.cssSelector("[id=\"nav-search-submit-button\"]")).click();
				  //flipcart serach button
				  //driver.findElement(By.cssSelector("[type=\"text\"]")).sendKeys("iphone");

	}

}
