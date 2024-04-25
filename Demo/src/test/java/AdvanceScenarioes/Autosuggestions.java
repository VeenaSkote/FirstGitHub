package AdvanceScenarioes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Autosuggestions {
@Test
	public void auto() throws Throwable 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		 driver.findElement(By.name("q")).sendKeys("bluetooth");
		 Thread.sleep(2000);
		 List<WebElement> alllist = driver.findElements(By.xpath("//ul[@class=\"_1sFryS _2x2Mmc _3ofZy1\"]//li"));
for (WebElement ele : alllist) 
{
	Thread.sleep(1000);
	String data=ele.getText();
	//Thread.sleep(2000);
	System.out.println(data);
	//Thread.sleep(2000);
	
	if(data.contains("bluetooth headset"));
	{
		//Thread.sleep(2000);
		ele.click();
		break;
	}
}
		/*driver.findElement(By.name("q")).sendKeys("bluetooth");
		      
		      Thread.sleep(2000);
		 List<WebElement> allList = driver.findElements(By.xpath("//ul[@class=\"_1sFryS _2x2Mmc _3ofZy1\"]//li"));

			for (WebElement ele : allList)
			{
				 Thread.sleep(1000);
				String data = ele.getText();
				System.out.println(data);
				if(data.contains("bluetooth boat"))
				{
					ele.click();
					break;
				}
				
			}*/
			
	}

}
