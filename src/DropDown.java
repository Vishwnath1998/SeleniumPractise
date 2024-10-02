import java.util.List;

import javax.print.attribute.standard.JobSheets;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.asm.Advice.Argument;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        System.setProperty("webdriver.Edge.driver", "/Users/ACER/OneDrive/Documents/msedgedriver");
		
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		

		// DropDown with Select Tag - Static
	   WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
	   
//	   Actions act = new Actions(driver);
//	   
//	   act.moveToElement(staticDropdown).click().build().perform();
	   
	   JavascriptExecutor js  = (JavascriptExecutor)driver;
	   
	  
	   
	
	   
	   
	   
	   
//		
//		
//		
//		
//		Select drop = new Select(staticDropdown);
//		
//		drop.selectByIndex(2);
//		
//		System.out.println(drop.getFirstSelectedOption().getText());
//		
//		//drop.selectByVisibleText("AED");
//		
//		System.out.println(drop.getFirstSelectedOption().getText());
		
		//drop.selectByValue("INR");
		
		//System.out.println(drop.getFirstSelectedOption().getText());
		
		
		
		
		// Print All Dropdown Input 
		
		
//		Select s1  =  new Select (driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
//		
//		List<WebElement> opt  = s1.getOptions();
//		
//		int size = opt.size();
//		
//		for(int i = 1 ; i<size ;i++) {
//			
//			String output = opt.get(i).getText();
//			
//			System.out.println(output);
//		}
//		
		
	  	
		
		
		
		
		
		
		
	}

}
