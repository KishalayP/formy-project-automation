import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Autocomplete {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\TCS\\Selenium\\chromedriver.exe");
        
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/autocomplete");

        WebElement autocomplete=driver.findElement(By.id("autocomplete"));
        autocomplete.sendKeys("1555 Park Blvd,Palo Alto,CA");
        Thread.sleep(500);

        WebElement autocomplete_result=driver.findElement(By.className("pac-item"));
        autocomplete_result.click();

        Thread.sleep(3000);
        driver.quit();
    }
}
