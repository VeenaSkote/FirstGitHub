package PopUps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frmaeshandling {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		//approch 1:By using index
		//driver.switchTo().frame(1);
		//driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Qspider");
		//approch 2:By using id or name
		//by using id
		//driver.switchTo().frame("singleframe");
		//driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("veena");
		
		//by using name
		
		//driver.switchTo().frame("SingleFrame");
		//driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("nairuthi");
		
		//3.switching frame by using  webelements
		
		WebElement text = driver.findElement(By.xpath("//iframe[@id=\"singleframe\"]"));
		driver.switchTo().frame(text);
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("gurutharak");
		

	}

}
