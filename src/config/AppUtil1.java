package config;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class AppUtil1 {
public static WebDriver driver;
@BeforeTest
public static void setup()
{
driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://primusbank.qedgetech.com/");
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.findElement(By.name("txtuId")).sendKeys("Admin");
driver.findElement(By.name("txtPword")).sendKeys("Admin");
driver.findElement(By.name("login")).click();
Reporter.log("Running Pre-condition",true);
}
@AfterTest
public static void tearDown()
{
driver.close();
Reporter.log("Running Post-condition",true);
	
}
}