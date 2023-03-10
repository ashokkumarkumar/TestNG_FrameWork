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
