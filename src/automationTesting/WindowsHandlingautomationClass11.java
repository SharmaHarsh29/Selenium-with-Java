package automationTesting;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandlingautomationClass11 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HARSH SHARMA\\Downloads\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		//driver.manage().window().fullscreen();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		WebElement INSTALink = driver.findElement(By.xpath("//a[@title='Take a look at Instagram']"));
		INSTALink.click();
		System.out.println(driver.getWindowHandle());
		System.out.println(driver.getWindowHandles());
		String PW = driver.getWindowHandle();
		Set<String> AW = driver.getWindowHandles();
		for(String i : AW) {
			if(!(PW.equals(i))) {
			driver.switchTo().window(i);
			}
		}
		Thread.sleep(5000);
		WebElement UserName = driver.findElement(By.xpath("//input[@name='username']"));
		UserName.sendKeys("HARSH SHARMA");
		WebElement Passward = driver.findElement(By.xpath("//input[@name='password']"));
		Passward.sendKeys("HARSH");
//		WebElement Login = driver.findElement(By.xpath(""));
//		Login.sendKeys("HARSH SHARMA");
		// TODO Auto-generated method stub

	}

}
