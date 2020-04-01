package dropdownexample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Testdrpdwn {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\driver\\chromedriver_win32\\chromedriver.exe");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91953\\Documents\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/gp/goldbox/ref=nav_cs_gb?ie=UTF8&tag=googinabkkenshoo-21&gclid=EAIaIQobChMIhPGP1bfs5AIVwhqPCh1DugWvEAAYASABEgI_bvD_BwE");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		Select oselect = new Select(driver.findElement(By.xpath("//*[@id=\"searchDropdownBox\"]")));
		//Thread.sleep(200);
		//oselect.selectByIndex(1);
		List<WebElement> elementcount = oselect.getOptions();
		int isize = elementcount.size();
		System.out.println(isize);
		
		
	//	System.out.println("the size is" +si);
		
	}

}
