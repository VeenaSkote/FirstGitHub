package PopUps;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingwindowspopupex1 {

	public static void main(String[] args) 
	{
		
   WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Windows.html ");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[contains(text(),\" click   \")]")).click();
		String mainwindow = driver.getWindowHandle();//fetches the current window id
		Set<String> allwindow = driver.getWindowHandles();//fetches the all window id which is opned by the applicaton
		for (String window : allwindow) 
		{
			if(!mainwindow.equals(window))
			{
				driver.switchTo().window(window);
				String txt = driver.findElement(By.xpath("//h4[text()=\"Selenium WebDriver\"]")).getText();
				System.out.println(txt);
			}
		}
		
		
		

	}

}
