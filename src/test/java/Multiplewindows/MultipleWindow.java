package Multiplewindows;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91953\\Documents\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.naukri.com/");
		String mainWindow = driver.getWindowHandle();
	
		Set<String> set = driver.getWindowHandles();
		Iterator<String> itr = set.iterator();
		while(itr.hasNext())
		{
			String childWindow = itr.next();
			if(mainWindow.equals(childWindow));
			driver.switchTo().window(childWindow);
			driver.close();
		}
		//driver.switchTo().window(mainWindow);
	}

}
