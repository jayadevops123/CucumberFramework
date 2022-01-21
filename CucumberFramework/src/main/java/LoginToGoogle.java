import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginToGoogle {
	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver","C:\\SeleniumFolder\\chromedriver.exe");   	   
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
	}
	
	
}
