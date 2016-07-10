package JavaPractice;

import java.util.ArrayList;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Hdfc_alert 
{
	
	public static void main(String[] args) throws Exception 
	{
	  FirefoxDriver driver=new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.get("http://www.hdfcbank.com");
	  Thread.sleep(10000);
	  driver.findElement(By.id("loginsubmit")).click();
	  Thread.sleep(10000);
      ArrayList<String> lst=new ArrayList<String>(driver.getWindowHandles());
      driver.switchTo().window(lst.get(1));
	  driver.findElement(By.xpath("//img[@alt='Continue']")).click();
	  Thread.sleep(3000);
	  driver.switchTo().frame("login_page");
	  //driver.findElement(By.name("fldLoginUserId")).sendKeys("5674345");
	  driver.findElement(By.xpath("//img[@alt='continue']")).click();
	  
	  Alert a=driver.switchTo().alert();
	  System.out.println(a.getText());
	  a.accept();
	  

	}
	
}
