package Pages;

import org.openqa.selenium.By;

import Base.BaseClass;

public class CreateAccountPage extends BaseClass {

	public CreateAccountPage enterAccountName()
	{
		driver.findElement(By.id("accountName")).sendKeys("Sindhujaga");
		return this;
	}
	
    public CreateAccountPage enterDescription()
    {
    	driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
    	return this;
    }
    public ViewAccountPage clickCreateAccountButton()
    {
    	driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
    	return new ViewAccountPage();
    }
}
