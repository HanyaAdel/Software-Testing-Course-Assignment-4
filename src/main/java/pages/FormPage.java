package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;

public class FormPage {
    private WebDriver driver;

    private By firstNameField = By.id("first-name");
    private By lastNameField = By.id("last-name");
    private By jobTitleField = By.id("job-title");

    private By highSchoolRadioBtn = By.id("radio-button-1");
    private By collegeRadioBtn = By.id("radio-button-2");
    private By gradSchoolRadioBtn = By.id("radio-button-3");

    private By maleCheckBox = By.id("checkbox-1");
    private By femaleCheckBox = By.id("checkbox-2");
    private By notSayingCheckBox = By.id("checkbox-3");


    Select yearsOfExp;

    private By submitBtn = By.linkText("Submit");


    public FormPage(WebDriver driver){
        this.driver = driver;
        WebDriverWait wait = new WebDriverWait(driver, 4000);
        wait.until(ExpectedConditions.visibilityOfElementLocated((By.id("select-menu"))));
        yearsOfExp = new Select(driver.findElement(By.id("select-menu")));
    }

    public void setFirstNameField(String firstName){
        WebDriverWait wait = new WebDriverWait(driver, 4000);
        wait.until(ExpectedConditions.visibilityOfElementLocated((By.id("first-name"))));
        driver.findElement(firstNameField).sendKeys(firstName);
    }
    public void setLastNameField(String lastName){
        driver.findElement(lastNameField).sendKeys(lastName);
    }
    public void setJobTitleField(String jobTitle){
        driver.findElement(jobTitleField).sendKeys(jobTitle);
    }
    public void selectGradSchool(){
        driver.findElement(gradSchoolRadioBtn).click();
    }
    public void selectHighSchool( ){
        driver.findElement(highSchoolRadioBtn).click();
    }
    public void selectCollege(){
        driver.findElement(collegeRadioBtn).click();
    }
    public void selectMaleBox(){
        driver.findElement(maleCheckBox).click();
    }
    public void selectFemaleBox(){
        driver.findElement(femaleCheckBox).click();
    }
    public void selectNotSayingBox(){
        driver.findElement(notSayingCheckBox).click();
    }
    public void selectYearsOfExp(String choice){
        yearsOfExp.selectByVisibleText(choice);
    }

    public ConfirmationPage clickSubmitBtn(){
        driver.findElement(submitBtn).click();
        return new ConfirmationPage(driver);

    }



}
