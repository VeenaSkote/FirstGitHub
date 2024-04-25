package AdvanceScenarioes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingMouseActions {

	public static void main(String[] args) {
		 WebDriver driver=new ChromeDriver();
			
			
	     //  driver.get("https://www.saucedemo.com");
			/*driver.manage().window().maximize();
			WebElement txt = driver.findElement(By.xpath("//a[text()=\"Mobiles\"]"));
			Actions act=new Actions(driver);
			act.moveToElement(txt).perform();
			act.contextClick(txt).perform();*/
		/* WebElement username = driver.findElement(By.xpath("//input[@id=\"user-name\"]"));
		 WebElement password=driver.findElement(By.xpath("//input[@id=\"password\"]"));
		 WebElement	login=driver.findElement(By.id("login-button"));
		// Actions act=new Actions(driver);
		 /*act.sendKeys(username,"standard_user").perform();
		 act.sendKeys(password,"secret_sauce").perform();
		 act.sendKeys(login).perform();*/
		// act.sendKeys(username,"standard_user").sendKeys(password,"secret_sauce").click(login).build().perform();
		 
		 driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		 WebElement drag = driver.findElement(By.id("draggable"));
		 WebElement drop = driver.findElement(By.id("droppable"));
		 Actions act=new Actions(driver);
		 //act.dragAndDrop(drag, drop).perform();
		/* act.clickAndHold(drag).perform();
		 act.release(drop).perform();*/
		 act.clickAndHold(drag).release(drop).build().perform();
	}

}
