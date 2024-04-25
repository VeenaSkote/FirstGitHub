package ptc;



import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class WebDriverMethods {

	public static void main(String[] args) throws Throwable 
	{
		WebDriver driver=new ChromeDriver();
		/*driver.get("https://www.amazon.in");
		
		  //method 1:senkeys()
		 WebElement searchbox=driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]")
		 ); searchbox.sendKeys("puma");
		  //method 2:submit()
		  Thread.sleep(1000); 
		  //method 3:clear()
		  searchbox.clear(); 
		  Thread.sleep(1000);
		  searchbox.sendKeys("nike"); searchbox.submit();
		 */
		/*driver.get("https://www.facebook.com");
		WebElement	ele=driver.findElement(By.xpath("//input[@type=\"text\"]"));
		 //method 4:getlocation()
		Point loc=ele.getLocation();
		System.out.println(loc.getX());
		System.out.println(loc.getY());
		//method 5:getSize()
	Dimension	elem=ele.getSize();
	System.out.println(elem.getHeight());
	System.out.println(elem.getWidth());
	//method 6:getRect()
	Rectangle elements=ele.getRect();
	System.out.println(loc.getX());
	System.out.println(loc.getY());
	System.out.println(elem.getHeight());
	System.out.println(elem.getWidth());
		//method 7:cssvalue
		WebElement	elet=driver.findElement(By.xpath("//img[@class=\"fb_logo _8ilh img\"]"));
		System.out.println(elet.getCssValue("color"));
		System.out.println(elet.getCssValue("font-size"));
		//method 8:gettagname()
		System.out.println(elet.getTagName());*/
		
	//method 9:getattribute()
		//driver.get("https://www.flipkart.com");
	/*	WebElement	ele=driver.findElement(By.xpath("//input[@type=\"text\"]"));
		System.out.println(ele.getAttribute("class"));
		//method 10:getdomattribute()
		System.out.println(ele.getDomAttribute("placeholder"));
		//method 11:getdomproperty
		WebElement	txt=driver.findElement(By.xpath("//span[text()=\"Home & Furniture\"]"));
		System.out.println(txt.getDomProperty("tagname"));*/
		//method 12:isdiplayed
		/*WebElement	txt=driver.findElement(By.xpath("//img[@title=\"Flipkart\"]"));
		if(txt.isDisplayed())
		{
			System.out.println("logo is displayed");
		}
		else
		{
			System.out.println("logo is not displayed");
		}
		//method 13:isenabled
		WebElement	searchtxt=driver.findElement(By.xpath("//input[@name=\"q\"]"));
		if(searchtxt.isEnabled())
		{
			searchtxt.sendKeys("puma");
		}
		else
		{
			System.out.println("element not enabled");
		}*/
		
		
		//method 14:isselected
		//driver.get("https://www.facebook.com");
		
	/*	WebElement	radio=driver.findElement(By.xpath("//a[text()=\"Create new account\"]"));
		
		radio.click();
		Thread.sleep(2000);
		if(radio.isSelected())

		{
			System.out.println("radio is selected");
		}
		else
		{
			System.out.println("radio is  notselected");
		}
		//method 15:getariorole
		
		WebElement	radio1=driver.findElement(By.xpath("//a[text()=\"Forgotten password?\"]"));
		radio1.click();
		
		System.out.println(radio1.getAriaRole());*/
		//method 16:getaccessiblename()
/*WebElement	radio2=driver.findElement(By.xpath("//a[text()=\"Create new account\"]"));
		
		radio2.click();
		Thread.sleep(2000);
		WebElement	radio3=driver.findElement(By.xpath("//input[@placeholder=\"First name\"]"));
		Thread.sleep(2000);
		System.out.println(radio3.getAccessibleName());*/
		// method 17 :gettext()
		driver.get("https://www.flipkart.com");
		WebElement txt = driver.findElement(By.name("q"));	
			txt.sendKeys("Nike");
			txt.submit();
			String name = driver.findElement(By.xpath("//a[@title=\"NIKE Western Wear Legging\"]")).getText();
			System.out.println(name);
	}

}
