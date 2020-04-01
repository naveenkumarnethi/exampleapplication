package dropdownexample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Tdrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Documents\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Select sel = new Select(driver.findElement(By.xpath("//*[@id=\"searchDropdownBox\"]")));
		sel.selectByIndex(2);
		driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).click();
		WebElement input = driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
		input.sendKeys("abc");
		
	}

}
