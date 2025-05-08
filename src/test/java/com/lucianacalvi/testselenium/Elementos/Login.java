package Elementos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class Login {

    @FindBy(xpath = "//*[@id='MenuContent']/a[2]")
    WebElement btnInicioSesion;

    @FindBy(name = "username")
    WebElement usernameInput;

    @FindBy(xpath = "//*[@id='Catalog']/form/p[2]/input[2]")
    WebElement contraseniaInput;

    @FindBy(xpath = "//*[@id='Catalog']/form/input")
    WebElement btnLogin;

    @FindBy(xpath = "//*[@id='Content']/ul/li") // Asegurate de que este xpath sea correcto
    WebElement mensajeError;

    public Login(WebDriver driver) {
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 20), this);
    }

    public void inicioSesion(String username, String password) {
        btnInicioSesion.click();
        usernameInput.sendKeys(username);
        contraseniaInput.sendKeys(password);
        btnLogin.click();
    }

    public String msjNegativo() {
        return mensajeError.getText();
    }
}