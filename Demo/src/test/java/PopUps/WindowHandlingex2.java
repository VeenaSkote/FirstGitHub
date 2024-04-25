package PopUps;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowHandlingex2 
{
	public static void main(String[] args) throws Throwable 
	{
		WebDriver driver=new ChromeDriver();
		   driver.get("https://www.naukri.com/");
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		   
		   WebElement txt = driver.findElement(By.xpath("//div[text()=\"Jobs\"]"));

		        Actions act = new Actions(driver);
		        act.moveToElement(txt).perform();
			
			driver.findElement(By.xpath("//div[text()=\"Jobs by skill\"]")).click();
       driver.findElement(By.xpath("//div[text()=\"Services\"]")).click();

	      Set<String> allWin = driver.getWindowHandles();
	
	      for (String win : allWin)
	      {
			driver.switchTo().window(win);
			String title = driver.getTitle();
			System.out.println(title);
			if(title.contains("Resume Writing Services"))
			{
				break;
			}
		}
	
	driver.findElement(By.xpath("//span[text()=\"FIND JOBS\"]")).click();
	
		
	}
}
