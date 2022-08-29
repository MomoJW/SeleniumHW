package ActionClasseExercises;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestCase1 {

	public static void main(String[] args) {

		String key = "webdriver.chrome.driver";
		String path = "C:\\Users\\mojw2\\OneDrive\\Desktop\\B7-Selenium\\chromedriver.exe";
		System.setProperty(key, path);
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		//Navigate to http://demo.guru99.com/test/simple_context_menu.html
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		WebElement right = driver.findElement(By.xpath("//*[contains(text(),'right click me')]"));

		//Click Right Click me button
		Actions rClick = new Actions(driver);
		rClick.contextClick(right).build().perform();

		//Click copy
		WebElement copyText = driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[3]/span"));
		copyText.click();

		//Get the text and display console
		Alert alertBox = driver.switchTo().alert();
		
		//Click "OK"
		alertBox.accept();

		//Close the browser
		driver.quit();

	}
}