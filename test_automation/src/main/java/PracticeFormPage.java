import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PracticeFormPage extends BasePage{

    private WebDriver driver;
    private final By nameLocator = By.id("firstName");
    private final By lastNameLocator = By.id("lastName");
    private final By emailLocator = By.id("userEmail");

   private GenderSectionPage genderSection;
    public GenderSectionPage genderSection(){
        return this.genderSection;//To access the gender section methods in the test class, we need to return the instance we createed in the same class
    }
    public PracticeFormPage(WebDriver driver){
        super(driver);
        driver.get(baseUrl.concat("automation-practice-form"));
        genderSection = new GenderSectionPage(driver);//initialized
    }

    public void setName(String nameText){
       type(nameLocator,nameText);
    }
    public void setLastName(String lastNameText){
       type(lastNameLocator,lastNameText);//This type method inherited from basePage

    }
    public void setEmail(String emailAddress){
        type(emailLocator,emailAddress);
    }

    public String getName(){
       return find(nameLocator).getAttribute("value");//this find method inherited from basePage

    }
    public String getLastName(){
      return find(lastNameLocator).getAttribute("value");

    }
    public String getEmail(){
       return find(emailLocator).getAttribute("value");
    }

}
