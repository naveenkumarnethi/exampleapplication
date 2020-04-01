package navigateanadgetexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigateexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://demo.guru99.com/test");
		driver.navigate().back();
		
		WebElement searchtextbox = driver.findElement(By.xpath("//*[@class=\"gLFyf gsfi\"]"));
		
	}

}
