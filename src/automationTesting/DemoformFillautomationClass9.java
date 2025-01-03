package automationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoformFillautomationClass9 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HARSH SHARMA\\Downloads\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		//driver.manage().window().fullscreen();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		WebElement FirstName = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		FirstName.sendKeys("HARSH");
		WebElement LastName = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		LastName.sendKeys("SHARMA");
		WebElement Address = driver.findElement(By.xpath("//textarea[@class='form-control ng-pristine ng-untouched ng-valid']"));
		Address.sendKeys("HAPUR UP");
		WebElement EmailAddress = driver.findElement(By.xpath("//input[@type='email']"));
		EmailAddress.sendKeys("hslc2927@gmail.com");
		WebElement Number = driver.findElement(By.xpath("//input[@type='tel']"));
		Number.sendKeys("9548962737");
		WebElement Male = driver.findElement(By.xpath("//label[normalize-space()='Male']"));
		Male.click();
		WebElement Hobbies = driver.findElement(By.xpath("//input[@id='checkbox1']"));
		Hobbies.click();
		WebElement Language = driver.findElement(By.xpath("//div[@id='msdd']"));
		Language.click();
		WebElement SelectLanguage1 = driver.findElement(By.xpath("(//a[@style=\"text-decoration:none\"])[8]"));
		SelectLanguage1.click();
		WebElement SelectLanguage2 = driver.findElement(By.xpath("(//a[@style=\"text-decoration:none\"])[16]"));
		SelectLanguage2.click();
		WebElement SK = driver.findElement(By.xpath("//label[normalize-space()='Skills']"));
		SK.click();
		WebElement Skills = driver.findElement(By.xpath("//select[@id='Skills']"));
		Skills.click();
		WebElement SelectSkills = driver.findElement(By.xpath("//option[@value=\"Android\"]"));
		SelectSkills.click();
		WebElement Country= driver.findElement(By.xpath("//select[@id='countries']"));
		Country.click();
		WebElement SelectCountry = driver.findElement(By.xpath("//span[@role='combobox']"));
		SelectCountry.click();
		WebElement SelectCountry1 = driver.findElement(By.xpath("//li[normalize-space()='India']"));
		SelectCountry1.click();
		WebElement Year = driver.findElement(By.xpath("//select[@id='yearbox']"));
		Year.click();
		WebElement Year1 = driver.findElement(By.xpath("//option[@value=\"1994\"]"));
		Year1.click();
		WebElement Month = driver.findElement(By.xpath("//select[@placeholder='Month']"));
		Month.click();
		WebElement Month1 = driver.findElement(By.xpath("//option[@value=\"May\"]"));
		Month1.click();
		WebElement Day = driver.findElement(By.xpath("//select[@id='daybox']"));
		Day.click();
		WebElement Day1 = driver.findElement(By.xpath("//option[@value=\"29\"]"));
		Day1.click();
		WebElement Pasward = driver.findElement(By.xpath("//input[@id='firstpassword']"));
		Pasward.sendKeys("HS2927");
		WebElement ConfirmPassward = driver.findElement(By.xpath("//input[@id='secondpassword']"));
		ConfirmPassward.sendKeys("HS2927");
		WebElement ChooseFile = driver.findElement(By.xpath("//input[@id='imagesrc']"));
		ChooseFile.sendKeys("C:\\Users\\HARSH SHARMA\\Downloads\\Images");
		//WebElement Submit = driver.findElement(By.xpath("//button[@id='submitbtn']"));
		//Submit.click();
		WebElement Refresh = driver.findElement(By.xpath("//button[@id='Button1']"));
		Refresh.click();
		
		// TODO Auto-generated method stub

	}

}
