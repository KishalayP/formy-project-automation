import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;


public class KeyboardAndMouseInput {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\TCS\\Selenium\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/keypress");
        
        WebElement name=driver.findElement(By.id("name"));
        name.click();
        name.sendKeys("Kishalay Pandey");
        WebElement button=driver.findElement(By.id("button"));
        button.click();
        Thread.sleep(1000);
        driver.quit();
    }
}
