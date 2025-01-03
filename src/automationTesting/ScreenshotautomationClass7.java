package automationTesting;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class ScreenshotautomationClass7 {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("wedDriver.chrome.driver","C:\\Users\\HARSH SHARMA\\Downloads\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		WebElement username = driver.findElement(By.xpath("//input[@name=\"username\"]"));
		username.sendKeys("Admin");
		WebElement password = driver.findElement(By.xpath("//input[@type=\"password\"]"));
		password.sendKeys("admin123");
		WebElement login = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File Destination = new File("C:\\Users\\HARSH SHARMA\\Downloads\\orange hrm screenshot\\shot1.png");
		FileUtils.copyFile(src, Destination);
		login.click();
		Thread.sleep(5000);
		
		File src1 = ts.getScreenshotAs(OutputType.FILE);
		File Destination1 = new File("C:\\Users\\HARSH SHARMA\\Downloads\\orange hrm screenshot\\shot2.png");
		FileUtils.copyFile(src1, Destination1);
		
		WebElement buzz = driver.findElement(By.xpath("(//span[@class=\"oxd-text oxd-text--span oxd-main-menu-item--name\"])[12]"));
		buzz.click();
		Thread.sleep(5000);
		WebElement addsentence = driver.findElement(By.xpath("//textarea[@placeholder=\"What's on your mind?\"]"));
		addsentence.sendKeys("This is Harsh and I am a software tester. I have tested multiple app having great expertise in End to End app and having sound knowledge of manual and automation testing");
		WebElement post = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		
		File src2 = ts.getScreenshotAs(OutputType.FILE);
		File Destination2 = new File("C:\\Users\\HARSH SHARMA\\Downloads\\orange hrm screenshot\\shot3.png");
		FileUtils.copyFile(src2, Destination2);
		post.click();
		//WebElement INSTA = driver.findElement(By.xpath("//a[@title='Take a look at Instagram']"));
		//INSTA.click();;
		// TODO Auto-generated method stub

	}

}
