import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollToElement {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\TCS\\Selenium\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/scroll");

        WebElement name=driver.findElement(By.id("name"));

        Actions actions=new Actions(driver);
        actions.moveToElement(name);

        name.sendKeys("Kishalay Pandey");
        WebElement date= driver.findElement(By.id("date"));

        date.sendKeys("13/04/2021");
        Thread.sleep(3000);
        driver.quit();
    }
}
