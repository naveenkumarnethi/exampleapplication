package locatorexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Idexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		/*
		 driver.get("http://demo.guru99.com/test/facebook.html");
		WebElement inputemail = driver.findElement(By.id("email"));
		inputemail.sendKeys("abcdef");
		WebElement inputpass = driver.findElement(By.name("pass"));
		inputpass.sendKeys("ghilkg");
		*/
		
		driver.get("https://www.google.com/");
		WebElement glink = driver.findElement(By.linkText("Gmail"));
		
		glink.click();
	}

}
