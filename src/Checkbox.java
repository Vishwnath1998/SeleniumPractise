import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

public class Checkbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
      System.setProperty("webdriver.Edge.driver", "/Users/ACER/OneDrive/Documents/msedgedriver");
		
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		
		//System.out.println(driver.findElement(By.cssSelector("input[id*='IndArm']")).isSelected());
		
		
		//driver.findElement(By.cssSelector("input[id*='IndArm']")).click();
		
		
		//System.out.println(driver.findElement(By.cssSelector("input[id*='IndArm']")).isSelected());
		
		//Thread.sleep(2000);
		//using Assertion find out True or False
		//driver.findElement(By.cssSelector("input[id*='IndArm']")).click();
		
		//Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='IndArm']")).isSelected());
		
		Thread.sleep(3000);
		
       // Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());	
		
	  //	Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());

        
		driver.findElement(By.cssSelector("input[name='ctl00$mainContent$chk_friendsandfamily']")).click();
		
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		
		//System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		//System.out.println(driver.findElement(By.cssSelector("input[type='checkbox']")).size());
		
		driver.close();
		

	}

}
