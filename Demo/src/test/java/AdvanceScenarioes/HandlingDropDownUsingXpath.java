package AdvanceScenarioes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDropDownUsingXpath {

	public static void main(String[] args) throws Throwable 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		 driver.findElement(By.xpath("//a[text()=\"Create new account\"]")).click();
		 Thread.sleep(2000);
		 WebElement datelist = driver.findElement(By.id("day"));
		 driver.findElement(By.xpath("//option[@value=\"18\"]")).click();
		 driver.findElement(By.xpath("//option[text()=\"May\"]")).click();
		
		 driver.findElement(By.xpath("//option[@value=\"2011\"]")).click();
		 
	}

}
