import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionMouse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.Edge.driver", "/Users/ACER/OneDrive/Documents/msedgedriver");

		WebDriver driver = new EdgeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.amazon.com/");
		
		
		
		Actions a = new Actions(driver);
		
		
		// Mouse Over // hover
//		a.moveToElement(driver.findElement(By.cssSelector("a[id='nav-link-accountList']"))).build().perform();
		
		WebElement move = driver.findElement(By.cssSelector("a[id='nav-link-accountList']"));
		
		
		// Enter the Text in Search
		//a.moveToElement(driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"))).click().keyDown(Keys.SHIFT).sendKeys("hello").build().perform();
		
		
		// Double Click
		a.moveToElement(driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();

		
		
	//	a.moveToElement(move).build().perform();
		
		a.moveToElement(move).contextClick().build().perform();
		
																															

	}
	
	


}
