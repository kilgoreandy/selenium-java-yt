import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class EntireScreenshot {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        WebDriver driver;


        System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.airbnb.co.in/s/India/");

//take screenshot of the entire page
//        Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
//        try {
//            ImageIO.write(screenshot.getImage(), "PNG", new File("path of the file"));
//        } catch (IOException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }

        driver.quit();

    }
}
