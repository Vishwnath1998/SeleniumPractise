import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;

import static org.openqa.selenium.support.locators.RelativeLocator.*;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByTagName;

public class Relative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.Edge.driver", "/Users/ACER/OneDrive/Documents/msedgedriver");

		WebDriver driver = new EdgeDriver();

		driver.manage().window().maximize();
		
	//	driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		driver.navigate().to("https://rahulshettyacademy.com/angularpractice/");
		
		driver.navigate().refresh();
		
		
		
		// above
		
		WebElement nameBoxElement = driver.findElement(By.cssSelector("[name='name']"));
		
		System.out.println(driver.findElement(with(By.tagName("label")).above(nameBoxElement)).getText());
		
		//below
		
		WebElement datebrith = driver.findElement(By.cssSelector("[for='dateofBirth']"));
		
		driver.findElement(with(By.tagName("input")).below(datebrith)).click();
		
		//left 
		
		WebElement  rdibtnElement =   driver.findElement(By.xpath("//label[text()='Check me out if you Love IceCreams!']"));
				
		driver.findElement(with(By.tagName("input")).toLeftOf(rdibtnElement)).click();
				
		//right
		
		WebElement btnElement =   driver.findElement(By.id("inlineRadio1"));
		
		System.out.println(driver.findElement(with(By.tagName("label")).toRightOf(btnElement)).getText());
		
			
		//driver.quit();

		
		
	}

}
