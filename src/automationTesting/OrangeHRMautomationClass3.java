package automationTesting;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class OrangeHRMautomationClass3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HARSH SHARMA\\Downloads\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		//driver.manage().window().fullscreen();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//driver.quit();
		WebElement username = driver.findElement(By.xpath("//input[@name=\"username\"]"));
		username.sendKeys("Admin");
		WebElement password = driver.findElement(By.xpath("//input[@type=\"password\"]"));
		password.sendKeys("admin123");
		WebElement login = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		login.click();
		Thread.sleep(5000);
		WebElement buzz = driver.findElement(By.xpath("(//span[@class=\"oxd-text oxd-text--span oxd-main-menu-item--name\"])[12]"));
		buzz.click();
		Thread.sleep(3000);
		WebElement addsentence = driver.findElement(By.xpath("//textarea[@placeholder=\"What's on your mind?\"]"));
		addsentence.sendKeys("This is Harsh and I am a software tester. I have tested multiple app having great expertise in End to End app and having sound knowledge of manual and automation testing");
		WebElement post = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		post.click();
		// TODO Auto-generated method stub

	}

}
