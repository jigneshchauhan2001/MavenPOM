package demosrc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestFile1 {
  @Test
  public void f1() {
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://facebook.com");
	  driver.quit();
	  System.out.println("f1 test method executed");
  }
  
  
  @Test
  public void f2() {
	  System.out.println("f2 test method executed");
  }
}
