//import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGoogle {
    //Open google
    //Go to the Google home page
    public static void main(String[] args) {
        //System.setProperty("webdriver.chrome.driver","C:\\Users\\ACER\\Downloads\\driver\\chromedriver.exe");   // only use for Stage 01 implementation
        //WebDriver driver = new ChromeDriver();
        //driver.get("https://www.google.com/");

        //============================================================================

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");



    }
}
