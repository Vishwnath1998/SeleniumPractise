import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

public class ScrollingWebPage {


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.Edge.driver", "/Users/ACER/OneDrive/Documents/msedgedriver");

		WebDriver driver = new EdgeDriver();

		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,500)");
		
		WebElement button = driver.findElement(By.id("opentab"));
//		js.executeScript("arguments[0].style.border='5px solid green'", button);
		
			
//		js.executeScript("document.getElementById('checkBoxOption1').click();");
		
		
		Thread.sleep(3000);
		
	   js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		
		// Number of total Count Present in one Row
		
        List<WebElement> values = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)")); 
        
        
         int sum = 0;
        for(int i = 0 ; i<values.size();i++) {
        	
        	sum = sum + Integer.parseInt(values.get(i).getText());
        				
        }
        
        System.out.println(sum);
		
		driver.findElement(By.cssSelector(".totalAmount")).getText();
		
		int total = Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());
		
		Assert.assertEquals(sum, total);
		
	}

}
