package com.lucianacalvi.testselenium;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

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
}