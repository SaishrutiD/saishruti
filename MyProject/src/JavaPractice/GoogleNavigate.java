package JavaPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleNavigate 
{

	public static void main(String[] args) throws Exception 
	{
	
		FirefoxDriver driver = new FirefoxDriver();
		FirefoxDriver.Navigation move =driver.navigate();
		move.to("https://www.google.co.in");
		driver.findElement(By.id("lst-ib")).sendKeys("Java");
		driver.findElementByName("btnG").click();
		Thread.sleep(5000);
		move.back();
		Thread.sleep(5000);
		move.forward();
		move.refresh();
		driver.quit();
		//driver.close(); is same as quit

	}

}
