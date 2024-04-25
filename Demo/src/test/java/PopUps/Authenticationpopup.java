package PopUps;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Authenticationpopup {
@Test
	public  void authentice() 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.get("https://the-internet.herokuapp.com/basic_auth ");
		driver.manage().window().maximize();
       //Syntax:driver.get("https://username:password@url");
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth ");
		System.out.println("Authentication pop handled");

}
}