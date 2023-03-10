package dec8;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import config.AppUtil1;

public class FirstTestNGClass1 extends AppUtil1 {
@Test
public void branches()
{
	driver.findElement(By.xpath("(//img)[5]")).click();
	Reporter.log("executing branch test",true);
	
}
@Test
public void roles()
{
	driver.findElement(By.xpath("(//img)[6]")).click();
	Reporter.log("executing roles test",true);
}
@Test
public void users()
{
	driver.findElement(By.xpath("(//img)[7]")).click();
	Reporter.log("executing users test",true);
}

}
