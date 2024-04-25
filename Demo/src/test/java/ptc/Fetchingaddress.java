package ptc;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fetchingaddress {

	public static void main(String[] args) 
	{
		// Scenario: go to amazon-type the product in search bar-get first item-click on the add to cart
		//-click on the procces to pay-print the address
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]")).sendKeys("nike");
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		driver.findElement(By.xpath("//span[text()=\"Mens Full Force LoRunning Shoe\"]")).click();
		Set<String> allwindows = driver.getWindowHandles();
		for (String win : allwindows) 
		{
			driver.switchTo().window(win);
			String title = driver.getTitle();
			System.out.println(title);
			if(title.contains("Buy Nike Men's White/Mystic Red-Black-Sail Sneakers - 8 UK (9 US) at Amazon.in"))
			{
				break;
			}
			
		}
		driver.findElement(By.xpath("//input[@name=\"submit.add-to-cart\"]")).click();
		driver.findElement(By.xpath("//input[@name=\"proceedToRetailCheckout\"]")).click();
		driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("9632267335");
		driver.findElement(By.xpath("//input[@id=\"continue\"]")).click();
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("Guru@2022");
		driver.findElement(By.xpath("//input[@id=\"signInSubmit\"]")).click();
		String txt = driver.findElement(By.xpath("(//span[@class=\"break-word\"])[2]")).getText();
		System.out.println(txt);
		}
		

	}


