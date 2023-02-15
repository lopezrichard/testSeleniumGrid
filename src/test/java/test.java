import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class test {
      @Test
    public void Selenium() throws MalformedURLException {
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriver driver = new RemoteWebDriver(new URL("http://137.184.34.196:3333"), chromeOptions);
        driver.get("http://www.google.com");
        driver.quit();
        System.out.println("Finalizo");
    }

}
