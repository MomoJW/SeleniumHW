package ActionClasseExercises;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestCase2 {

	public static void main(String[] args) throws InterruptedException {

		String key = "webdriver.chrome.driver";
		String path = "C:\\Users\\mojw2\\OneDrive\\Desktop\\B7-Selenium\\chromedriver.exe";
		System.setProperty(key, path);
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		// Navigate to http://demo.guru99.com/test/simple_context_menu.html
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");

		// Click Double-Click Click me button
		WebElement dButton = driver.findElement(By.xpath("//*[contains(text(),'Double-Click')]"));
		Actions dClick = new Actions(driver);
		dClick.doubleClick(dButton).build().perform();

		// Get the text and display on console
		Alert text = driver.switchTo().alert();
		String alertText = text.getText();
		System.out.println("Display Text: " + alertText);
		Thread.sleep(3000);

		// Click “OK”
		text.accept();

		// Close the browser
		driver.quit();

	}
}
