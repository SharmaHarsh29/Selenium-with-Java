package automationTesting;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class NewURLautomationClass4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HARSH SHARMA\\Downloads\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		WebElement alert1 = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		alert1.click();
		Alert a = driver.switchTo().alert();
		a.accept();
		WebElement alert2 = driver.findElement(By.xpath("//a[normalize-space()='Alert with OK & Cancel']"));
		alert2.click();
		WebElement displaybox1 = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		displaybox1.click();
		driver.switchTo().alert();
		a.dismiss();
		WebElement alert3 = driver.findElement(By.xpath("//a[normalize-space()='Alert with Textbox']"));
		alert3.click();
		WebElement displaybox2 = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
		displaybox2.click();
		driver.switchTo().alert();
		a.sendKeys("HARSH SHARMA");
		a.accept();
		//a.dismiss();
		
		// TODO Auto-generated method stub

	}

}
