package ptc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		//method 1: get()-->lanching the application
		driver.get("https://www.saucedemo.com/v1/ ");
		Thread.sleep(2000);
		// Maximize the screen
		driver.manage().window().maximize();
		//user name field(syntax 1):-[AttributeName="AttributeValue]
		//driver.findElement(By.cssSelector("[data-test=\"username\"]")).sendKeys("standard_user");
		//user name field )syntax2):-HTMLTag[AttributeName="AttributeValue]
		driver.findElement(By.cssSelector("input[type=\"text\"]")).sendKeys("standard_user");
		//password  feild syntax1
		driver.findElement(By.cssSelector("[type=\"password\"]")).sendKeys("secret_sauce");
		//password field syntax2
		//driver.findElement(By.cssSelector("input[type=\"password\"]")).sendKeys("secret_sauce");
		//driver.findElement(By.cssSelector("[class=\"btn_action\"]")).click();
		//CssSelector Syntax 3(support only id locator) syntax:#AttributeValue
		//driver.findElement(By.cssSelector("#login-button")).click();
		//CssSelector syntax 4(Supports only id locotor) syntax:HTML#AttributeValue
		driver.findElement(By.cssSelector("input#login-button")).click();
		//CssSelector syntax 5(Supports only class locotor) syntax: .Attributevalue
		//driver.findElement(By.cssSelector(".btn_action")).click();
		//CssSelector syntax 6(Supports only class locotor) syntax: HTML tag.Attributevalue
		driver.findElement(By.cssSelector("input.btn_action")).click();
		

	}

}
