package PopUps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FramesPopUp {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		
		// 3 approches
		//1.switching frame by using index--->index starts from 0
		//2.switching frame by using  id() and name()
		//3.switching frame by using  webelements
		driver.switchTo().frame(0);
		WebElement drag = driver.findElement(By.xpath("//p[text()=\"Drag me to my target\"]"));
		WebElement drop = driver.findElement(By.xpath("//div[@id=\"droppable\"]"));
		Actions act=new Actions(driver);
		   act.dragAndDrop(drag, drop).perform();

	}

}
