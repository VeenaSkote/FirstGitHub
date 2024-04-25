package ptc;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assigment1 {
   @Test
	public void Assigment1(){
		
		WebDriver driver=new ChromeDriver();
		//method 1: get()-->lanching the application
		driver.get("https://www.flipkart.com/");
		//Thread.sleep(2000);
		// Maximize the screen
		driver.manage().window().maximize();
		// Xpath by Attribute
		// print first phone name and price
				//driver.findElement(By.xpath("//input[@class=\"Pke_EE\"]")).sendKeys("puma sneakers");
				//driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
				//String item=driver.findElement(By.xpath("//div[@class=\"_2B099V\"][1]")).getText();
				//System.out.println(item);
		
		// print All the phone details
		
		  driver.findElement(By.xpath("//input[@class=\"Pke_EE\"]")).sendKeys("iphone");
		  driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		  List<WebElement>
		  alllist=driver.findElements(By.xpath("//div[@class=\"_4rR01T\"]"));
		  
		  int count=0; 
		  for(WebElement List:alllist) 
		  {
		  System.out.println(List.getText()); count++; 
		  }
		 
		//System.out.println("Total no of phone:"+count);
List<WebElement> allprice=driver.findElements(By.xpath("//div[@class=\"_30jeq3 _1_WHN1\"]"));
		
	
		for(WebElement price:allprice)
		{
			System.out.println(price.getText());
			
		}
		
}
}