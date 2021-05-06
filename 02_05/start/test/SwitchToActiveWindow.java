import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToActiveWindow {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/switch-window");

        WebElement new_Tab_Btn=driver.findElement(By.id("new-tab-button"));
        new_Tab_Btn.click();

        String original_handle=driver.getWindowHandle();
        for(String handle1:driver.getWindowHandles())
        {
            driver.switchTo().window(handle1);
        }
        Thread.sleep(3000);
        driver.switchTo().window(original_handle);

        Thread.sleep(3000);
        driver.quit();
    }
}
