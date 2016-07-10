package JavaPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Google 
{
	FirefoxDriver driver;
	
	public void search()
	{
		driver = new FirefoxDriver();
		driver.get("https://www.google.co.in");
		driver.findElement(By.name("q")).sendKeys("Java");
		System.out.println(driver.findElement(By.name("q")).getAttribute("value"));
		
	}
	
	public void open()
	{
		driver.findElement(By.name("btnG")).click();
	}
	
	public static void main(String[] args) 
	{
		Google g = new Google();
		g.search();
		g.open();
	
	}

}
