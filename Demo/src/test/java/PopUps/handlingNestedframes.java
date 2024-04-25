package PopUps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingNestedframes {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/frames");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()=\"Nested Frames\"]")).click();
		
		WebElement topframe = driver.findElement(By.xpath("//frame[@name=\"frame-top\"]"));
		driver.switchTo().frame(topframe);
		
		WebElement leftframe = driver.findElement(By.xpath("//frame[@name=\"frame-left\"]"));
		driver.switchTo().frame(leftframe);
		String text = driver.findElement(By.xpath("//body[contains(text(),\" LEFT\")]")).getText();
		System.out.println(text);
		driver.switchTo().parentFrame();
		WebElement middleframe = driver.findElement(By.xpath("//frame[@name=\"frame-middle\"]"));
		driver.switchTo().frame(middleframe);
		String txt1 = driver.findElement(By.xpath("//div[text()=\"MIDDLE\"]")).getText();
		System.out.println(txt1);
		driver.switchTo().defaultContent();
		WebElement bottomframe = driver.findElement(By.xpath("//frame[@name=\"frame-bottom\"]"));
		driver.switchTo().frame(bottomframe);
		String txt2 = driver.findElement(By.xpath("//body[contains(text(),\"BOTTOM\")]")).getText();
		System.out.println(txt2);
		
		
		
	}

}
