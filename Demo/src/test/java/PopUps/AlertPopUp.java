package PopUps;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp {

	public static void main(String[] args) 
	{

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		//Alert pop
		/*driver.findElement(By.xpath("//button[text()=\"Click for JS Alert\"]")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();*/
		
		//confirmation
		/*driver.findElement(By.xpath("//button[text()=\"Click for JS Confirm\"]")).click();
		Alert alert = driver.switchTo().alert();
		
		//alert.accept();
		//alert.dismiss();
		String text=alert.getText();
		System.out.println(text);*/
		
		//send the message to the pop
		driver.findElement(By.xpath("//button[text()=\"Click for JS Prompt\"]")).click();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Qspider");
		alert.accept();
		
	}

}
