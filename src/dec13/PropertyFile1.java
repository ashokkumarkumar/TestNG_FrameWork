package dec13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PropertyFile1 {
WebDriver driver;
Properties p;
@Test
public void ligin() throws Throwable
{
	p=new Properties();
	p.load(new FileInputStream("D:\\\\11oclockSelenium\\\\TestNG_FrameWork\\\\login.properties"));
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(p.getProperty("url"));
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.xpath(p.getProperty("objuser"))).sendKeys(p.getProperty("EnterUser"));
	driver.findElement(By.xpath(p.getProperty("objpass"))).sendKeys(p.getProperty("Enterpass"));
	driver.findElement(By.xpath(p.getProperty("objLogin"))).click();
	driver.close();
	}
}
