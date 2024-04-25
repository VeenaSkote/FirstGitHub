package FrameWork;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.time.Duration;
import java.util.Properties;

public class InsertDataToPropertiesFile {

	public static void main(String[] args) throws Throwable 
	{
		/*Properties pro = new Properties();
		pro.setProperty("username", "standard_user");
		pro.setProperty("password", "secret_sauce");
		pro.setProperty("url", "https://www.saucedemo.com/v1/");
		FileOutputStream fos = new FileOutputStream("./properties1.properties.txt");
		pro.store(fos, "CommanData");
		System.out.println("Data Written successfully");*/
		/*Properties pro = new Properties();
		pro.setProperty("username","standard_user");
		pro.setProperty("password", "secret_sauce");
		pro.setProperty("url", "https://www.saucedemo.com/v1/");
		new FileOutputStream(null)*/
		
        WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.manage().window().maximize();
		
		 FileInputStream fis = new FileInputStream("./properties1.properties.txt");

		    //Step2:- Helps to read data from File
		      Properties pro1 = new Properties();
		      //Step3:-Load data
		      pro1.load(fis);
		      //Step4:-Fetch data from Properties File
		      String URL = pro1.getProperty("url");
		      String USERNAME = pro1.getProperty("username");
		      String PASSWORD = pro1.getProperty("password");
			
			driver.get(URL);
		    driver.findElement(By.id("user-name")).sendKeys(USERNAME);
			driver.findElement(By.id("password")).sendKeys(PASSWORD);
			driver.findElement(By.id("login-button")).click();

	}

}
