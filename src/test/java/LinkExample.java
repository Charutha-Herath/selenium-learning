import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LinkExample {
    WebDriver driver;
    @BeforeMethod
    public void openLinkTestPage(){
         driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://leafground.com/link.xhtml");
        //driver.quit();
    }
    @Test
    public void LinkTest(){
        //Take me to Dashboard
        WebElement homeLink = driver.findElement(By.linkText("Go to Dashboard"));
        homeLink.click();
        driver.navigate().back();

        //Find my destination
        WebElement whereToGo = driver.findElement(By.partialLinkText("Find the URL"));
        String path = whereToGo.getAttribute("href");
        System.out.println("This link is going to : " + path);
        //driver.navigate().back();

        //Am I broken linkBroken?
        WebElement brokenLink = driver.findElement(By.linkText("Broken?"));
        brokenLink.click();
        String title = driver.getTitle();
        if (title.contains("404")){
            System.out.println("The link is broken");
        }else {
            System.out.println("Not broken");
        }
    }
}
