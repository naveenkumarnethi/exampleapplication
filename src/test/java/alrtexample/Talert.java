package alrtexample;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Talert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	System.setProperty("webdriver.chrome.driver", "E:\\Documents\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://demo.guru99.com/test/delete_customer.php");
	String a = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[1]")).getText();
	System.out.println(a);
	driver.findElement(By.name("cusid")).sendKeys("asdf");
	driver.findElement(By.name("submit")).click();
	
	Alert alert = driver.switchTo().alert();
	alert.accept();
	alert.accept();

	}

}
