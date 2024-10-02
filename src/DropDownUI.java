import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DropDownUI {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// System.setProperty("webdriver.Edge.driver",
		// "/Users/ACER/OneDrive/Documents/msedgedriver");

		WebDriver driver = new EdgeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.easemytrip.com/");

		driver.findElement(By.id("ptravlrNo")).click();
		Thread.sleep(2000L);

		int i = 1;

		while (i < 5) {
			driver.findElement(By.id("add")).click();
			i++;
		}

		driver.findElement(By.id("traveLer")).click();
		// System.out.println(driver.findElement(By.id("traveLer")).click());
		// System.out.println(driver.findElement(By.id("ptravlrNo")).getText());

		driver.findElement(By.id("frmcity")).click();

		// System.out.println(driver.findElement(By.xpath("(//li/div[@class='mflexcol'])[3]")).click());
		// System.out.println(driver.findElement(By.xpath("(//li/div[@class='mflexcol'])[3]")).getText());
		// driver.findElement(By.xpath("(//li/div[@class='mflexcol'])[3]")).getText();

		driver.findElement(By.id("airport2")).click();

		System.out.println(driver.findElement(By.id("airport2")).getText());

		Thread.sleep(2000);

		driver.findElement(By.id("tocity")).click();

		driver.findElement(By.xpath("//div[@id='toautoFill'] //p[@id='airport12']")).click();

		System.out.println(driver.findElement(By.xpath("//div[@id='toautoFill'] //p[@id='airport12']")).getText());

		// driver.quit();

		// Calender DropDown

		Thread.sleep(2000L);

		driver.findElement(By.cssSelector(".active-date")).click();

		System.out.println(driver.findElement(By.cssSelector(".active-date")).getText());

	}

}
