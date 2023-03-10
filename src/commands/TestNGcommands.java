									//config	AppUtil 1
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
driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
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
	
}}
//====================================================================================================
								//dec8	FirstTestNGClass 1	
package dec8;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import config.AppUtil;

public class FirstTestNGClass extends AppUtil {
@Test
public void branches()
	{
		driver.findElement(By.xpath("(//img)[5]")).click();
		Reporter.log("executing Branch Test",true);
	}
@Test
public void roles()
	{
		driver.findElement(By.xpath("(//img)[6]")).click();
		Reporter.log("executing roles Test",true);
	}
@Test
public void users()
	{
		driver.findElement(By.xpath("(//img)[7]")).click();
		Reporter.log("executing users Test",true);

	}
	}
//===================================================================================================
	

								//config	AppUtil300
package config;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class AppUtil300 {
public static WebDriver driver;
@BeforeMethod
public static void setUp()throws Throwable
{
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://calc.qedgetech.com/");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	Thread.sleep(3000);
	Reporter.log("Running pre-condition",true);
}
@AfterMethod
public static void tearDown()throws Throwable
{
	Reporter.log("Running post-condition",true);
	Thread.sleep(3000);
	driver.close();
}
}
//========================================================================================
							//dec8	SecondTestNGClass300
package dec8;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import config.AppUtil1;

public class SecondTestNGClass300 extends AppUtil1 {
@Test
public void adition()throws Throwable
{
	driver.findElement(By.name("display")).sendKeys("56567");
	driver.findElement(By.xpath("(//input[@id='btn'])[6]")).click();
	driver.findElement(By.name("display")).sendKeys("874");
	driver.findElement(By.xpath("(//input[@id='btn'])[20]")).click();
	Thread.sleep(3000);
	Reporter.log("Executing Addtion test",true);
}
@Test
public void division()throws Throwable
{
	driver.findElement(By.name("display")).sendKeys("77665465");
	driver.findElement(By.xpath("(//input[@id='btn'])[21]")).click();
	driver.findElement(By.name("display")).sendKeys("5");
	driver.findElement(By.xpath("(//input[@id='btn'])[20]")).click();
	Thread.sleep(3000);
	Reporter.log("Executing Division test",true);
}
@Test
public void multipliation() throws Throwable
{
	driver.findElement(By.name("display")).sendKeys("7676");
	driver.findElement(By.xpath("(//input[@id='btn'])[16]")).click();
	driver.findElement(By.name("display")).sendKeys("76");
	driver.findElement(By.xpath("(//input[@id='btn'])[20]")).click();
	Thread.sleep(3000);
	Reporter.log("Executing multipliation test",true);
}
}
//=============================================================================
