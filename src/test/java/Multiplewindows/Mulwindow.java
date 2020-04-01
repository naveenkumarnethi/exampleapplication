package Multiplewindows;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mulwindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\91953\\Documents\\driver\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "E:\\Documents\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[text()=\"Click Here\"]")).click();
		
		String MainWindow = driver.getWindowHandle();
		
		Set<String> s1 = driver.getWindowHandles();
		
		
		Iterator<String> i = s1.iterator();
		while(i.hasNext())
		{
			String ChildWindow = i.next();
			
			if(!MainWindow.equalsIgnoreCase(ChildWindow))
			{
				driver.switchTo().window(ChildWindow);
				driver.findElement(By.name("emailid")).sendKeys("abcd");
				driver.close();
			}
		}
	}

}
