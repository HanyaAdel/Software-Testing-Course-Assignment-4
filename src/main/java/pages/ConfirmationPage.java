package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ConfirmationPage {

    private WebDriver driver;
    private By alert;

    public ConfirmationPage(WebDriver driver){
        this.driver = driver;
        WebDriverWait wait = new WebDriverWait(driver, 4000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".alert.alert-success")));
        alert = By.cssSelector(".alert.alert-success");
    }

    public String getAlertText(){
        return driver.findElement(alert).getText();

    }
}
