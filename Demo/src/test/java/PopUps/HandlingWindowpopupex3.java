package PopUps;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindowpopupex3 {

	public static void main(String[] args) throws Throwable 
	{
WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Windows.html ");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[contains(text(),\" click   \")]")).click();
		
		Set<String> allwindows = driver.getWindowHandles();
		
		for (String window : allwindows) 
		{
			driver.switchTo().window(window);
			String title = driver.getTitle();
			
			if(title.contains("Selenium"))
			{
				
				break;
				
				
			}
		}
		driver.findElement(By.xpath("//a[text()=\"Read all about it!\"]")).click();
Set<String> allwindows1 = driver.getWindowHandles();
		
		for (String window1 : allwindows1) 
		{
			driver.switchTo().window(window1);
			String title1 = driver.getTitle();
			
			if(title1.contains("WebDriver BiDi"))
			{
				
				break;
				
				
			}
		}
		
			 driver.findElement(By.xpath("//a[contains(text(),\"   Get inspired\")]")).click();
			 Set<String> allwindows2 = driver.getWindowHandles();
				
				for (String window2 : allwindows2) 
				{
					driver.switchTo().window(window2);
					String title2 = driver.getTitle();
					
					if(title2.contains("Frames & windows"))
					{
						
						break;
						
						
					}
				}
			
				 driver.findElement(By.xpath("//a[text()=\"Home\"]")).click();

	}
}


