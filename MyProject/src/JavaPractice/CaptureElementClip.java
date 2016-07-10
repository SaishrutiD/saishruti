package JavaPractice;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CaptureElementClip {

	private WebDriver driver;

	private String baseUrl;

	public void setUp() throws Exception {

		driver = new FirefoxDriver();

		baseUrl = "http://google.com";

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}
	public void testGoogle() throws IOException {
		driver.get(baseUrl);



		File screen = ((TakesScreenshot) driver)

		.getScreenshotAs(OutputType.FILE);

		

		WebElement googleMenu = driver.findElement(By.className("gb_b gb_Rb"));

		Point point = googleMenu.getLocation();



		int width = googleMenu.getSize().getWidth();

		int height = googleMenu.getSize().getHeight();

		BufferedImage img = ImageIO.read(screen);

		BufferedImage dest = img.getSubimage(point.getX(), point.getY(), width,

		height);

		ImageIO.write(dest, "png", screen);

		File file = new File("Menu.png");

		FileUtils.copyFile(screen, file);

	}

	
	public void tearDown() throws Exception {

		driver.quit();

	}
	
	public static void main(String[] args) throws Exception 
	{
		CaptureElementClip clip=new CaptureElementClip();
		clip.setUp();
		clip.testGoogle();
		clip.tearDown(); 
		
	}

}