package test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DraftTest {


	@Test        
	public void AddingDraft()

	{

	
	System.setProperty("webdriver.chrome.driver", "C:\\auto\\chromedriver.exe");

	
	WebDriver driver= new ChromeDriver();
	
	driver.manage().window().maximize();

	driver.get("http://demosite.center/wordpress/wp-login.php");


	driver.findElement(By.id("user_login")).sendKeys("admin");

	driver.findElement(By.id("user_pass")).sendKeys("demo123");


	driver.findElement(By.id("wp-submit")).click();

	driver.findElement(By.id("title")).isDisplayed();

	System.out.println("Login works and Page loaded properly");
	
	//providing a title
	
	driver.findElement(By.id("title")).sendKeys("Name");
	
	//writing details in what's in your mind textbox
	
	driver.findElement(By.id("content")).sendKeys("My name is Mr or Ms. X");
	
	//clicking on the save draft button
	
	driver.findElement(By.id("save-post")).click();	
	
	
	driver.close();
	
	driver.quit();

	}

}
