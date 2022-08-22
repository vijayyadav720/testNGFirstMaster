package NetplusTest.testNGFirst;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTestNG {
static WebDriver driver;	
	
	@BeforeTest
	public void init()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
	}
	
	
	

}
