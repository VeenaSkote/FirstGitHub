package AdvanceScenarioes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SynchronazationUsingImplicitWait {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.saucedemo.com/v1/ ");
		
		// Maximize the screen
		driver.manage().window().maximize();
		// Xpath by Attribute
		driver.findElement(By.xpath("//input[@placeholder=\"Username\"]")).sendKeys("standard_user");
		 driver.findElement(By.id("password")).sendKeys("secret_sauce");
		WebElement login = driver.findElement(By.id("login-button"));
		// explicit wait polling time fixes i,e:0.5 miliseconds
		/*WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(login));*/
		//login.click();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.attributeContains(login, "id", "login-button"));
		login.click();
		wait.until(ExpectedConditions.titleContains("Swag Labs"));
		driver.findElement(By.xpath("//div[text()=\"Sauce Labs Backpack\"]")).click();
		
		/*//fluent wait here customizise the polling time
		FluentWait wait=new FluentWait(driver);
		wait.pollingEvery(Duration.ofSeconds(1));
		wait.withTimeout(Duration.ofSeconds(10));
		
		wait.until(ExpectedConditions.elementToBeClickable(login));
		login.click();*/
		

	}

}
