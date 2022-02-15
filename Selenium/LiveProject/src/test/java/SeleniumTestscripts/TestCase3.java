package SeleniumTestscripts;

import java.io.FileInputStream;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import project.pages.OrangeHRPPages;

public class TestCase3 {
	
	OrangeHRPPages OrangeOR;
	WebDriver Driver;

	@Test
	@Parameters({"Browser","Url", })
	public void Login(String Browser, String Url) {

		if(Browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Soft\\Jarfiles\\chromedriver_win32\\chromedriver.exe");
			ChromeOptions co = new ChromeOptions();
			Driver 	= new ChromeDriver(co);
		} else if(Browser.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", "C:\\Soft\\Jarfiles\\IEDriverServer_x64_3.150.1\\IEDriverServer.exe");
			Driver 	= new InternetExplorerDriver();
		} 
			
			
		OrangeOR = new OrangeHRPPages(Driver);
		Driver.manage().window().maximize();
		String Title = Driver.getTitle();
		System.out.println(Title);
		Driver.get(Url);
		List<WebElement> images =OrangeOR.getAllImages();
		List<WebElement> links =OrangeOR.getAllLinks();
		List<WebElement> txtboxes =OrangeOR.getAllTextbox();

		for (WebElement image1: images) {
			System.out.println("All images are : " + image1.getAttribute("src"));
			
		}

		for (WebElement link1: links) {
			System.out.println("All links are :" + link1.getAttribute("href"));
			
		}

		for (WebElement texbox: txtboxes) {
			System.out.println("All textboxes are : " + texbox.getText());
			
		}
		
		
			
		}
		
		
}


