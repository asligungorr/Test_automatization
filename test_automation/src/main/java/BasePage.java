import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
/*The parallel test run is important since it can take a long time to run a thousand tests one by one on the same thread
therefore need to use maven.
*/
public class BasePage {

    protected WebDriver driver;
    String baseUrl = "https://demoqa.com/automation-practice-form";

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }
    /*The parts that are on each page and do not change are added here.
    For example,the method of accepting cookies on every page is written here.
    */
    public WebElement find(By locator){
        return driver.findElement(locator);
    }
    public void click(By locator){
        find(locator).click();

    }
    public void type(By locator,String text){
        find(locator).sendKeys(text);

    }
    public boolean isSelected(By locator){
        return find(locator).isSelected();
    }
}
