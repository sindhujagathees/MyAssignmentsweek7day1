package Testcase;

import org.testng.annotations.Test;

import Base.BaseClass;
import Pages.LoginPage;

public class TC_001CreateAccount extends BaseClass {
	@Test
	public void createAccount() {
		LoginPage lp=new LoginPage();
		lp.enterUsername()
		.enterPassword()
		.clickLoginButton()
		.clickCRMSFA()
		.clickAccountLink()
		.clickCreateAccountLink()
		.enterAccountName()
		.enterDescription()
		.clickCreateAccountButton()
		.verifyAccountDetails();
		
		
		
		

}
}
