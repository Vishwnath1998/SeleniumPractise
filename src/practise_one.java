import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class practise_one {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String user = "john";
		String name = "Doe";

		WebDriver driver = new EdgeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.spicejet.com/profile/sign-up");
		driver.manage().window().maximize();

		// Sign Up Page

		driver.findElement(By.xpath("//input[@placeholder=\"e.g. John\"]")).sendKeys(user);
		driver.findElement(By.cssSelector("input[placeholder='Doe']")).sendKeys(name);

		WebElement headinglinE = driver.findElement(By.xpath(
				"//div[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-18u37iz r-1wtj0ep r-5oul0u r-utggzx r-1f1sjgu']"));

		// Calender

		driver.findElement(By.cssSelector("input[placeholder*='DD/MM']")).click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		wait.until(ExpectedConditions.visibilityOf(headinglinE));

		String month = driver.findElement(By.xpath("//div[@class='css-76zvg2 r-jwli3a r-n6v787']")).getText();

		String day = driver.findElement(By.xpath("//div[@class='css-76zvg2 r-jwli3a r-adyw6z r-1kfrs79']")).getText();

		System.out.println(month);
		System.out.println(day);

		while (!(month.equals("Jul") && day.equals("1994"))) {

//			driver.findElement(By.cssSelector("(div[class='css-1dbjc4n r-1awozwy r-19m6qjp r-18u37iz r-1wtj0ep r-5oul0u r-utggzx r-1f1sjgu'] div:nth-child(3)")).click();

			driver.findElement(By.cssSelector("svg[data-testid='svg-img'][viewBox='0 0 6 10']")).click();
			month = driver.findElement(By.xpath("//div[@class='css-76zvg2 r-jwli3a r-n6v787']")).getText();
			System.out.println(month);
			day = driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-1loqt21 r-1otgn73'])[2]")).getText();
			System.out.println(day);


		}

		driver.findElement(By.xpath("(//div[@class='css-1dbjc4n'])[10]//div[text()='10']")).click();

	}

}
