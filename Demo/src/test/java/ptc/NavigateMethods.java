package ptc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethods {

	public static void main(String[] args) throws Throwable
	{
		//lanching the emptry browaser
		WebDriver driver=new ChromeDriver();
		//method 1: get()-->lanching the application
		driver.get("https://www.amazon.in");
		//navigate method() to lanch the application
		//driver.navigate().to("\"https://www.amazon.in");
		//navigate().back()--->used for navigating backward button
		driver.navigate().back();
		Thread.sleep(2000);
		//navigate().forward()--->used for navigating farward button
		driver.navigate().forward();
		Thread.sleep(2000);
		//navigate().refesh()--->used for navigating refresh button
		driver.navigate().refresh();
		Thread.sleep(2000);

	}

}
