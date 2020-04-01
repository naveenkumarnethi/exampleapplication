package dropdownexample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dopdwown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/gp/goldbox/ref=nav_cs_gb?ie=UTF8&tag=googinabkkenshoo-21&gclid=EAIaIQobChMIhPGP1bfs5AIVwhqPCh1DugWvEAAYASABEgI_bvD_BwE");
		//Alert al = driver.switchTo().alert();
		//al.dismiss();
		Thread.sleep(200);
		Select oselect = new Select(driver.findElement(By.xpath("//*[@id=\"searchDropdownBox\"]")));
		//Thread.sleep(200);
		//oselect.selectByIndex(1);
		List<WebElement> elementcount = oselect.getOptions();
		int isize = elementcount.size();
		
		System.out.println(isize);
		for(int i=0; i<isize;i++)
		{
			String svalue = elementcount.get(i).getText();
			System.out.println(svalue);
		}
	}

}
