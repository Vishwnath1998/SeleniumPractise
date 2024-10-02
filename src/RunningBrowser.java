import org.openqa.selenium.edge.EdgeDriver;

public class RunningBrowser {
	
	public static void main(String[]args) {
		
		
		
		System.setProperty("webdriver.Edge.driver", "/Users/ACER/OneDrive/Documents/msedgedriver");
		
		EdgeDriver driver = new EdgeDriver();
		
		driver.get("https://courses.rahulshettyacademy.com/courses");
		System.out.print(driver.getTitle());
		driver.quit();
	}
	
	

}
