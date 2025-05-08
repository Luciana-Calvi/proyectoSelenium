package com.lucianacalvi.testselenium;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;
import org.openqa.selenium.By;




import static org.junit.jupiter.api.Assertions.*;

import Elementos.Login;
import Base.SetUp;
import Base.Evidencias;


class TestLogin extends SetUp {

    Login usuario;
    Evidencias evidencias;

    @Test
    public void loginPositivo() throws Exception {

        try {
            usuario = new Login(driver);
            usuario.inicioSesion("Luciana", "123456");

        } catch (Exception e) {
            System.out.println("No pudo iniciar sesion");
            fail("Excepción inesperada: " + e.getMessage());
        }
    }

    @Test
    public void loginNegativo() throws Exception {
    
        evidencias = new Evidencias();
        usuario = new Login(driver);
    
        usuario.inicioSesion("pepe", "123456");
    
        // Guardar captura sin importar si falla o no
        evidencias.tomarEvidencia(driver, "caso de prueba negativa");
    
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Content']/ul/li")));

        System.out.println("Mensaje recibido: '" + usuario.msjNegativo() + "'");
    
    
        assertEquals("Invalid username or password. Signon failed.",
                     usuario.msjNegativo(),
                     "El mensaje de error no es el esperado.");
    }
}