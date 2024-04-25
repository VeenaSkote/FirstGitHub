package AdvanceScenarioes;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingKeyBoardKeysClass {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.saucedemo.com");
		driver.manage().window().maximize();
		//normal approch
		/*driver.findElement(By.xpath("//input[@id=\"user-name\"]")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click()*/;
		
		//case 1: approach
		
		/*driver.findElement(By.xpath("//input[@id=\"user-name\"]")).sendKeys("standard_user");
		WebElement password=driver.findElement(By.xpath("//input[@id=\"password\"]"));
		password.sendKeys("secret_sauce");
		password.sendKeys(Keys.ENTER);*/
		
		//case 2: approach
		
		/*driver.findElement(By.xpath("//input[@id=\"user-name\"]")).sendKeys("standard_user");
		WebElement password=driver.findElement(By.xpath("//input[@id=\"password\"]"));
		password.sendKeys("secret_sauce",Keys.ENTER);*/
		
		//case3:approach
		driver.findElement(By.xpath("//input[@id=\"user-name\"]")).sendKeys("standard_user",Keys.TAB,"secret_sauce",Keys.ENTER);
	}

}
