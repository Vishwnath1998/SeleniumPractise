import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

//import org.openqa.selenium.edge.EdgeDriver;

//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.edge.EdgeDriver;

public class Parent_Child_Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
				System.setProperty("webdriver.Edge.driver", "/Users/ACER/OneDrive/Documents/msedgedriver");
				
				WebDriver driver = new EdgeDriver();
				
				
				driver.get("https://rahulshettyacademy.com/AutomationPractice/");
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));			
			    // Sibling - Child to Parent Traverse 			
				System.out.println(driver.findElement(By.xpath("//header/div/button[1] /following-sibling::button[1]")).getText());				
				//Parent to Child Traverse 	
				System.out.println(driver.findElement(By.xpath("//header/div/button[1] /parent::div/button[2]")).getText());
				
				
				System.out.println(driver.findElement(By.xpath("//button[contains(text(),'Home')]")).getText());
				
				
                 
				

	}

}
