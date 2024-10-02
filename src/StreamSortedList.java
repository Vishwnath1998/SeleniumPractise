import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

public class StreamSortedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.Edge.driver", "/Users/ACER/OneDrive/Documents/msedgedriver");

		WebDriver driver = new EdgeDriver();

		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		//Capture All Elements
		driver.findElement(By.xpath("//tr/th[1]")).click();
		List <WebElement> ElementList = driver.findElements(By.xpath("//tr/td[1]"));
		
		
		// Collect all data in list
		
		List<String> OriginalData = ElementList.stream().map(s->s.getText()).collect(Collectors.toList());
		
		// Sorted List 
		
		List<String> SortedList = OriginalData.stream().sorted().collect(Collectors.toList());
		
		System.out.println(SortedList);
		
		
		// Compare list is Sort ot not 
		
		Assert.assertTrue(OriginalData.equals(SortedList));
		
		
		// Scan all data in list with Get Text  - > Beans Print Price of Rice
		
		List <String> price = ElementList.stream().filter(s->s.getText().contains("Beans")).map(s->getPriceVeggies(s)).collect(Collectors.toList());
		
		price.forEach(a->System.out.println(a));
		
		
		
		driver.quit();
					

	}
	

	private static String getPriceVeggies(WebElement s) {
		// TODO Auto-generated method stub
		String pricevalue = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return pricevalue;
	}
	



}
