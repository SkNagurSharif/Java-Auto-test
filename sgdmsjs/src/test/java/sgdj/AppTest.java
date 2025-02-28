package sgdj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AppTest {

    WebDriver driver;

    @Test
    public void OpenUI() throws InterruptedException {
        // Removed redundant instantiation


        System.out.println("Successfully Excecuted the test");
        driver = new ChromeDriver();
        driver.get("https://sgdmsjs.pages.dev/");
        Thread.sleep(5000);
        driver.quit();
    }
}
