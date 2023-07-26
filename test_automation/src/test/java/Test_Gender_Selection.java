import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;


public class Test_Gender_Selection extends BaseTest{
    //It must have one or more than assertions at the end of each test method
    @Test
    public void check_male_button() throws InterruptedException{
        PracticeFormPage practiceFormPage = new PracticeFormPage(driver);
      practiceForm.genderSection().clickButton(GenderSectionPage.Genders.MALE);
        Assertions.assertTrue(practiceForm.genderSection().isButtonChecked(GenderSectionPage.Genders.MALE),
                "male button is checked");
        Thread.sleep(3000);
      //  driver = WebDriver.get(String);
    }
    @Test
    public void check_female_button() throws InterruptedException{
        PracticeFormPage practiceFormPage = new PracticeFormPage(driver);
        practiceForm.genderSection().clickButton(GenderSectionPage.Genders.FEMALE);
        Assertions.assertTrue(practiceForm.genderSection().isButtonChecked(GenderSectionPage.Genders.FEMALE) ,
                "female button is checked");
        Thread.sleep(3000);

    }
    @Test
    public void check_other_button() throws InterruptedException{
        PracticeFormPage practiceFormPage = new PracticeFormPage(driver);
        practiceForm.genderSection().clickButton(GenderSectionPage.Genders.OTHERS);
        Assertions.assertTrue(practiceForm.genderSection().isButtonChecked(GenderSectionPage.Genders.OTHERS),
                "others button is checked");
        Thread.sleep(3000);
    }
}
