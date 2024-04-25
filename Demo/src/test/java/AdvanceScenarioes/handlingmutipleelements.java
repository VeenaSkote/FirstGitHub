package AdvanceScenarioes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingmutipleelements
{
	public static void main(String[] args) throws Throwable
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com");
		Thread.sleep(2000);
		List<WebElement> alllinks = driver.findElements(By.xpath("//a"));
		Thread.sleep(2000);
		int count=0;
		for(WebElement link:alllinks)
		{
			//System.out.println(link.getText()); //print all visible text in webpage
			System.out.println(link.getDomAttribute("href"));
			count++;
		}
		System.out.println("Total count:"+count);
		}
}
