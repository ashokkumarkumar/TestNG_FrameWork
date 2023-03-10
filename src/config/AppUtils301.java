package config;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class AppUtils301 {
public static WebDriver driver;
@BeforeMethod
public static void setup() throws Throwable
{
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("");
	driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
	Thread.sleep(3000);
	Reporter.log("running pre condition",true);
	
}
@AfterMethod
public static void teardown() throws Throwable
{
	Reporter.log("running post condition",true);
	Thread.sleep(3000);
	driver.close();
}
}
