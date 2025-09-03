package Base;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

 //public ChromeDriver driver;
	public class BaseClass {
	public static org.openqa.selenium.chrome.ChromeDriver driver;

	@BeforeMethod
	public void preConditions() {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("guest");
		driver=new ChromeDriver(options);
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();

	}

	@AfterMethod
	public void postConditions() {
		driver.close();

	}


	}



