package PopUps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderpopUp {

	public static void main(String[] args) throws Throwable 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		//makemytrip
		//driver.get("https://www.makemytrip.com/");
		//driver.findElement(By.xpath("//span[text()=\"Departure\"]")).click();
		//Dynamic xpath
		//driver.findElement(By.xpath("//div[text()=\"March 2024\"]/ancestor::div[@class=\"DayPicker-Month\"]/descendant::p[text()=\"15\"]")).click();
		
		String month="March 2024";
		String date="20";
	//	Thread.sleep(1000);
		//driver.findElement(By.xpath("//div[text()=\""+month+"\"]/ancestor::div[@class=\"DayPicker-Month\"]/descendant::p[text()=\""+date+"\"]")).click();
		
		
		//goiboib
		driver.get("https://www.goibibo.com/");
		driver.findElement(By.xpath("//span[text()=\"Departure\"]")).click();
		driver.findElement(By.xpath("//div[text()=\""+month+"\"]/ancestor::div[@class=\"DayPicker-Month\"]/descendant::p[text()=\""+date+"\"]")).click();
		

	}

}
