package ActionClasseExercises;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TextCase3 {
	
	public static void main(String[] args) throws InterruptedException {
		
		String key = "webdriver.chrome.driver";
		String path = "C:\\Users\\mojw2\\OneDrive\\Desktop\\B7-Selenium\\chromedriver.exe";
		System.setProperty(key, path);
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		//Navigate to http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html
		driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		//Drag each capital and drop to the appropriate country field box
		WebElement oslo = driver.findElement(By.xpath("//*[@id='box1']"));
		WebElement stockholm = driver.findElement(By.xpath("//*[@id=\"box2\"]"));
		WebElement washington = driver.findElement(By.xpath("//*[@id=\"box3\"]"));
		WebElement copenhagen = driver.findElement(By.xpath("//*[@id=\"box4\"]"));
		WebElement seoul = driver.findElement(By.xpath("//*[@id=\"box5\"]"));
		WebElement rome = driver.findElement(By.xpath("//*[@id=\"box6\"]"));
		WebElement madrid = driver.findElement(By.xpath("//*[@id=\"box7\"]"));
		
		WebElement norway = driver.findElement(By.xpath("//*[@id=\"box101\"]"));
		WebElement sweden = driver.findElement(By.xpath("//*[@id=\"box102\"]"));
		WebElement unitedStates = driver.findElement(By.xpath("//*[@id=\"box103\"]"));
		WebElement denmark = driver.findElement(By.xpath("//*[@id=\"box104\"]"));
		WebElement southKorea = driver.findElement(By.xpath("//*[@id=\"box105\"]"));
		WebElement italy = driver.findElement(By.xpath("//*[@id=\"box106\"]"));
		WebElement spain = driver.findElement(By.xpath("//*[@id=\"box107\"]"));
		
		Actions action = new Actions(driver);
		
		action.dragAndDrop(oslo,norway).release().build().perform();
		Thread.sleep(1000);
		
		action.dragAndDrop(stockholm,sweden).release().build().perform();
		Thread.sleep(1000);
		
		action.dragAndDrop(washington,unitedStates).release().build().perform();
		Thread.sleep(1000);
		
		action.dragAndDrop(copenhagen,denmark).release().build().perform();
		Thread.sleep(1000);
		
		action.dragAndDrop(seoul,southKorea).release().build().perform();
		Thread.sleep(1000);
		
		action.dragAndDrop(rome,italy).release().build().perform();
		Thread.sleep(1000);
		
		action.dragAndDrop(madrid,spain).release().build().perform();
		Thread.sleep(1000);
		
		//Close the browser
		driver.quit();

	}

}
