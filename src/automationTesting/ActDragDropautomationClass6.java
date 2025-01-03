package automationTesting;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class ActDragDropautomationClass6 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webDriver.chrome.driver","C:\\Users\\HARSH SHARMA\\Downloads\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/#google_vignette");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		
		WebElement FRAME = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(FRAME);
				
		WebElement IMG1 = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
		WebElement TRASH = driver.findElement(By.xpath("//div[@id='trash']"));
		Actions a = new Actions(driver);
		a.dragAndDrop(IMG1, TRASH).perform();
		
		WebElement IMG2 = driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));
		a.dragAndDrop(IMG2, TRASH).perform();
		
		WebElement IMG3 = driver.findElement(By.xpath("//img[@alt='Planning the ascent']"));
		a.dragAndDrop(IMG3, TRASH).perform();
		
		WebElement IMG4 = driver.findElement(By.xpath("//img[@alt='On top of Kozi kopka']"));
		a.dragAndDrop(IMG4, TRASH).perform();
				
		// TODO Auto-generated method stub

	}

}
