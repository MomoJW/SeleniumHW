package ActionClasseExercises;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class TestCase2 {

	public static void main(String[] args) {
		
		String key = "webdriver.chrome.driver";
		String path = "C:\\Users\\mojw2\\OneDrive\\Desktop\\B7-Selenium\\chromedriver.exe";
		System.setProperty(key, path);
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		
		WebElement el = driver.findElement(By.xpath("//*[contains(text(),'Double-Click')]"));

		String exptText = "You have done a double click";

		Actions action = new Actions(driver);

		action.doubleClick(el).build().perform();

		String actText = driver.findElement(By.xpath("//*[contains(text(),'double click')]")).getText();

		System.out.println("Exp: " + exptText);
		System.out.println("Act: " + actText);

		Assert.assertEquals(actText, exptText, "Double Click Test Failed");
		
	}
}
