import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

@Test
public class OpenGoogleTest {

    public void googleTest(){

        //Browser version handling and others using ChromeOptions

        /*ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setBrowserVersion("122");
        chromeOptions.addArguments("--start-maximized");
        chromeOptions.addArguments("--incognito");
        chromeOptions.addArguments("--headless");
        WebDriver  driver = new ChromeDriver(chromeOptions);*/



        WebDriver driver = new ChromeDriver();  // All ready run 'WebDriverManager.chromedriver().setup();' code in this line since selenium 4 version
        driver.get("https://www.google.com/");
        driver.findElement(By.name("q")).sendKeys("Colombo"+ Keys.ENTER);
        //driver.quit();
    }
}
