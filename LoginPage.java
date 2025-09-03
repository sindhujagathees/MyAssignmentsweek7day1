package Pages;

import org.openqa.selenium.By;
import Base.BaseClass;
public class LoginPage extends BaseClass{
	

		public LoginPage enterUsername() {
			driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoCSR");
			return this;
		}

		public LoginPage enterPassword() {
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			return this;
		}

		public WelcomePage clickLoginButton() {
			driver.findElement(By.className("decorativeSubmit")).click();
			//WelcomePage wp= new WelcomePage();
			return new WelcomePage();
		}

	}

	