import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new EdgeDriver();
		
		
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		
		driver.manage().window().maximize();
		
		
		Thread.sleep(2000L);
		
		driver.findElement(By.name("name")).sendKeys("Vishwanath");
		
		driver.findElement(By.name("email")).sendKeys("telangvishwnath@gmail.com");
		
		
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("vshu123");
		Thread.sleep(2000L);
		
		driver.findElement(By.cssSelector("div[class='form-check'] input[class*=form]")).click();
		
		
		
		driver.findElement(By.id("exampleFormControlSelect1")).click();
		
		
		driver.findElement(By.xpath("//option[text() ='Female']")).click();
		
		//System.out.println(driver.findElement(By.xpath("//option[text() ='Female']")).getText());
		
		Thread.sleep(3000L);
		
		driver.findElement(By.id("inlineRadio2")).click();
		
		
		driver.findElement(By.xpath("//input[@type = 'submit']")).click();
		
		//div[@class='alert alert-success alert-dismissible']
		
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		System.out.println(driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText());
		
		driver.close();	

	}

}
