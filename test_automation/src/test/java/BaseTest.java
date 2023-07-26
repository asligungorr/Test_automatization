import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import io.github.bonigarcia.wdm.WebDriverManager;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BaseTest {//the goal is to find and start the form page

   protected WebDriver driver;
    PracticeFormPage practiceForm ;
    static String browser = System.getProperty("browser");
    //String chromeDriver = "\"C:\\Users\\USER\\OneDrive\\Masaüstü\\chromedriver_win32 (1) - Kopya\\chromedriver.exe\"";
    @BeforeAll
    public void setUp() throws InterruptedException {//The method does not need to be static as we have added test instance annotation
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");//error
       // driver = new ChromeDriver();
        driver.get("https://demoqa.com/automation-practice-form");
        Thread.sleep(3000);
        System.out.println("Test initiated");
        practiceForm = new PracticeFormPage(driver);
    }
    //It is healthier to open each test in a separate browser and test it separately.
    @BeforeEach
    public void beforeEach(){
        driver = new ChromeDriver();
    }
    @AfterEach
    public void afterEach(){
        driver.quit();
    }

    @AfterAll
    public void tearDown(){

            driver.quit();
            System.out.println("Test finished");


    }

        }



