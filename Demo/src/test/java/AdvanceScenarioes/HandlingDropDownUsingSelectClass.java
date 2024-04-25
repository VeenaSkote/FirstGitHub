package AdvanceScenarioes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDownUsingSelectClass {

	public static void main(String[] args) throws Throwable 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		 driver.findElement(By.xpath("//a[text()=\"Create new account\"]")).click();
		 Thread.sleep(2000);
		 WebElement datelist = driver.findElement(By.id("day"));
		
		 Select select=new Select(datelist);
		 //select.selectByIndex(18);
		 select.selectByVisibleText("17");
		 WebElement monthlist = driver.findElement(By.id("month"));
		 Select select1=new Select(monthlist);
		// select1.selectByValue("6");
		 select1.selectByVisibleText("Nov");
		 WebElement yearlist = driver.findElement(By.id("year"));
		 
		 Select select2=new Select(yearlist);
		 //select2.selectByValue("1998");
		 select2.selectByVisibleText("2015");
		 

	}

}
