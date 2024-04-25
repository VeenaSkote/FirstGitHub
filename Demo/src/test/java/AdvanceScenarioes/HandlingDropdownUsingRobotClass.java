package AdvanceScenarioes;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDropdownUsingRobotClass {

	public static void main(String[] args) throws Throwable 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		 driver.findElement(By.xpath("//a[text()=\"Create new account\"]")).click();
		 Thread.sleep(2000);
		 WebElement datelist = driver.findElement(By.id("day"));
		 datelist.click();
		 Robot rob=new Robot();
		 rob.keyPress(KeyEvent.VK_DOWN);
		 rob.keyRelease(KeyEvent.VK_DOWN);
		 Thread.sleep(2000);
		 rob.keyPress(KeyEvent.VK_DOWN);
		 rob.keyRelease(KeyEvent.VK_DOWN);
		 Thread.sleep(2000);
		 rob.keyPress(KeyEvent.VK_UP);
		 rob.keyRelease(KeyEvent.VK_UP);
		 WebElement monthlist = driver.findElement(By.id("month"));
		 Robot rob1=new Robot();
		 rob1.keyPress(KeyEvent.VK_DOWN);
		 rob1.keyRelease(KeyEvent.VK_DOWN);
		 Thread.sleep(2000);
		 rob1.keyPress(KeyEvent.VK_DOWN);
		 rob1.keyRelease(KeyEvent.VK_DOWN);
		 Thread.sleep(2000);
		 rob1.keyPress(KeyEvent.VK_UP);
		 rob1.keyRelease(KeyEvent.VK_UP);
		 
		 WebElement yearlist = driver.findElement(By.id("Year"));
		 Robot rob2=new Robot();
		 rob2.keyPress(KeyEvent.VK_DOWN);
		 rob2.keyRelease(KeyEvent.VK_DOWN);
		 Thread.sleep(2000);
		 rob2.keyPress(KeyEvent.VK_DOWN);
		 rob2.keyRelease(KeyEvent.VK_DOWN);
		 Thread.sleep(2000);
		 rob2.keyPress(KeyEvent.VK_UP);
		 rob2.keyRelease(KeyEvent.VK_UP);

	}

}
