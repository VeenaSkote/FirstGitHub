package AdvanceScenarioes;

import java.io.FileInputStream;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import POMREPO.Flicartpage;

public class implementingfindbysusingpom {

	public static void main(String[] args) throws Throwable 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
        driver.manage().window().maximize();
        
        Flicartpage  page = new Flicartpage (driver);
     
   //    driver.findElement(http://By.name("q")).sendKeys("bluetooth");
         page.passValue("bluetooth");
     
         Thread.sleep(2000);
// List<WebElement> allList = driver.findElements(By.xpath("//ul[@class=\"_1sFryS _2x2Mmc _3ofZy1\"]//li"));
//
//	for (WebElement ele : allList)
//	{
//		 Thread.sleep(1000);
//		String data = ele.getText();
//		System.out.println(data);
//		if(data.contains("bluetooth headphones"))
//		{
//			http://ele.click();
//			break;
//		}
//		
//	}
      page.handleMultipleElements(driver);
	
	
	
	}

}