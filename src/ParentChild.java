
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ParentChild {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new EdgeDriver();
		
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		
		driver.findElement(By.cssSelector(".blinkingText")).click();
		
			
		Set <String> windows = driver.getWindowHandles();  //[Parent , Child , Subchild]
		
		Iterator <String> it = windows.iterator();
		
		String ParentID = it.next();  
		
		String childID = it.next();
		
		
		// Switch Partition
		
		driver.switchTo().window(childID);
		
		System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
		
		
		driver.findElement(By.cssSelector(".im-para.red")).getText();
		
		String emailID = driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
		
		driver.switchTo().window(ParentID);
		
		
		driver.findElement(By.id("username")).sendKeys(emailID);
		
		
		
	//	driver.quit();
		

	}

}
