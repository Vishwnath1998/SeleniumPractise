import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class HttpCertificates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		
		EdgeOptions options = new EdgeOptions();
		
		options.setAcceptInsecureCerts(true);
		
		System.setProperty("webdriver.Edge.driver", "/Users/ACER/OneDrive/Documents/msedgedriver");

		WebDriver driver = new EdgeDriver(options);

		driver.manage().window().maximize();

		driver.get("https://expired.badssl.com/");
		
		System.out.println(driver.getTitle()); // Privacy Error
		
		
		
		
		driver.quit();
		
	}
	
	

}
