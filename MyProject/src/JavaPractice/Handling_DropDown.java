package JavaPractice;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Handling_DropDown 
{
	
	public static void main(String[] args) throws Exception
	{
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://toolsqa.com/automation-practice-form/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		new Select(driver.findElement(By.id("continents"))).selectByIndex(1);
		
		Select s=new Select(driver.findElement(By.id("continents")));
		List<WebElement> lst=s.getOptions();
		int Length=lst.size();
		for(int i=0;i<Length;i++)
		{
			String Str=s.getOptions().get(i).getText();
			System.out.println(Str);
			if(Str.matches("Antartica"))
			{
				s.selectByIndex(i);
				System.out.println("The selected country is "+ s.getOptions().get(i).getText());
				break;
			}
			
		}
		driver.quit();
	}

}
