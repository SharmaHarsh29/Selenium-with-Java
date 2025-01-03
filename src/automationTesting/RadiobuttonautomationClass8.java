package automationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadiobuttonautomationClass8 {

	public static void main(String[] args) throws InterruptedException {
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
		
		System.out.println(login.isDisplayed());
		if(login.isDisplayed()) {
		login.click();
		Thread.sleep(5000);
		// TODO Auto-generated method stub
		}
		WebElement MyInfo = driver.findElement(By.xpath("//span[normalize-space()='My Info']"));
		MyInfo.click();
		Thread.sleep(5000);
		WebElement Male = driver.findElement(By.xpath("//label[normalize-space()='Male']"));
		WebElement Female = driver.findElement(By.xpath("//label[normalize-space()='Female']"));
		
		if(Female.isSelected()) {
		Male.click();
		}
		else {
		Female.click();	
		}

	}

}
