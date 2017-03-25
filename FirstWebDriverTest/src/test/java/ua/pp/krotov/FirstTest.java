package ua.pp.krotov;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FirstTest {
	
	private WebDriver driver;
	
	@BeforeClass // Runs this method before the first test method in the current class is invoked
	public void setUp() {
		// Create a new instance of the Firefox driver
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
	}
	
	@Test // Marking this method as part of the test
	public void gotoSeleniumWikiPage() throws Exception {
		// Go to the Wikipedia home page
		driver.get("http://manarythubazar.com/");
		// Find the text input element by its id and type "Selenium"
		driver.findElement(By.linkText("Andhra")).click();
		// Get text from header of the Selenium page
		driver.findElement(By.xpath("//div[@class='col-lg-12']/div/div[@class='col-md-4']//following-sibling::div/div/a[contains(text(),'Anantapur')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='col-lg-12']/div/div[@class='col-md-4']//following-sibling::div/div/a[contains(text(),'P. Ramacharyulu Park')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='site-heading']/a[contains(text(),'Andhra')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='site-heading']/a[contains(text(),'Andhra')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='col-lg-12']/div/div[@class='col-md-4']//following-sibling::div/div/a[contains(text(),'Chittoor')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='col-lg-12']/div/div[@class='col-md-4']//following-sibling::div/div/a[contains(text(),'Chittoor(M.G.H)')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='site-heading']/a[contains(text(),'Andhra')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='col-lg-12']/div/div[@class='col-md-4']//following-sibling::div/div/a[contains(text(),'Tirupathi(TUDA)')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='site-heading']/a[contains(text(),'Andhra')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='site-heading']/a[contains(text(),'Andhra')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='col-lg-12']/div/div[@class='col-md-4']//following-sibling::div/div/a[contains(text(),'East Godavari')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='col-lg-12']/div/div[@class='col-md-4']//following-sibling::div/div/a[contains(text(),'Kothapet')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='site-heading']/a[contains(text(),'Andhra')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='site-heading']/a[contains(text(),'Andhra')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='col-lg-12']/div/div[@class='col-md-4']//following-sibling::div/div/a[contains(text(),'Guntur')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='col-lg-12']/div/div[@class='col-md-4']//following-sibling::div/div/a[contains(text(),'RTC Bustand')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='site-heading']/a[contains(text(),'Andhra')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='site-heading']/a[contains(text(),'Andhra')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='col-lg-12']/div/div[@class='col-md-4']//following-sibling::div/div/a[contains(text(),'Kadapa')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='col-lg-12']/div/div[@class='col-md-4']//following-sibling::div/div/a[contains(text(),'Dwarakanagar')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='site-heading']/a[contains(text(),'Andhra')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='site-heading']/a[contains(text(),'Andhra')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='col-lg-12']/div/div[@class='col-md-4']//following-sibling::div/div/a[contains(text(),'Krishna')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='col-lg-12']/div/div[@class='col-md-4']//following-sibling::div/div/a[contains(text(),'Vijayawada(S.Maidan)')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='site-heading']/a[contains(text(),'Andhra')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='site-heading']/a[contains(text(),'Andhra')]")).click();
		Thread.sleep(5000);
		// Verify that header equals "Selenium WebDriver"
	
	}
	
	@AfterClass // Runs this method after all the test methods in the current class have been run
	public void tearDown() {
		// Close all browser windows and safely end the session
		driver.quit();
	}

}
