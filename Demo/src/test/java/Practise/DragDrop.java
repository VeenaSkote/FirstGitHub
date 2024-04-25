package Practise;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) throws Throwable 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.shoppersstack.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("loginBtn")).click();
		
		driver.findElement(By.xpath("//a[text()=\"Login\"]")).click();
		driver.findElement(By.xpath("//input[@id=\"Email\"]")).sendKeys("veenaskote8@gmail.com");
		driver.findElement(By.xpath("//input[@id=\"Password\"]")).sendKeys("Nairuthi@2015");
		driver.findElement(By.xpath("//button[@id=\"Login\"]")).click();
		
		WebElement setlist = driver.findElement(By.xpath("//div[@class=\"MuiAvatar-root MuiAvatar-circular MuiAvatar-colorDefault css-bjoz8z\"]"));
		setlist.click();
		List<WebElement> alllist = driver.findElements(By.xpath("//ul[@class=\"MuiList-root MuiList-padding MuiMenu-list css-r8u8y9\"]//li"));
		for (WebElement ele: alllist) 
		{
		 String	data=ele.getText();
		 System.out.println(data);
			
			  if(data.contains("Wish List")) 
			  { 
				  Thread.sleep(1000);
				  ele.click(); 
				  
			}
			 
		}
		
		   WebElement drag = driver.findElement(By.xpath("//button[text()=\"Add To Cart\"]"));
		   WebElement drop = driver.findElement(By.xpath("//*[name()=\"svg\" and @id=\"cartIcon\"]"));
		   Actions act=new Actions(driver);
		   act.dragAndDrop(drag, drop).perform();
		   setlist.click();
		   List<WebElement> alllist1 = driver.findElements(By.xpath("//ul[@class=\"MuiList-root MuiList-padding MuiMenu-list css-r8u8y9\"]//li"));
			for (WebElement ele1: alllist1) 
			{
			 String	data1=ele1.getText();
			 System.out.println(data1);
				
				  if(data1.contains("Logout")) 
				  { 
					  Thread.sleep(1000);
					  ele1.click(); 
					  
				}
				 
			}
		 
	}

}
