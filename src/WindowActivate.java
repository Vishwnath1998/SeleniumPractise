import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WindowActivate {

	public static void main(String[] args) {
			
		// TODO Auto-generated method stub
		
		

		System.setProperty("webdriver.Edge.driver", "/Users/ACER/OneDrive/Documents/msedgedriver");
		
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://google.com");
		
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
	
	}
	

}
