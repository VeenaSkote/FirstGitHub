package ptc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginScriptandLocators {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver=new ChromeDriver();
		//method 1: get()-->lanching the application
		driver.get("https://www.saucedemo.com/v1/ ");
		Thread.sleep(2000);
		// Maximize the screen
		driver.manage().window().maximize();
		//Finding element by using locator id()
		//syntax:AttributeName=AttributeValue;//Finding locator using id ()
		//user name field
		/*
		 * driver.findElement(By.id("user-name")).sendKeys("standard_user"); //password
		 * field driver.findElement(By.id("password")).sendKeys("secret_sauce"); //login
		 * button
		 */		driver.findElement(By.id("login-button")).click();
		 
		//Finding element by using locator name()
			
		/*
		 * driver.findElement(By.name("user-name")).sendKeys("standard_user");
		 * //password field
		 * driver.findElement(By.name("password")).sendKeys("secret_sauce"); //login
		 * button driver.findElement(By.id("login-button")).click();
		 */
		//className() locator
		//syntax://syntax:AttributeName=AttributeValue;
		 driver.findElement(By.name("user-name")).sendKeys("standard_user");
		  //password field
		 driver.findElement(By.name("password")).sendKeys("secret_sauce");
		  driver.findElement(By.className("btn_action")).click(); //login
		  //linktext locator when:when HTML Tag having the <a> tage anchor tag
		  driver.findElement(By.linkText("Amazon miniTV")).click();
		
		

		
		

	}

}
