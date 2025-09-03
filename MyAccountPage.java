package Pages;

import org.openqa.selenium.By;

import Base.BaseClass;

public class MyAccountPage extends BaseClass{

	public CreateAccountPage clickCreateAccountLink()
	{
					driver.findElement(By.linkText("Create Account")).click();
					return new CreateAccountPage();
			
	}

}
