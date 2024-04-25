package PopUps;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowHandlingPopUp {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.naukri.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		WebElement job = driver.findElement(By.xpath("//div[text()=\"Jobs\"]"));
		Actions act=new Actions(driver);
       
	act.moveToElement(job).perform();
	driver.findElement(By.xpath("//div[text()=\"Jobs by skill\"]")).click();
	driver.findElement(By.xpath("//div[text()=\"Services\"]")).click();
	String mainwindow = driver.getWindowHandle();//fetches the current window id
	Set<String> allwindow = driver.getWindowHandles();//fetches the all window id which is opned by the applicaton
	for (String window : allwindow) 
	{
		if(!mainwindow.equals(window))
		{
			driver.switchTo().window(window);
			driver.findElement(By.xpath("//span[text()=\"RESUME WRITING\"]")).click();
		}
	}

	}

}
