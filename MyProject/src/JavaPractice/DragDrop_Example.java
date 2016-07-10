package JavaPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class DragDrop_Example 
{

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://jqueryui.com/droppable/");
		WebDriverWait wait=new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("/html/body/div/div[2]/div/div[1]/iframe")));
		WebElement w1=driver.findElementById("draggable");
		WebElement w2=driver.findElementById("droppable");
		new Actions(driver).dragAndDrop(w1, w2).perform();
		String s1=driver.findElementByXPath("/html/body/div[2]/p").getText();
		Assert.assertEquals(s1, "Dropped!");
		System.out.println("The frame has been dragged and dropped");
	}

}
