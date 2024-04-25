package ptc;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSASelectorAmzonApplication {

	public static void main(String[] args) throws Throwable 
	{
		WebDriver driver=new ChromeDriver();
		//method 1: get()-->lanching the application
		driver.get("https://www.amzon.in");
		Thread.sleep(2000);
		// Maximize the screen
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]")).sendKeys("iphone");
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
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
