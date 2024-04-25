package POMREPO;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Flicartpage {

	public Flicartpage(WebDriver driver)
	{
	PageFactory.initElements(driver, this);	
	}
	@FindBys({@FindBy(name="q"),@FindBy(xpath="//input[@title='Search for Products, Brands and More']")})
	private WebElement searchBar;
	
	public void passValue(String Name)
	{
		searchBar.sendKeys(Name);
	}
	
	public void handleMultipleElements(WebDriver driver) throws Throwable
	{
		List<WebElement> allList = driver.findElements(By.xpath("//ul[@class=\"_1sFryS _2x2Mmc _3ofZy1\"]//li"));

		for (WebElement ele : allList)
		{
			
			String data = ele.getText();
			System.out.println(data);
			if(data.contains("bluetooth headphones"))
			{
				ele.click();
				break;
			}
			
		}
	}
	
}
		


