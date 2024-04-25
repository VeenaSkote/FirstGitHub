package PopUps;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindowUsingTitle {

	public static void main(String[] args) 
	{
WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Windows.html ");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[contains(text(),\" click   \")]")).click();
		Set<String> allwindows = driver.getWindowHandles();
		
		for (String window : allwindows) 
		{
			driver.switchTo().window(window);
			String title = driver.getTitle();
			System.out.println(title);
			if(title.contains("Selenium"))
			{
				break;
			}
		}
		
		driver.findElement(By.xpath("//span[text()=\"Downloads\"]")).click();

	}

}
