package AdvanceScenarioes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingScrollBarUsingJavaScriptExecutor1 {

	public static void main(String[] args) throws Throwable 
	{
		// Scroll to particular element by javascriptexecutor
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
     
    // WebElement ele = driver.findElement(By.xpath("//a[text()=\"Instagram\"]"));
     //using co-ordinates
/* Point loc = ele.getLocation();
 System.out.println(loc.getX());
 System.out.println(loc.getY());
 JavascriptExecutor js=(JavascriptExecutor)driver;
 js.executeScript("window.scrollBy(1173,786)");
 ele.click();*/
     // using the argumentview
     /*JavascriptExecutor js=(JavascriptExecutor)driver;
     js.executeScript("arguments[0].scrollIntoView()", ele);
     ele.click();*/
     //scroll full down
     JavascriptExecutor js=(JavascriptExecutor)driver;
     js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
     Thread.sleep(2000);
     js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
     
     
 
	}

}
