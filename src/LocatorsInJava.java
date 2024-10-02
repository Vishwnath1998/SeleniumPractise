import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

public class LocatorsInJava {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.Edge.driver", "/Users/ACER/OneDrive/Documents/msedgedriver");
		
		WebDriver driver = new EdgeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		driver.findElement(By.id("inputUsername")).sendKeys("Vishu");
		driver.findElement(By.name("inputPassword")).sendKeys("Robot");
		driver.findElement(By.className("signInBtn")).click();
		//driver.close();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		Thread.sleep(1000);
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.xpath("//input[@placeholder='Name'][1]")).sendKeys("John");
		driver.findElement(By.xpath("//input[@type='text'][1]")).clear();
		driver.findElement(By.xpath("//input[@placeholder='Name'][1]")).sendKeys("Vishu");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("xyz");
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("123456789");
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']//button[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("Vishu"); // css TAKE id LIKE #IDNAME 
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.cssSelector(".submit.signInBtn")).click();
		
		//driver.findElement(By.)
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.tagName("p")).getText());
	    Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
	    driver.quit();
	    
	   
	    System.out.println( driver.findElement(By.cssSelector("div[class ='login-container'] h2")).getText());
	    //driver.findElement(By.cssSelector("div[class ='login-container'] h2")).getText();
			

	}

}
