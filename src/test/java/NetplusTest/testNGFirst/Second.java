package NetplusTest.testNGFirst;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;
import com.beust.jcommander.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Second {
	
	
	
	@Test
	public void executeTest()
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		
	}

}
