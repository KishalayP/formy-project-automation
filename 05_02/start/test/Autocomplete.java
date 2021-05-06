import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

public class Autocomplete {
    public static void main(String[] args)
    {

        System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/autocomplete");
        driver.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);

        WebDriverWait wait=new WebDriverWait(driver,10);
        WebElement autocomplete = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("autocomplete")));
        autocomplete.sendKeys("1555 Park Blvd, Palo Alto, CA");
        
        WebElement autocompleteResult = driver.findElement(By.className("pac-item"));
        autocompleteResult.click();
        
        driver.quit();
    }
}
