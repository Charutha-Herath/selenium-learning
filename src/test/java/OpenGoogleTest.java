import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class OpenGoogleTest {

    public void googleTest(){
        WebDriver driver = new ChromeDriver();  // All ready run 'WebDriverManager.chromedriver().setup();' code in this line since selenium 4 version
        driver.get("https://www.google.com/");
        driver.findElement(By.name("q")).sendKeys("Colombo"+ Keys.ENTER);
        //driver.quit();
    }
}
