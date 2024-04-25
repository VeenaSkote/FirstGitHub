package AdvanceScenarioes;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HAndlingScrollBarUsingJavaScriptExecutor {
@Test
	public void method1()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
     JavascriptExecutor js=(JavascriptExecutor)driver;
     
     for(int i=0;i<3;i++)
     {
    	 js.executeScript("window.scrollBy(0,300)");
     }
     for(int i=0;i<3;i++)
     {
    	 js.executeScript("window.scrollBy(0,-500)");
     }

	}

}
