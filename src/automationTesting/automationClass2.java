package automationTesting;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class automationClass2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HARSH SHARMA\\Downloads\\chromedriver-win64//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://20.193.138.147/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		//WebElement RH=driver.findElement(By.xpath("//a[@onclick=\"window.location.href='/SignUp/Index';\"]"));
		//RH.click();
		WebElement MN=driver.findElement(By.xpath("//input[@placeholder=\"Enter Your Mobile Number Or Email ID\"]"));
		MN.sendKeys("2700000029");
		WebElement LI=driver.findElement(By.xpath("(//button[@onclick=\"Login()\"])[2]"));
		LI.click();
		WebElement OTP=driver.findElement(By.xpath("//input[@onkeyup=\"PointerToNextTextBox()\"]"));
		OTP.sendKeys("2729");
		WebElement VY=driver.findElement(By.xpath("//button[@onclick=\"VerifyOTP()\"]"));
		VY.click();
		//WebElement RS=driver.findElement(By.xpath("//a[@onclick=\"Login('RESEND')\"]"));
		//RS.click();
		//WebElement BK=driver.findElement(By.xpath("//img[@src=\"/images/back-btn.svg\"]"));
		//BK.click();
		// TODO Auto-generated method stub

	}

}
