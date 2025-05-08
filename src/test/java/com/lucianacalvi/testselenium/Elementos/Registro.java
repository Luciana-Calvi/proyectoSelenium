package Elementos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class Registro {

    @FindBy(xpath = "//*[@id='MenuContent']/a[2]")
    WebElement btnInicioSesion;

    @FindBy(xpath = "//*[@id='Catalog']/a")
    WebElement btnRegistro;

    @FindBy(id = "stripes--763959668")
    WebElement userId;

    @FindBy(xpath = "//*[@id='Catalog']/form/table[1]/tbody/tr[2]/td[2]/input")
    WebElement newPassword;

    @FindBy(xpath = "//*[@id='Catalog']/form/table[1]/tbody/tr[3]/td[2]/input")
    WebElement repeatPassword;

    @FindBy(xpath = "//*[@id='Catalog']/form/table[2]/tbody/tr[1]/td[2]/input")
    WebElement firstName;

    @FindBy(xpath = "//*[@id='Catalog']/form/table[2]/tbody/tr[2]/td[2]/input")
    WebElement lastName;

    @FindBy(xpath = "//*[@id='Catalog']/form/table[2]/tbody/tr[3]/td[2]/input")
    WebElement email;

    @FindBy(xpath = "//*[@id='Catalog']/form/table[2]/tbody/tr[4]/td[2]/input")
    WebElement phone;

    @FindBy(xpath = "//*[@id='Catalog']/form/table[2]/tbody/tr[5]/td[2]/input")
    WebElement addressUno;

    @FindBy(xpath = "//*[@id='Catalog']/form/table[2]/tbody/tr[6]/td[2]/input")
    WebElement addressDos;

    @FindBy(xpath = "//*[@id='Catalog']/form/table[2]/tbody/tr[7]/td[2]/input")
    WebElement city;

    @FindBy(xpath = "//*[@id='Catalog']/form/table[2]/tbody/tr[8]/td[2]/input")
    WebElement state;

    @FindBy(xpath = "//*[@id='Catalog']/form/table[2]/tbody/tr[9]/td[2]/input")
    WebElement zip;

    @FindBy(xpath = "//*[@id='Catalog']/form/table[2]/tbody/tr[10]/td[2]/input")
    WebElement country;

    @FindBy(xpath = "//*[@id='Catalog']/form/table[3]/tbody/tr[2]/td[2]/select")
    WebElement favouriteCategory;

    @FindBy(xpath = "//*[@id='Catalog']/form/table[3]/tbody/tr[2]/td[2]/select/option[2]")
    WebElement dogs;

    @FindBy(xpath = "//*[@id='Catalog']/form/input")
    WebElement saveAccountInformation;

    @FindBy(xpath = "//*[@id='mensajeError']") // Ajustá el XPath según tu HTML
    WebElement mensajeError;

    public Registro(WebDriver driver) {
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 20), this);
    }

    public void formularioRegistro(String id, String password, String nombre, String apellido, String correo, String telefono, String direccionUno, String direccionDos, String ciudad, String estado, String codigoPostal, String pais) {
        btnInicioSesion.click();
        btnRegistro.click();
        userId.sendKeys(id);
        newPassword.sendKeys(password);
        repeatPassword.sendKeys(password);
        firstName.sendKeys(nombre);
        lastName.sendKeys(apellido);
        email.sendKeys(correo);
        phone.sendKeys(telefono);
        addressUno.sendKeys(direccionUno);
        addressDos.sendKeys(direccionDos);
        city.sendKeys(ciudad);
        state.sendKeys(estado);
        zip.sendKeys(codigoPostal);
        country.sendKeys(pais);
        favouriteCategory.click();
        dogs.click();
        saveAccountInformation.click();
    }

    public String msjNegativo() {
        return mensajeError.getText();
    }
}
