import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.apache.commons.io.FileUtils;

public class Screenshots {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.Edge.driver", "/Users/ACER/OneDrive/Documents/msedgedriver");

		WebDriver driver = new EdgeDriver();

		driver.manage().window().maximize();
		
		driver.get("https://tahera-firdose.medium.com/why-webdriver-driver-new-chromedriver-7a97bcb04e30");
		
//		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		
//		FileUtils.copyFile(src,new File("C:\\Users\\ACER\\screenshots.png"));
		
		// Screenshot
		
		TakesScreenshot tS = (TakesScreenshot)driver;
		
		File src  = tS.getScreenshotAs(OutputType.FILE);
		
		File tarFile = new File(".\\Screenshot\\home.png");
		
		FileUtils.copyFile(src, tarFile);
		
		
		
	   // SCreenshot as Section 	
		
		WebElement img = driver.findElement(By.xpath("//img[@width='508']"));
		
		File srcFile = img.getScreenshotAs(OutputType.FILE);
		
		File trgFile = new File(".\\Screenshot\\Section.png");
		
		FileUtils.copyFile(srcFile, trgFile);
		
		
		// Screenshot as Element
		
//		  WebElement element =  driver.findElement(By.cssSelector("h2[id='2c54']"));
//		  
//		  File srcFile = element.getScreenshotAs(OutputType.FILE);
//			
//		  File trgFile = new File(".\\Screenshot\\element.png");
//			
//		  FileUtils.copyFile(srcFile, trgFile);
			
		
		  
		  
	}

}
