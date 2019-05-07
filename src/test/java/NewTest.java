import com.google.common.annotations.VisibleForTesting;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTest {
    WebDriver driver;
    @Test
    public void anyMethod () {
        String expectedTitle = "App Students";
        driver = new ChromeDriver();
        driver.get("http://37.59.228.229:3000/");
        String actualTitle = driver.getTitle();

       // Assert.assertEquals( "AAAAA", expectedTitle, actualTitle);
        Assert.assertEquals(expectedTitle, actualTitle);
        driver.findElement(By.cssSelector("a.add-user")).click();
        driver.findElement(By.cssSelector("input[type=text]")).clear();
        driver.findElement(By.cssSelector("input[type=text]")).sendKeys("Sardelka");
        driver.findElement(By.cssSelector("input[type=tel]")).clear();
        driver.findElement(By.cssSelector("input[type=tel]")).sendKeys("987654321000");
        driver.findElement(By.cssSelector("a.save-btn")).click();


    }
    @After
    public void postConditionsMethod (){
       // driver.quit();
    }

}
