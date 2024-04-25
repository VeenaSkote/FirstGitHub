package ptc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class WeddriverMethods {
public static void main(String[] args) {
	//lanching the emptry browaser
	WebDriver driver=new ChromeDriver();
	//method 1: get()-->lanching the application
	driver.get("https://www.amazon.in");
	//method 3:getcurrenturl--->fetches the url of the web page
	String url=driver.getCurrentUrl();
	System.out.println("Current url is"+url);
	//method 2:gettitle()---->fetches the title of web page
	String title=driver.getTitle();
	System.out.println("Title of the page"+title);
	//method 4:getpagesouce()--->fetches the souce of the wedpage
	String source=driver.getPageSource();
	System.out.println("source of page is:"+source);
	
	
	// to maximize the window
	// manage()-->used for maximize,minize,fullscrenn actions on window
	//case 1:
Options	op=driver.manage();
Window win=op.window();
win.maximize();
//case2(single line maximize
	driver.manage().window().maximize();
	driver.manage().window().minimize();
	driver.manage().window().fullscreen();
	//method 6:close()--->close the tab/window where driver in currently in focus
	
	//method 7:quit()---->closes all tab/windows including browser
	driver.quit();
}
}
