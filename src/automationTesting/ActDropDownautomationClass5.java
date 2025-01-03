package automationTesting;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActDropDownautomationClass5 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.drive","C:\\Users\\HARSH SHARMA\\Downloads\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://uncodemy.com/");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		WebElement CAT = driver.findElement(By.xpath("//span[@id='categoriesBtn']"));
		Actions a = new Actions(driver);
		a.moveToElement(CAT).perform();
		WebElement CAT3 = driver.findElement(By.xpath("(//menuitem[@class=\"SEt\"])[3]"));
		a.moveToElement(CAT3).perform();
		WebElement SUBCAT1 = driver.findElement(By.xpath("//a[normalize-space()='Automation Testing']"));
		SUBCAT1.click();
		// TODO Auto-generated method stub

	}

}
