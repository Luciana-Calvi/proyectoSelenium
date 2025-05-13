package Elementos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.Select;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;


public class Registro {

    @FindBy(xpath = "//*[@id='MenuContent']/a[2]") 
    WebElement btnInicioSesion;

    @FindBy(xpath = "//*[@id='Catalog']/a")
    WebElement btnRegistro;

    @FindBy(name = "username")
    WebElement userId;

    @FindBy(name = "password")
    WebElement newPassword;

    @FindBy(name = "repeatedPassword")
    WebElement repeatPassword;

    @FindBy(name = "account.firstName")
    WebElement firstName;

    @FindBy(name = "account.lastName")
    WebElement lastName;

    @FindBy(name = "account.email")
    WebElement email;

    @FindBy(name = "account.phone")
    WebElement phone;

    @FindBy(name = "account.address1")
    WebElement addressUno;

    @FindBy(name = "account.address2")
    WebElement addressDos;

    @FindBy(name = "account.city")
    WebElement city;

    @FindBy(name = "account.state")
    WebElement state;

    @FindBy(name = "account.zip")
    WebElement zip;

    @FindBy(name = "account.country")
    WebElement country;

    @FindBy(xpath = "//*[@id='Catalog']/form/table[3]/tbody/tr[2]/td[2]/select")
    WebElement favouriteCategory;

    @FindBy(xpath = "//*[@id='Catalog']/form/table[3]/tbody/tr[2]/td[2]/select/option[2]")
    WebElement dogs;

    @FindBy(xpath = "//*[@id='Catalog']/form/input")
    WebElement saveAccountInformation;

    @FindBy(xpath = "//*[@id='mensajeError']")
    WebElement mensajeError;


    private WebDriver driver;

    public Registro(WebDriver driver) {
    this.driver = driver;  // <-- Esto te resuelve los errores del tipo "cannot find symbol: driver"
    PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
    }


    public void irARegistroDesdeHome() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(btnInicioSesion)).click();
        wait.until(ExpectedConditions.elementToBeClickable(btnRegistro)).click();
    }


    public void completarDatosCuenta(String id, String password) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(userId)).sendKeys(id);
        wait.until(ExpectedConditions.visibilityOf(newPassword)).sendKeys(password);
        wait.until(ExpectedConditions.visibilityOf(repeatPassword)).sendKeys(password);
}

    public void completarDatosPersonales(String nombre, String apellido, String correo, String telefono) {
        firstName.sendKeys(nombre);
        lastName.sendKeys(apellido);
        email.sendKeys(correo);
        phone.sendKeys(telefono);
    }

    public void completarDireccion(String direccionUno, String direccionDos, String ciudad, String estado, String zipCode, String pais) {
        addressUno.sendKeys(direccionUno);
        addressDos.sendKeys(direccionDos);
        city.sendKeys(ciudad);
        state.sendKeys(estado);
        zip.sendKeys(zipCode);
        country.sendKeys(pais);
    }

    public void seleccionarCategoriaFavorita(String categoriaVisibleText) {
        new Select(favouriteCategory).selectByVisibleText(categoriaVisibleText);
    }

    public void enviarFormulario() {
        saveAccountInformation.click();
    }

    public String obtenerMensajeDeError() {
        try {
            return mensajeError.getText();
        } catch (NoSuchElementException e) {
            return "No se encontró el mensaje de error.";
        }
    }

    // Método completo para llenar todos los datos del formulario de una sola vez
    public void completarFormulario(
        String id, String password, String nombre, String apellido, String correo, String telefono,
        String direccionUno, String direccionDos, String ciudad, String estado, String zipCode, String pais,
        String categoria
    ) {
        completarDatosCuenta(id, password);
        completarDatosPersonales(nombre, apellido, correo, telefono);
        completarDireccion(direccionUno, direccionDos, ciudad, estado, zipCode, pais);
        seleccionarCategoriaFavorita(categoria);
    }
}

