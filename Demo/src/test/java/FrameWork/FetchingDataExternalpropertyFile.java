package FrameWork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchingDataExternalpropertyFile {

	public static void main(String[] args) throws Throwable 
	{
		//Normal Approch
		WebDriver driver=new ChromeDriver();
		
		/*driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/v1/ ");
		driver.findElement(By.id("user-name")).sendKeys("standard_user"); //password
		driver.findElement(By.id("password")).sendKeys("secret_sauce"); //login
		driver.findElement(By.id("login-button")).click();*/
		//Step 1: connecting file path to the script
		//  frist approch for the file path
		//FileInputStream fis = new FileInputStream("D:\\javaprogrames\\mock\\src\\TestProgrammes\\properties1.properties");
		////  Swecond approch for the file path
		FileInputStream fis = new FileInputStream("./properties1.properties.txt");
		
		//Step2:Helps to read the data from the file
		Properties pro = new Properties();
		//Steep3:load the data
		pro.load(fis);
		//step4:feth the data from property file
		String URL = pro.getProperty("url");
		 String USERNAME= pro.getProperty("username");
		String PASSWORD = pro.getProperty("password");
		driver.get(URL);
		driver.findElement(By.id("user-name")).sendKeys(USERNAME);
		driver.findElement(By.id("password")).sendKeys(PASSWORD);
		driver.findElement(By.id("login-button")).click();

}}
