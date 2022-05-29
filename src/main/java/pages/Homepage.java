package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Homepage {
    private WebDriver driver;


    private By formLink = By.linkText("Form");

    public Homepage(WebDriver driver){
        this.driver = driver;
    }

    public FormPage clickFormLink(){
        driver.findElement(formLink).click();
        return new FormPage(driver);

    }
}
