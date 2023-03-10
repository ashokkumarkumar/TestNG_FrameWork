package dec13;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo300 {

WebDriver driver;

@Test

public void verifyTitle()
{
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://google.com");
	
	String expectedtitle="Gmail";
	String actualtile=driver.getTitle();
	
	try {
	Assert.assertFalse(expectedtitle.equalsIgnoreCase(actualtile),"Title is not matching");
	}catch (Throwable t)
	{
		System.out.println(t.getMessage());
	}
	driver.close();
}
}
