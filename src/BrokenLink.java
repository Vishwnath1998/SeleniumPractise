import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class BrokenLink {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
     
		
		System.setProperty("webdriver.Edge.driver", "/Users/ACER/OneDrive/Documents/msedgedriver");

		WebDriver driver = new EdgeDriver();

		driver.manage().window().maximize();
		
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		// broken URL
		// step 1 = get all URL tried up to link using selenium
		// Java methods Call URL & get Status Code
		// if status code > 400 then URL not working 
		
		//String url =  driver.findElement(By.cssSelector("a[href*='brokenlink']")).getAttribute("href");
		
		List<WebElement> links = driver.findElements(By.cssSelector("li [class='gf-li'] a"));
		
		
		
		for(WebElement link : links) {
			
			String url = link.getAttribute("href");
			
			HttpURLConnection Conn = (HttpURLConnection)new URL(url).openConnection();
			
			Conn.setRequestMethod("HEAD");
			Conn.connect();
			int respCode = Conn.getResponseCode();
			System.out.println(respCode);
			
			if(respCode>400) {
				
				System.out.println("The link with text" + link.getText() + "is broken with Code" + respCode);
			}
			
		}
		
		
		//driver.quit();
		
	}
	

}
