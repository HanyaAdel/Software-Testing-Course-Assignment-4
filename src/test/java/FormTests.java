import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.ConfirmationPage;
import pages.FormPage;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class FormTests extends BaseTests{



    @Test
    public void testSuccessfulSubmission1(){
        FormPage formPage = homepage.clickFormLink();
        formPage.setFirstNameField("Hanya");
        formPage.setLastNameField("Adel");
        formPage.setJobTitleField("Student");
        formPage.selectCollege();
        formPage.selectGradSchool();
        formPage.selectHighSchool();
        formPage.selectYearsOfExp("0-1");
        ConfirmationPage confirmationPage = formPage.clickSubmitBtn();
        assertEquals("The form was successfully submitted!",confirmationPage.getAlertText());

    }
    @Test
    public void testSuccessfulSubmission2(){
        FormPage formPage;
        formPage = homepage.clickFormLink();
        formPage.setFirstNameField("Hanya");
        formPage.setJobTitleField("Student");
        formPage.selectCollege();
        formPage.selectHighSchool();
        formPage.selectFemaleBox();
        formPage.selectYearsOfExp("0-1");
        ConfirmationPage confirmationPage = formPage.clickSubmitBtn();
        assertEquals("The form was successfully submitted!",confirmationPage.getAlertText());

    }
    @Test
    public void testSuccessfulSubmission3(){
        FormPage formPage;
        formPage = homepage.clickFormLink();
        formPage.setFirstNameField("Hanya");
        formPage.setJobTitleField("Student");
        formPage.selectCollege();
        formPage.selectHighSchool();
        formPage.selectFemaleBox();
        formPage.selectYearsOfExp("10+");
        ConfirmationPage confirmationPage = formPage.clickSubmitBtn();
        assertEquals("The form was successfully submitted!",confirmationPage.getAlertText());

    }
    @Test
    public void testSuccessfulSubmission4(){
        FormPage formPage;
        formPage = homepage.clickFormLink();
        formPage.setFirstNameField("Hanya");
        formPage.setJobTitleField("Student");
        formPage.selectCollege();
        formPage.selectHighSchool();
        formPage.selectFemaleBox();
        formPage.selectYearsOfExp("10+");
        ConfirmationPage confirmationPage = formPage.clickSubmitBtn();
        assertEquals("The form was successfully submitted!",confirmationPage.getAlertText());

    }
    @AfterEach
    public void back(){
        ex();
    }
}
