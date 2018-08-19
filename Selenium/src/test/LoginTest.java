package test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest

{

@Test         //Junit Annotation is to mark a method as Test method and to display the test result.
public void Login()

{

// Declare what browser would you use, and where is that browsers driver located 	
System.setProperty("webdriver.chrome.driver", "C:\\auto\\chromedriver.exe");

//open the chrome browser and it is also means that driver is getting reffered as chrome browser.
//making a connection with the driver and chrome

//1st test step
WebDriver driver= new ChromeDriver();

//maximize your screen

driver.manage().window().maximize();


//2nd test step

//driver.get means go to the specific URL

driver.get("http://demosite.center/wordpress/wp-login.php");


//3rd test step

// for identifying element we use driver.findelement
//for tryping in the element we we use sendkeys

driver.findElement(By.id("user_login")).sendKeys("admin");

//4th step

driver.findElement(By.id("user_pass")).sendKeys("demo123");

// 5th step

driver.findElement(By.id("wp-submit")).click();

//validation for the page loading

driver.findElement(By.id("title")).isDisplayed();

System.out.println("Login works and Page loaded properly");


//closing browser

driver.close();

//end the test case

driver.quit();

}

}
