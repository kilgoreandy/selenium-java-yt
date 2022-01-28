//import com.opencsv.CSVReader;
//import org.junit.Before;
//import org.junit.Test;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import ru.yandex.qatools.ashot.AShot;
//import ru.yandex.qatools.ashot.Screenshot;
//import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
//
//import javax.imageio.ImageIO;
//import java.io.FileReader;
//
//    //Setup variable references
//
//    String CSV_PATH = "resources/FormInfo.csv";
//    String DRIVER_PATH = "resources/chromedriver.exe";
//    WebDriver driver;
//    private CSVReader csvReader;
//    String[] csvCell;
//
//    //This Before block executes before the actual test runs. Use this as a setup method to preload any work.
//    //Usually in a Before, we want to initialize out web driver, get the url, and maximize the screen.
//    @Before
//    public void setup() throws Exception {
//        System.setProperty("webdriver.chrome.driver", DRIVER_PATH);
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://itera-qa.azurewebsites.net/home/automation");
//    }
//
//
//    // Test is the block of code that actually runs the selenium tests i.e. executes the browser commands.
//    @Test
//
//    //if you want to use a spreadsheet add the code below
//    csvReader = new CSVReader(new FileReader(CSV_PATH));
//        while ((csvCell = csvReader.readNext()) != null)
//
//    {
//    }
//
//        //If you want to screenshot an entire page, add the code below.
//        Screenshot screenshot=new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
//        ImageIO.write(screenshot.getImage(),"PNG",new File("Snaps/test" +count + ".png"));
//    }
//
//
//    //If for some reason you want to take a sceenshot of only the viewable area, use the code below.
////        public static void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception {
////
////            TakesScreenshot scrShot = ((TakesScreenshot) webdriver);
////
////            File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
////
////            File DestFile = new File(fileWithPath);
////
////            FileUtils.copyFile(SrcFile, DestFile);
////
////
////        }
//// The @After code block is usually summoned as a tear down test. This is usually where you would clean your database
//  if needed,  and close the browser driver.
//// @After



// If you would like to convert to a PDF here is the code to do that
//Document document = new Document();
//        //Create OutputStream instance.
//        OutputStream outputStream =
//        new FileOutputStream(new File("resources/TestFile.pdf"));
//        //Create PDFWriter instance.
//        PdfWriter.getInstance(document, outputStream);
//        //Open the document.
//        document.open();
//        //Add content to the document.
//        document.add(new Paragraph("Hello world, " +
//        "this is a test pdf file."));
//        //Close document and outputStream.
//        document.close();
//        outputStream.close();
//
//}
