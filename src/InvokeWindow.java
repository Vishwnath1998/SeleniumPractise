import java.io.File;
import java.io.IOException;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;

public class InvokeWindow {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.Edge.driver", "/Users/ACER/OneDrive/Documents/msedgedriver");

		WebDriver driver = new EdgeDriver();

		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		// Switching Window
		
		driver.switchTo().newWindow(WindowType.TAB);
		
		 Set<String>handleSet =   driver.getWindowHandles();
		 
		 java.util.Iterator<String> It = handleSet.iterator();
		 
		 String parentIDString =  It.next();
		 
		 String childIdString = It.next();
		 
		 
		 driver.switchTo().window(childIdString);
		 
		 driver.get("https://rahulshettyacademy.com/");
		 
		 
		 
		 String courseName =  driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p']")).get(1).getText();
		 
		 
		 // Again Swith to ParentWindow
		 
		 driver.switchTo().window(parentIDString);
		 
		 WebElement name = driver.findElement(By.cssSelector("[name='name']"));
		 
		 
		 name.sendKeys(courseName);
		 
		 
		 
		 // Capture Screenshot for Particular 
		 
		 
		   File file =  name.getScreenshotAs(OutputType.FILE);
		 
		   FileUtils.copyFile(file, new File("logo.png"));
		   
		 // get Height & Width
		   
		  System.out.println(name.getRect().getDimension().getHeight());
		  System.out.println(name.getRect().getDimension().getWidth());
		 //driver.close();
		

	}

}
