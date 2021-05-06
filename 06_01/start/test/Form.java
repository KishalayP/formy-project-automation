import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Form {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/form");

        WebElement box1 =driver.findElement(By.id("first-name"));
        box1.sendKeys("Kishalay");      
        
        WebElement box2 =driver.findElement(By.id("last-name"));
        box2.sendKeys("Pandey");

        WebElement box3 =driver.findElement(By.id("job-title"));
        box3.sendKeys("Assistant System Engineer");

        WebElement box4 =driver.findElement(By.id("radio-button-3"));
        box4.click();

        WebElement box5 =driver.findElement(By.id("checkbox-1"));
        box5.click();

        WebElement box6 =driver.findElement(By.cssSelector("option[value='1']"));
        box6.click();

        WebElement box7 =driver.findElement(By.id("datepicker"));
        box7.sendKeys("03/04/2021");
        box7.sendKeys(Keys.RETURN);
        
        driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();
        

        Thread.sleep(1000);
        

        driver.quit();
    }
}
