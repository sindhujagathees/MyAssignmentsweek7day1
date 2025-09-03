package Pages;

import org.openqa.selenium.By;
import Base.BaseClass;
public class MyHomePage extends BaseClass  {

	public MyAccountPage clickAccountLink()
	{
		
		driver.findElement(By.linkText("Accounts")).click();
		return new MyAccountPage();
	}

}
