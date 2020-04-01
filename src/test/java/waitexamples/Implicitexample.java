package waitexamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicitexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String etitle = "Demo Guru99 Pages";
		String atitle = "";
		
		driver.get("http://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
		atitle = driver.getTitle();
		
		if(atitle.equals(etitle))
		{
			System.out.println("Test passed");
		}
		else
		{
			System.out.println("Test failed");
		}
		driver.close();
	}

}
