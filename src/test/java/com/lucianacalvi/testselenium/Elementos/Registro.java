package Elementos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class Registro{

    @FindBy(XPath = "//*[@id="MenuContent"]/a[2]")
    WebElement btnInicioSesion;

    @FindBy(XPath = "//*[@id="Catalog"]/a")
    WebElement btnRegistro;

    @FindBy(id = "stripes--763959668")
    WebElement userId;

    @FindBy(XPath = "//*[@id="Catalog"]/form/table[1]/tbody/tr[2]/td[2]/input")
    WebElement newPassword;

    @FindBy(XPath = "//*[@id="Catalog"]/form/table[1]/tbody/tr[3]/td[2]/input")
    WebElement repeatPassword;

    @FindBy(XPath = "//*[@id="Catalog"]/form/table[2]/tbody/tr[1]/td[2]/input")
    WebElement firstName;

    @FindBy(XPath = "//*[@id="Catalog"]/form/table[2]/tbody/tr[2]/td[2]/input")
    WebElement lastName;

    @FindBy(XPath = "//*[@id="Catalog"]/form/table[2]/tbody/tr[3]/td[2]/input")
    WebElement email;

    @FindBy(XPath = "//*[@id="Catalog"]/form/table[2]/tbody/tr[4]/td[2]/input")
    WebElement phone;

    @FindBy(XPath = "//*[@id="Catalog"]/form/table[2]/tbody/tr[5]/td[2]/input")
    WebElement addresUno;

    @FindBy(XPath = "//*[@id="Catalog"]/form/table[2]/tbody/tr[6]/td[2]/input")
    WebElement addresDos;

    @FindBy(XPath = "//*[@id="Catalog"]/form/table[2]/tbody/tr[7]/td[2]/input")
    WebElement city;

    @FindBy(XPath = "//*[@id="Catalog"]/form/table[2]/tbody/tr[8]/td[2]/input")
    WebElement state;

    @FindBy(XPath = "//*[@id="Catalog"]/form/table[2]/tbody/tr[9]/td[2]/input")
    WebElement zip;

    @FindBy(XPath = "//*[@id="Catalog"]/form/table[2]/tbody/tr[10]/td[2]/input")
    WebElement country;

    @FindBy(XPath = "//*[@id="Catalog"]/form/table[3]/tbody/tr[2]/td[2]/select")
    WebElement favouriteCategory;

    @FindBy(XPath = "//*[@id="Catalog"]/form/table[3]/tbody/tr[2]/td[2]/select/option[2]")
    WebElement dogs;

    @FindBy(XPath = "//*[@id="Catalog"]/form/input")
    WebElement saveAccountInformation;


    public Registro(WebDriver driver) {
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 20), this);
    }

    public void formularioRegistro(String id, String password, String name, String lastName, String mail, String phon, String direccionUno, String direccionDos, String ciudad, String estado, String codigoPostal, String country) {
        
        btnInicioSesion.click()
        btnRegistro.click()
        userId.sendKeys(id);
        newPassword.sendKeys(password);
        repeatPassword.sendKeys(password);
        firstName.sendKeys(name);
        lastName.sendKeys(lastName);
        email.sendKeys(mail);
        phone.sendKeys(phone);
        addresUno.sendKeys(direccionUno);
        addresDos.sendKeys(direccionDos);
        city.sendKeys(ciudad);
        state.sendKeys(estado);
        zip.sendKeys(codigoPostal);
        country.sendKeys(country);
        favouriteCategory.click();
        dogs.click();
        saveAccountInformation.click()
       
    }

    public String msjNegativo() {
        return mensajeError.getText();
    }

}