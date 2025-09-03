package Pages;

import org.openqa.selenium.By;

import Base.BaseClass;

public class WelcomePage extends BaseClass
{
   public MyHomePage clickCRMSFA()
   
	    {
	   driver.findElement(By.partialLinkText("CRM")).click();
	   return new MyHomePage();
	}
}

	

