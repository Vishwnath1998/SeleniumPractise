import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class AdditemCart {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.Edge.driver", "/Users/ACER/OneDrive/Documents/msedgedriver");
		
		// implicit wait - It is use for global while any browser take time to load
		
		WebDriver driver = new EdgeDriver();
		
         driver.manage().timeouts().implicitlyWait(5 , TimeUnit.SECONDS);

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#");
		
		
		String[] vegetableName = { "Cucumber", "Brocolli", "Beetroot" ,"Tomato"};
		
		Thread.sleep(3000);
		additems(driver , vegetableName);
		
		
		
		
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		
		
		System.out.print(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		
	
	}
	
		public static void additems(WebDriver driver , String[] vegetableName) {
		

		List<WebElement> product = driver.findElements(By.cssSelector("h4.product-name"));
		                               
		int j = 0;

		// we need to iterate in loop

		for (int i = 0; i < product.size(); i++) {

			// its format to get Actual Vegetable Name
			// eg-Cauliflower - 1 Kg it is split from name & - 1 Kg
			String[] name = product.get(i).getText().split("-");

			String formattedName = name[0].trim();
			// above result will show only name eg - Cauliflower

			// Convert Array into List for search

			List itmeNeededList = Arrays.asList(vegetableName);

			// Check whether name you Extracted is present in arraylost or not

			if (itmeNeededList.contains(formattedName)) {

				j++; // Number of Items added

				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

				if (j == vegetableName.length) {

					break;
				}

			}

		}
		
		driver.close();

		// Thread.sleep(2000L);
		
	}

	

}
