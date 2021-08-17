package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		
	//for windows:
	 System.setProperty("webdriver.chrome.driver", "c:\\documents\\driver\\chromedriver.exe");

	//for mac:
	//System.setProperty("webdriver.chrome.driver", "/Users/jyothi/Downloads/chromedriver");
	
		WebDriver driver = new ChromeDriver();//launch browser
		driver.get("http://www.google.com");//enter the url
				
		String title = driver.getTitle(); //get the title
		System.out.println("page title is: " + title);
				
		//verification/checkpoint: act vs exp:
		if(title.equals("Google")) {
		System.out.println("correct title");
		}
		else {
		System.out.println("in-correct title");
		}
				
		String url = driver.getCurrentUrl();
		System.out.println(url);
				
		System.out.println(driver.getPageSource());
				
				
		driver.quit();
				
		
	}

}
