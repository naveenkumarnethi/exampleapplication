package waitexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver,20);
		String etitle = "Demo Guru99 Page";
		String atitle = "";
		
		driver.get("http://demo.guru99.com/test/guru99home/");
		//driver.manage().window().maximize();
		atitle = driver.getTitle();
		
		if(atitle.equals(etitle))
		{
			System.out.println("Test passed");
		}
		else
		{
			System.out.println("Test failed");
		}
		
		WebElement ele;
		ele = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[2]/a")));
		ele.click();
		
		
		
	}

}
