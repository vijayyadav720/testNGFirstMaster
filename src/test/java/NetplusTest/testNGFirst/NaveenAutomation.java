package NetplusTest.testNGFirst;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NaveenAutomation extends FirstTestNG{
	
	@Test(priority =1)
	public void login()
	{
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
	}
	
	@DataProvider
	public Object[][] dataUser()
	{
		return new Object[][]{ 
			{"vijay","yadav","vijay@gmail.com","888888","password"},
			{"first", "FirstLast", "first@gmail.com","1111111","pass1111"}
			
		};
		
	}
	
	@Test(dataProvider="dataUser" , priority=2 , dependsOnMethods = "login")
	public void negativeValues(String first, String last, String email,String tele, String pass)
	{
		driver.findElement(By.cssSelector("input[id='input-firstname']")).clear();
		driver.findElement(By.cssSelector("input[id='input-firstname']")).sendKeys(first);
		
		driver.findElement(By.cssSelector("input[id='input-lastname']")).clear();
		driver.findElement(By.cssSelector("input[id='input-lastname']")).sendKeys(last);
		
		driver.findElement(By.cssSelector("input[id='input-email']")).clear();
		driver.findElement(By.cssSelector("input[id='input-email']")).sendKeys(email);
		
		driver.findElement(By.cssSelector("input[id='input-telephone']")).clear();
		driver.findElement(By.cssSelector("input[id='input-telephone']")).sendKeys(tele);
		
		driver.findElement(By.cssSelector("input[id='input-password']")).clear();
		driver.findElement(By.cssSelector("input[id='input-password']")).sendKeys(pass);
		
		
		
	}

}
