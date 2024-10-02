import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

public class CheckBoxExercise {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriver  driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		
	//	Assert.assertFalse(driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).isSelected());
		
		driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).click();
		
	//	Assert.assertTrue(driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).isSelected());
		
		System.out.println(driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).isSelected());
		Thread.sleep(2000);
		
	//	driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).click();
		
	//	System.out.println(driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).isSelected());

		
		
		//Count the No. of CheckBoxes...
	
		
		driver.findElements(By.cssSelector("input[type='checkBox']")).size();
		
		System.out.println(driver.findElements(By.cssSelector("input[type='checkBox']")).size());
		
		driver.close();
		
	}

}
