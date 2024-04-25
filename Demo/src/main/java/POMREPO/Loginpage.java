package POMREPO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage 
{
	//intialazation
			public Loginpage(WebDriver driver)
			{
				PageFactory.initElements(driver,this);
			}
			
			//Declaration
			@FindBy(id="user-name")
			private WebElement UserTextField;
			
			@FindBy(name="password")
			private WebElement PasswordTextField;
			
			@FindBy(id="login-button")
			private WebElement LoginButton;
			
			
			
			//getter methods
				public WebElement getUserTextField() {
					return UserTextField;
				}

				public WebElement getPasswordTextField() {
					return PasswordTextField;
				}

				public WebElement getLoginButton() {
					return LoginButton;
				}
				//Business LOgics
				public void loginToApplication(String username, String Password)
				{
					UserTextField.sendKeys(username);
					PasswordTextField.sendKeys(Password);
					LoginButton.click();
				}
}
