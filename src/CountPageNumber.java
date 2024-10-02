import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class CountPageNumber {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		
		 System.setProperty("webdriver.Edge.driver", "/Users/ACER/OneDrive/Documents/msedgedriver");
			
			WebDriver driver = new EdgeDriver();
			
			driver.manage().window().maximize();

			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			
			
		// Count the Number of Tag on Page
			
			System.out.println(driver.findElements(By.tagName("a")).size());
			
			
		// Count the Number of Tag Present in Footer
			WebElement FooterDriver = driver.findElement(By.id("gf-BIG"));
			
			System.out.println(FooterDriver.findElements(By.tagName("a")).size());
			
			
	   // Count the Number of Tag present in Each Column
			
			WebElement ColoumninFooter = FooterDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
			
			System.out.println(ColoumninFooter.findElements(By.tagName("a")).size());
			
	  // Click button to each Column to link & Check id the Pages are Opening
			
			for(int i = 1; i<ColoumninFooter.findElements(By.tagName("a")).size(); i++) {
				
				
				String ClickonlinkTab = Keys.chord(Keys.CONTROL,Keys.ENTER);
				
				
				ColoumninFooter.findElements(By.tagName("a")).get(i).sendKeys(ClickonlinkTab);
				
				Thread.sleep(5000L);
			
			}
			
			
						 Set <String> abc = driver.getWindowHandles();
						 
						 java.util.Iterator<String> It = abc.iterator();
						 
						 
						 while(It.hasNext())
							 
						 {
							 
							 driver.switchTo().window(It.next());
							 
							 System.out.println(driver.getTitle());
							 
						 }
			
			
			
			
			driver.close();
			
			

	}

}
