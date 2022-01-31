package GuruTestSuite;

import com.opencsv.CSVReader;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileReader;

public class GuruDayThreeTest {
    ///Login using a valid username and password
    CSVReader csvReader;
    String CSV_PATH = "resources/Login.csv";
    String[] csvCell;


    @Test
    public void firstTest() throws Exception {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String username = csvCell[0];
        String password = csvCell[1];

        csvReader = new CSVReader(new FileReader(CSV_PATH));
        while ((csvCell = csvReader.readNext()) != null) {

            driver.get("https://www.demo.guru99.com/V4");
            driver.findElement(By.name("uid")).click();
            driver.findElement(By.name("uid")).sendKeys(username);
            driver.findElement(By.name("password")).click();
            driver.findElement(By.name("password")).sendKeys(password);
            driver.findElement(By.name("btnLogin")).click();
            driver.getTitle();
            if (driver.getTitle().contains("Guru99 Bank Manager HomePage")) {
                System.out.println("Test Pass Login Successful");
            } else {
                Assert.fail();
            }

        }
        driver.close();
        driver.quit();
    }
}
