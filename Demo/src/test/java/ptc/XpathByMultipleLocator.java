package ptc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByMultipleLocator {

	public static void main(String[] args) 
	{
		//lanching the emptry browaser
				WebDriver driver=new ChromeDriver();
				//method 1: get()-->lanching the application
				//driver.get("https://www.saucedemo.com/v1/");
				driver.get("https://www.amazon.in");
				driver.findElement(By.xpath("//a[@class=\"nav-a  \" and text()=\"Amazon miniTV\"]")).click();
				//driver.findElement(By.xpath("//input[@id=\"password\" or @placeholder=\"Password\"]")).sendKeys("secret_sauce");
                //driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
				//selecting checkbox
				//(input[@type="checkbox"])[position()>4]
				//select last check box
				//(input[@type="checkbox"])[last()]
				//select from last second
				//(input[@type="checkbox"])[last()-1]
				//select even checkkbox
				//(//input[@type="checkbox"])
	}

}
