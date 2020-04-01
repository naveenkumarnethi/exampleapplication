package scrollexample;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TScroll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Documents\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.guru99.com/scroll-up-down-selenium-webdriver.html");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		driver.manage().window().maximize();
		js.executeScript("window.scrollBy(0,1000)");
		System.out.println("before changed"); 
		System.out.println("before changed"); 
		System.out.println("hello  hyd");
	}

}
