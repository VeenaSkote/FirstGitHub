package AdvanceScenarioes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingSVGElements {

	public static void main(String[] args) throws Throwable 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.kayak.co.in/ ");
		driver.manage().window().maximize();
		// driver.findElement(By.xpath("//a[text()=\"Create new account\"]")).click();
		 Thread.sleep(2000);
		 //SVG:Scalar vector grapics
		 //Syntax://*[name()="svg"and @AttributeName="AttributeValue"]
		 driver.findElement(By.xpath("//*[name()=\"svg\" and @class=\"c8LPF-icon\"]")).click();

	}

}
