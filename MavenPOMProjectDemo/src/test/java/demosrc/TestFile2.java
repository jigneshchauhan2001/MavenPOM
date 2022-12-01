package demosrc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestFile2 {
	@Test
	  public void f3() {
		  WebDriverManager.chromedriver().setup();
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://facebook.com");
		  driver.quit();
		  System.out.println("f3 test method executed");
	  }
	  
	  
	  @Test
	  public void f4() {
		  System.out.println("f4 test method executed");
	  }
}
