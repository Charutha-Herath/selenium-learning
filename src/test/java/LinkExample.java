import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

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
//        WebElement whereToGo = driver.findElement(By.partialLinkText("Find the URL"));
//        String path = whereToGo.getAttribute("href");
//        System.out.println("This link is going to : " + path);
//        driver.navigate().back();


        //Am I broken linkBroken?
//        WebElement brokenLink = driver.findElement(By.linkText("Broken?"));
//        brokenLink.click();
//
//        String title = driver.getTitle();
//        if (title.contains("404")){
//            System.out.println("The link is broken");
//        }else {
//            System.out.println("Not broken");
//        }
//        driver.navigate().back();


        //Duplicate link
        WebElement homeLink1 = driver.findElement(By.linkText("Go to Dashboard"));
        homeLink1.click();
        driver.navigate().back();


        //Count page links
        List<WebElement> allPageLinks = driver.findElements(By.tagName("a"));
        int pageLinkCount = allPageLinks.size();
        System.out.println("Count of full page links : "+ pageLinkCount);

        //Count Layout Links
        WebElement layoutElement = driver.findElement(By.className("layout-main-content"));
        List<WebElement> getLayoutLink = layoutElement.findElements(By.tagName("a"));
        System.out.println("Layout links count : "+ getLayoutLink.size());
    }
}
