package Training;

import com.opencsv.CSVReader;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.FileReader;

public class MultipleFormSubmitTest {
    String CSV_PATH = "resources/FormInfo.csv";
    String DRIVER_PATH = "resources/chromedriver.exe";
    WebDriver driver;
    String[] csvCell;

    @Before

    public void setup() throws Exception {
        System.setProperty("webdriver.chrome.driver", DRIVER_PATH);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://itera-qa.azurewebsites.net/home/automation");
    }

    @Test
    public void firstTest() throws Exception {
        CSVReader csvReader = new CSVReader(new FileReader(CSV_PATH));
    int count = 1;
        while ((csvCell = csvReader.readNext()) != null) {

            String fullName = csvCell[0];
            String mobile = csvCell[1];
            String email = csvCell[2];
            String password = csvCell[3];
            String address = csvCell[4];
            String gender = csvCell[5];
            String days = csvCell[6];
            String destination = csvCell[7];

            driver.findElement(By.id("name")).click();
            driver.findElement(By.id("name")).sendKeys(fullName);
            driver.findElement(By.id("phone")).click();
            driver.findElement(By.id("phone")).sendKeys(mobile);
            driver.findElement(By.id("email")).click();
            driver.findElement(By.id("email")).sendKeys(email);
            driver.findElement(By.id("password")).click();
            driver.findElement(By.id("password")).sendKeys(password);
            driver.findElement(By.id("address")).click();
            driver.findElement(By.id("address")).sendKeys(address);

            //Logic for finding and selecting gender
            switch (gender) {
                case "M":
                    driver.findElement(By.id("male")).click();
                    break;
                case "F":
                    driver.findElement(By.id("female")).click();
                    break;
                default:
                    driver.findElement(By.id("other")).click();
                    break;
            }

            //Logic for checking a single start day.
            switch (days) {
                case "Monday":
                    driver.findElement(By.id("monday")).click();
                    break;
                case "Tuesday":
                    driver.findElement(By.id("tuesday")).click();
                    break;
                case "Wednesday":
                    driver.findElement(By.id("wednesday")).click();
                    break;
                case "Thursday":
                    driver.findElement(By.id("thursday")).click();
                    break;
                case "Friday":
                    driver.findElement(By.id("friday")).click();
                    break;
                case "Saturday":
                    driver.findElement(By.id("saturday")).click();
                    break;
                case "Sunday":
                    driver.findElement(By.id("sunday")).click();
                    break;
            }

            Select place = new Select(driver.findElement(By.className("custom-select")));
            //driver.findElement(By.className("custom-select")).click();
            place.selectByVisibleText(destination);

            //Logic for selecting and uploading a file
            driver.findElement(By.cssSelector("#inputGroupFile02")).sendKeys("C:\\Users\\DeriskQA  5\\IdeaProjects\\selenium-java-yt\\resources\\AccountInfo.csv");




            Screenshot screenshot=new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
            ImageIO.write(screenshot.getImage(),"PNG",new File("Snaps/test" + count + ".png"));

//            this.takeSnapShot(driver, path);
            ++count;
            driver.navigate().refresh();
        }
        driver.close();
    }



    }

