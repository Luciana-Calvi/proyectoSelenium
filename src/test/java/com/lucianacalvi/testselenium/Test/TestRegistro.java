package com.lucianacalvi.testselenium;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;
import org.openqa.selenium.By;


import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.*;

import Elementos.Registro;
import Base.SetUp;

class TestRegistro extends SetUp {

    Registro registro;

    @Test
    public void registroPositivo() throws Exception {

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0)); // Desactiva espera implícita
        driver.manage().window().maximize(); // Asegura visibilidad


        try {
            registro = new Registro(driver);
            registro.irARegistroDesdeHome();
            registro.completarDatosCuenta("luciana89", "12345");
            registro.completarDatosPersonales("Luciana", "Pérez", "luciana@email.com", "2611234567");
            registro.completarDireccion("Calle falsa 123", "", "Mendoza", "MZA", "5500", "Argentina");
            registro.seleccionarCategoriaFavorita("DOGS");
            registro.enviarFormulario();

            // Esperar algo que indique que el registro fue exitoso
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
            wait.until(ExpectedConditions.urlContains("Account.action"));


            // También podés validar algún mensaje o elemento específico:
            // assertTrue(driver.findElement(By.id("bienvenida")).isDisplayed());

            System.out.println("Registro exitoso");
        } catch (Exception e) {
            System.out.println("No se pudo completar el registro.");
            fail("Excepción inesperada: " + e.getMessage());
        }
    }
}

