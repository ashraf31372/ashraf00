package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSource {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/91957/OneDrive/Desktop/html/checkbox.html");
		String sourceCodeOfTheWebPage = driver.getPageSource();
		
		System.out.println(sourceCodeOfTheWebPage);
	}

}