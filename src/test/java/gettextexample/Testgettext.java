package gettextexample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testgettext {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Documents\\driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		Thread.sleep(200);
		WebElement dep = driver.findElement(By.xpath("//*[@class='fsw_inputBox dates inactiveWidget ']"));
		String deptime = dep.getText();
		System.out.println("the dep time is "+deptime);
		
		WebElement traveller = driver.findElement(By.xpath("//*[@class='fsw_inputBox flightTravllers inactiveWidget ']"));
		String strtraveller = traveller.getText();
		System.out.println("Traveller is "+strtraveller);
	}

}
