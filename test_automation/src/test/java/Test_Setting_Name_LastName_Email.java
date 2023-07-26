import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_Setting_Name_LastName_Email extends BaseTest {

// PracticeForm practiceForm = new PracticeForm(driver);
    @Test
    public void setName() throws InterruptedException {
        PracticeFormPage practiceFormPage = new PracticeFormPage(driver);
        practiceForm.setName("Aslı");
        Assertions.assertEquals("Aslı",practiceForm.getName(),"Name is not correct!");
        Thread.sleep(3000);
       /*The first parameter is the expected one,the second parameter is the value we give ourselves.
        Along with these, the third parameter checks whether the expected and actual parameter are the same and
        appropriately prints a message to console.
        */

        //System.out.println("test1");

    }
   @Test
    public void setLastName() throws InterruptedException{
        PracticeFormPage practiceFormPage = new PracticeFormPage(driver);
        practiceForm.setLastName("Güngör");
        Assertions.assertEquals("Güngör",practiceForm.getLastName(),"Last Name is not correct");
        Thread.sleep(3000);
       // System.out.println("test2");

   }

    @Test
    public void setEmail() throws InterruptedException{
        PracticeFormPage practiceFormPage = new PracticeFormPage(driver);
        practiceForm.setEmail("asligungorr4@gmail.com");
        Assertions.assertEquals("asligungorr4@gmail.com",practiceForm.getEmail(),"Email is not correct");
        Thread.sleep(3000);
        //System.out.println("test3");

    }



    }

