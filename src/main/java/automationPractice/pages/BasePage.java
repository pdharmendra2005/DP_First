package automationPractice.pages;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BasePage {

  public static String baseUrl = "http://automationpractice.com/index.php";
  public static String browserName = "CHROME";
  public static WebDriver driver;


  public void openBrowser(String browserName, String url) {
    if(browserName.equalsIgnoreCase("chrome")) {
      //Chrome Browser
      WebDriverManager.chromedriver().setup();
      driver = new ChromeDriver();
    } else if(browserName.equalsIgnoreCase("firefox")) {
      //Firefox Browser
      WebDriverManager.firefoxdriver().setup();
      driver = new FirefoxDriver();
    } else if(browserName.equalsIgnoreCase("ie")) {
      //IE Browser
      WebDriverManager.iedriver().setup();
      driver = new InternetExplorerDriver();
    } else if(browserName.equalsIgnoreCase("edge")) {
      //MS Edge Browser
      WebDriverManager.edgedriver().setup();
      driver = new EdgeDriver();
    } else if(browserName.equalsIgnoreCase("safari")) {
      //Safari Browser
      System.setProperty("webdriver.safari.driver", "src/main/resources/safaridriver");
      driver = new SafariDriver();
    } else {
      //Chrome Browser
      WebDriverManager.chromedriver().setup();
      driver = new ChromeDriver();
    }

    driver.get(url);
  }

  public void closeBrowser(){
    driver.quit();
  }

}
