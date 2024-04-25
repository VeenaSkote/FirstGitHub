package FrameWork;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POMREPO.Loginpage;

public class Pomimple {

public static void main(String[] args) throws Throwable {
		
		
        WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.manage().window().maximize();

//step1:- connecting the file path to test script
  
      FileInputStream fis = new FileInputStream("./properties1.properties.txt");

    //Step2:- Helps to read data from File
      Properties pro = new Properties();
      //Step3:-Load data
      pro.load(fis);
      //Step4:-Fetch data from Properties File
      String URL = pro.getProperty("url");
      String USERNAME = pro.getProperty("username");
      String PASSWORD = pro.getProperty("password");
	
	driver.get(URL);
  /*  driver.findElement(http://By.id("user-name")).sendKeys(USERNAME);
	driver.findElement(http://By.id("password")).sendKeys(PASSWORD);
	driver.findElement(http://By.id("login-button")).click();*/

	     /* Loginpage login = new Loginpage(driver);
	      login.getUserTextField().sendKeys(USERNAME);
	      login.getPasswordTextField().sendKeys(PASSWORD);
	      login.getLoginButton().click();*/
	      Loginpage login = new Loginpage(driver);
	  	login.loginToApplication(USERNAME, PASSWORD) ;
}

}
