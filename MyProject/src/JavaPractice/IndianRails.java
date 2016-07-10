package JavaPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IndianRails 
{
	FirefoxDriver driver;
	
	public void open()
	{
		driver = new FirefoxDriver();
		driver.get("http://www.indianrail.gov.in/");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.linkText("Trains between Stations")).click();	
	}
	
	public void book() throws InterruptedException
	{
		WebElement from= driver.findElement(By.id("txtStationFrom"));
		from.sendKeys("LPI");
		from.sendKeys(Keys.ENTER);
		
		WebElement to= driver.findElementById("txtStationTo");
		to.sendKeys("UBL");
		to.sendKeys(Keys.ENTER);
		
		org.openqa.selenium.support.ui.Select S = new org.openqa.selenium.support.ui.Select(driver.findElement(By.name("lccp_classopt")));
		S.selectByValue("1A");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//src[@alt='Calender']")).click();
		//driver.findElement(By.id("monthSelect")).click();
		//org.openqa.selenium.support.ui.Select S1 = new org.openqa.selenium.support.ui.Select(driver.findElement(By.id("monthDiv_8_2016")).findElement(By.xpath("//td[@class='calendar_week_column']")));
		//S1.selectByVisibleText("12");
	}
	
	
	public static void main(String[] args) throws InterruptedException 
	{
		IndianRails I = new IndianRails();
		I.open();
		I.book();

	}

}
