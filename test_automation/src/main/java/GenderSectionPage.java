import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GenderSectionPage extends BasePage {

    private WebDriver driver;
    private final By maleLabelLocator = new By.ByCssSelector("label[for='gender-radio-1']");
    private final By femaleLabelLocator = new By.ByCssSelector("label[for='gender-radio-2']");
    private final By otherLabelLocator = new By.ByCssSelector("label[for = 'gender-radio-3']");

    private final By maleButtonLocator =  By.id("gender-radio-1");
    private final By femaleButtonLocator =  By.id("gender-radio-2");
    private final By othersButtonLocator =  By.id("gender-radio-3");
    public enum Genders{MALE,FEMALE,OTHERS}
  public GenderSectionPage(WebDriver driver){

        super(driver);
  }

   public void clickButton(Genders genders){//if gender is a male find the male and click on it, make same to each

        switch (genders){
            case FEMALE:
            click(femaleButtonLocator);
               break;

            case MALE:
                click(maleButtonLocator);
                break;

            case OTHERS:
                click(otherLabelLocator);
                break;
        }

        }


   public boolean isButtonChecked(Genders genders){
        //It's checked whether the buttons are clicked
       boolean isChecked = false;
       switch (genders){
           case FEMALE:
           isChecked = isSelected(femaleButtonLocator);
;               break;
           case MALE:
               isChecked = isSelected(maleButtonLocator);
               break;
           case OTHERS:
               isChecked = isSelected(othersButtonLocator);
               break;
       }
      return isChecked;
  }

}
